package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.ui.RentalUIConstants;

public class RentalAgencies implements RentalUIConstants{
	
	@Inject
	private ESelectionService selectionSevervice;
	
	private TreeViewer tv;
	
	
	
	@PostConstruct
	public void CreateTreeViewer(Composite parent, RentalAgency a, IEclipseContext context, EMenuService menu) {
		
		tv = new TreeViewer(parent);
		
		RentalProvider provider = ContextInjectionFactory.make(RentalProvider.class, context);
		tv.setContentProvider(provider);
		
		tv.setLabelProvider(provider);
		
		Collection<RentalAgency> agencies = new ArrayList<>();
		agencies.add(a);
		tv.setInput(agencies);
		
		tv.expandAll();
		
		provideSelection();
		
		menu.registerContextMenu(tv.getControl(), MENU_ID);
	}	
	
	private void provideSelection()
	{
		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) 
			{
				IStructuredSelection sel =(IStructuredSelection) event.getSelection();
				
				selectionSevervice.setSelection(sel.size() == 1 ? sel.getFirstElement(): sel.toArray());
				
			}
		});
	}
	
	@Inject
	public void refreshTree (@Preference(value=PREF_CUSTOMER_COLOR) String custCol, 
			@Preference(value=PREF_RENTAL_COLOR) String rk, 
			@Preference(value=PREF_RENTAL_OBJECT_COLOR) String rok,
			@Preference(value=PREF_PALETTE) String rgk)
	{
		if(tv!= null && ! tv.getControl().isDisposed())
		{
			tv.refresh();
		}
		
	}
}
