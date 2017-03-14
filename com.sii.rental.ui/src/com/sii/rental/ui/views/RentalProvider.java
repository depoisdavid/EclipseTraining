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
	}
	

	
}
