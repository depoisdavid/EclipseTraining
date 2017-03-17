/**
 */
package com.sii.GandB.GandB.impl;

import com.sii.GandB.GandB.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GandBFactoryImpl extends EFactoryImpl implements GandBFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GandBFactory init() {
		try {
			GandBFactory theGandBFactory = (GandBFactory)EPackage.Registry.INSTANCE.getEFactory(GandBPackage.eNS_URI);
			if (theGandBFactory != null) {
				return theGandBFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GandBFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GandBFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GandBPackage.BAR: return createBar();
			case GandBPackage.NOURRITURE: return createNourriture();
			case GandBPackage.BOISSON: return createBoisson();
			case GandBPackage.JEUX_VIDEO: return createJeuxVideo();
			case GandBPackage.MENU: return createMenu();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar createBar() {
		BarImpl bar = new BarImpl();
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nourriture createNourriture() {
		NourritureImpl nourriture = new NourritureImpl();
		return nourriture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boisson createBoisson() {
		BoissonImpl boisson = new BoissonImpl();
		return boisson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JeuxVideo createJeuxVideo() {
		JeuxVideoImpl jeuxVideo = new JeuxVideoImpl();
		return jeuxVideo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GandBPackage getGandBPackage() {
		return (GandBPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GandBPackage getPackage() {
		return GandBPackage.eINSTANCE;
	}

} //GandBFactoryImpl
