package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;

public class RentalAgencies {
	
	@PostConstruct
	public void CreateTreeViewer(Composite parent, RentalAgency a) {
		
		TreeViewer tv = new TreeViewer(parent);
		
		RentalProvider provider = new RentalProvider();
		tv.setContentProvider(provider);
		
		tv.setLabelProvider(provider);
		
		Collection<RentalAgency> agencies = new ArrayList<>();
		agencies.add(a);
		tv.setInput(agencies);
	}	

}
