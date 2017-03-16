package com.sii.rental.ui.views;

import java.util.Collection;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.Palette;
import com.sii.rental.ui.RentalUIConstants;

public class RentalProvider extends LabelProvider implements ITreeContentProvider, IColorProvider, IFontProvider, RentalUIConstants  {

	private static final Object[] EMPTY_RESULT = new Object[0];
	private IPreferenceStore pref = new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.sii.rental.ui");;
	
	@Override
	public Object[] getElements(Object inputElement) {
		// TODO Auto-generated method stub
		Object[] result = null;
		
		if (inputElement instanceof Collection<?>)
			return ((Collection<?>) inputElement).toArray();
		
		return (result == null) ? EMPTY_RESULT : result;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		
		if (parentElement instanceof RentalAgency) 
		{
			RentalAgency a = (RentalAgency) parentElement;
			return new Node[] { new Node(Node.CUSTOMERS, a),
					new Node(Node.RENTAL, a),
					new Node(Node.OBJECTS, a),
					};	
		}
		else if (parentElement instanceof Node)
		{
			return ((Node)parentElement).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return element instanceof RentalAgency || element instanceof Node;
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof RentalAgency)
			return ((RentalAgency) element).getName();
		else if (element instanceof Customer)
			return ((Customer) element).getDisplayName();
		else if (element instanceof RentalObject)
			return ((RentalObject) element).getName();
		
		return super.getText(element);
	}
	
	public class Node {
		
		public static final String CUSTOMERS = "Customers";
		public static final String RENTAL = "Rental";
		public static final String OBJECTS = "Objects";

		private String title;
		private RentalAgency a;
		
		public Node(String title, RentalAgency a) {
			super();
			this.title = title;
			this.a = a;
		}
		
		public Object[] getChildren()
		{
			if (title == CUSTOMERS)
				return a.getCustomers().toArray();
			else if (title == RENTAL)
				return a.getRentals().toArray();
			else if (title == OBJECTS)
				return a.getObjectsToRent().toArray();
			
			return null;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return title;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((a == null) ? 0 : a.hashCode());
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (a == null) {
				if (other.a != null)
					return false;
			} else if (!a.equals(other.a))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}

		private RentalProvider getOuterType() {
			return RentalProvider.this;
		}
	}
	



	@Override
	public Font getFont(Object element) {
		return null;
	}
	
	private Color getAColor(String rgbkey)
	{
		ColorRegistry colorRegistry = JFaceResources.getColorRegistry();
		
		Color col = colorRegistry.get(rgbkey);
		
		if(col ==null)
		{
			colorRegistry.put(rgbkey, StringConverter.asRGB(rgbkey));
			col = colorRegistry.get(rgbkey);
		}
		
		return col;
	}

	@Override
	public Color getForeground (Object element) {
		
		String pId = pref.getString(PREF_PALETTE);
		Palette p = pmanager.get(pId);
		return p.getProvider().getForeground(element);
		
	}

	@Override
	public Color getBackground(Object element) {
		return Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
	}	
	
	@Inject @Named(RENTAL_UI_IMG_REGISTRY)
	private ImageRegistry registry;
	
	@Inject @Named(PALETTE_MANAGER)
	private Map<String, Palette> pmanager;
	
	@Override
	public Image getImage(Object element) {
			return registry.get(IMG_CUSTOMER);
	}
}
