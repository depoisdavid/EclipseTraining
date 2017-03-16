package com.sii.rental.ui;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.core.RentalCoreActivator;

public class RentalAddOn implements RentalUIConstants {

	private Map<String, Palette> paletteManager = new HashMap<>();

	@PostConstruct
	public void initContext(IEclipseContext ctx) {
		ctx.set(RentalAgency.class, RentalCoreActivator.getAgency());
		ctx.set(RENTAL_UI_IMG_REGISTRY, getLocalImageRegistry());
		ctx.set(PALETTE_MANAGER, paletteManager);
	}

	ImageRegistry getLocalImageRegistry() {
		Bundle b = FrameworkUtil.getBundle(getClass());

		ImageRegistry reg = new ImageRegistry();

		reg.put(IMG_CUSTOMER, ImageDescriptor.createFromURL(b.getEntry(IMG_CUSTOMER)));
		reg.put(IMG_RENTAL, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL)));
		reg.put(IMG_RENTAL_OBJECT, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL_OBJECT)));
		reg.put(IMG_AGENCY, ImageDescriptor.createFromURL(b.getEntry(IMG_AGENCY)));

		return reg;
	}

	@Inject
	@Optional
	public void reactOnRentalEvent(@UIEventTopic("copy/Customer") Customer c) {
		System.out.println(c.getDisplayName());
	}

	@Inject
	public void getExtension(IExtensionRegistry reg) {
		IExtensionPoint extp = reg.getExtensionPoint("com.sii.rental.ui.palette");
		IExtension[] extensions = extp.getExtensions();

		for (IExtension ext : extensions) {
			for (IConfigurationElement elt : ext.getConfigurationElements()) {
				if (elt.getName().equals("palette")) {
					try 
					{
						Palette p = new Palette();
						p.setId(elt.getAttribute("id"));
						p.setName(elt.getAttribute("name"));
						p.setProvider((IColorProvider) elt.createExecutableExtension("paletteClass"));

						paletteManager.put(p.getId(), p);
						System.out.println("in palette : " + elt.getNamespaceIdentifier() + " " + elt.getAttribute("id"));
					} catch (InvalidRegistryObjectException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
