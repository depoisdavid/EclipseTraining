
package com.sii.rental.ui.views;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class RentalPart {

	private Label rentedObjectLabel;
	private Label customerLabel;
	private Label lblNewLabel;
	private Label lblNewLabel_1;
	private Label lblNewLabel_2;
	private Label lblNewLabel_3;
	private Group dateGroup;
	
	@Inject 
	private ESelectionService ss;
	

	@PostConstruct
	public void CreateIHM(Composite parent, RentalAgency a) {
		parent.setLayout(new GridLayout(1, false));
		
		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setText("information");
		infoGroup.setLayout(new GridLayout(1, false));
		
		rentedObjectLabel =new Label(infoGroup, SWT.BORDER);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		rentedObjectLabel.setLayoutData(gd);
		
		rentedObjectLabel.setText("toto");
		
		customerLabel =new Label(infoGroup, SWT.BORDER);
		customerLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		customerLabel.setText("Loué à:");
		
		dateGroup = new Group(parent, SWT.NONE);
		dateGroup.setText("Dates de location");
		dateGroup.setLayout(new GridLayout(2, false));
		
		lblNewLabel = new Label(dateGroup, SWT.NONE);
		lblNewLabel.setText("Du:");
		
		lblNewLabel_2 = new Label(dateGroup, SWT.NONE);
		lblNewLabel_2.setText("New Label");
		
		lblNewLabel_1 = new Label(dateGroup, SWT.NONE);
		lblNewLabel_1.setText("au :");
		
		lblNewLabel_3 = new Label(dateGroup, SWT.NONE);
		lblNewLabel_3.setText("New Label");
	
		
		
		setRental(a.getRentals().get(0));
	}
	
	public void setRental( Rental r)
	{
		customerLabel.setText(r.getCustomer().getDisplayName());
		rentedObjectLabel.setText(r.getRentedObject().getName());
		lblNewLabel_2.setText(r.getStartDate().toString());
		lblNewLabel_3.setText(r.getEndDate().toString());
	}

	@Focus
	public void onFocus() {
		
	}
}