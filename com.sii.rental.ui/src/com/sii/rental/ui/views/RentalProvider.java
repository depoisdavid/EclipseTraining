package com.sii.rental.ui.views;

import java.util.Collection;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;

public class RentalProvider extends LabelProvider implements ITreeContentProvider  {

	private static final Object[] EMPTY_RESULT = new Object[0];
	
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
			return ((RentalAgency) parentElement).getCustomers().toArray();
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof RentalAgency)
			return ((RentalAgency) element).getName();
		else if (element instanceof Customer)
			return ((Customer) element).getDisplayName();
		
		return super.getText(element);
	}
	

	
}
