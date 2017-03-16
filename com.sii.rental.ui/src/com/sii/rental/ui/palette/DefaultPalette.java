package com.sii.rental.ui.palette;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.RentalUIConstants;

public class DefaultPalette implements IColorProvider, RentalUIConstants {

	private IPreferenceStore pref = new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.sii.rental.ui");;
	
	public DefaultPalette() {
		// TODO Auto-generated constructor stub
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
		if (element instanceof Customer)
			return getAColor(pref.getString(PREF_CUSTOMER_COLOR));
		if (element instanceof Rental)
			return getAColor(pref.getString(PREF_RENTAL_COLOR));
		if (element instanceof RentalObject)
			return getAColor(pref.getString(PREF_RENTAL_OBJECT_COLOR));
		return null;
	}

	@Override
	public Color getBackground(Object element) {
		return Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
	}	

}
