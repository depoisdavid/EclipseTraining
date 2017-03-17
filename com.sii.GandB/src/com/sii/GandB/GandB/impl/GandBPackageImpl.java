/**
 */
package com.sii.GandB.GandB.impl;

import com.sii.GandB.GandB.Bar;
import com.sii.GandB.GandB.Boisson;
import com.sii.GandB.GandB.GandBFactory;
import com.sii.GandB.GandB.GandBPackage;
import com.sii.GandB.GandB.JeuxVideo;
import com.sii.GandB.GandB.Menu;
import com.sii.GandB.GandB.Nourriture;

import com.sii.GandB.GandB.util.GandBValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GandBPackageImpl extends EPackageImpl implements GandBPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nourritureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boissonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jeuxVideoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.sii.GandB.GandB.GandBPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GandBPackageImpl() {
		super(eNS_URI, GandBFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GandBPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GandBPackage init() {
		if (isInited) return (GandBPackage)EPackage.Registry.INSTANCE.getEPackage(GandBPackage.eNS_URI);

		// Obtain or create and register package
		GandBPackageImpl theGandBPackage = (GandBPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GandBPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GandBPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGandBPackage.createPackageContents();

		// Initialize created meta-data
		theGandBPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGandBPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GandBValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGandBPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GandBPackage.eNS_URI, theGandBPackage);
		return theGandBPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBar() {
		return barEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBar_Name() {
		return (EAttribute)barEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBar_NbreEmployee() {
		return (EAttribute)barEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBar_Jeuxvideos() {
		return (EReference)barEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBar_Customer() {
		return (EAttribute)barEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBar_Nourritures() {
		return (EReference)barEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBar_Boissons() {
		return (EReference)barEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBar_Menus() {
		return (EReference)barEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNourriture() {
		return nourritureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNourriture_Name() {
		return (EAttribute)nourritureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNourriture_Price() {
		return (EAttribute)nourritureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNourriture_NumberStock() {
		return (EAttribute)nourritureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoisson() {
		return boissonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoisson_Name() {
		return (EAttribute)boissonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoisson_Price() {
		return (EAttribute)boissonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoisson_NumberStock() {
		return (EAttribute)boissonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJeuxVideo() {
		return jeuxVideoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJeuxVideo_Name() {
		return (EAttribute)jeuxVideoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJeuxVideo_Support() {
		return (EAttribute)jeuxVideoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJeuxVideo_StartTime() {
		return (EAttribute)jeuxVideoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJeuxVideo_EndTime() {
		return (EAttribute)jeuxVideoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJeuxVideo_CustomerRequired() {
		return (EAttribute)jeuxVideoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_Price() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Plats() {
		return (EReference)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Boisson() {
		return (EReference)menuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GandBFactory getGandBFactory() {
		return (GandBFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		barEClass = createEClass(BAR);
		createEAttribute(barEClass, BAR__NAME);
		createEAttribute(barEClass, BAR__NBRE_EMPLOYEE);
		createEReference(barEClass, BAR__JEUXVIDEOS);
		createEAttribute(barEClass, BAR__CUSTOMER);
		createEReference(barEClass, BAR__NOURRITURES);
		createEReference(barEClass, BAR__BOISSONS);
		createEReference(barEClass, BAR__MENUS);

		nourritureEClass = createEClass(NOURRITURE);
		createEAttribute(nourritureEClass, NOURRITURE__NAME);
		createEAttribute(nourritureEClass, NOURRITURE__PRICE);
		createEAttribute(nourritureEClass, NOURRITURE__NUMBER_STOCK);

		boissonEClass = createEClass(BOISSON);
		createEAttribute(boissonEClass, BOISSON__NAME);
		createEAttribute(boissonEClass, BOISSON__PRICE);
		createEAttribute(boissonEClass, BOISSON__NUMBER_STOCK);

		jeuxVideoEClass = createEClass(JEUX_VIDEO);
		createEAttribute(jeuxVideoEClass, JEUX_VIDEO__NAME);
		createEAttribute(jeuxVideoEClass, JEUX_VIDEO__SUPPORT);
		createEAttribute(jeuxVideoEClass, JEUX_VIDEO__START_TIME);
		createEAttribute(jeuxVideoEClass, JEUX_VIDEO__END_TIME);
		createEAttribute(jeuxVideoEClass, JEUX_VIDEO__CUSTOMER_REQUIRED);

		menuEClass = createEClass(MENU);
		createEAttribute(menuEClass, MENU__PRICE);
		createEReference(menuEClass, MENU__PLATS);
		createEReference(menuEClass, MENU__BOISSON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBar_Name(), theXMLTypePackage.getString(), "Name", null, 0, 1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBar_NbreEmployee(), theXMLTypePackage.getInt(), "NbreEmployee", null, 0, 1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBar_Jeuxvideos(), this.getJeuxVideo(), null, "jeuxvideos", null, 0, -1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBar_Customer(), theXMLTypePackage.getInt(), "Customer", null, 0, 1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBar_Nourritures(), this.getNourriture(), null, "nourritures", null, 0, -1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBar_Boissons(), this.getBoisson(), null, "boissons", null, 0, -1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBar_Menus(), this.getMenu(), null, "menus", null, 0, -1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nourritureEClass, Nourriture.class, "Nourriture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNourriture_Name(), theXMLTypePackage.getString(), "Name", null, 0, 1, Nourriture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNourriture_Price(), theXMLTypePackage.getInt(), "Price", null, 0, 1, Nourriture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNourriture_NumberStock(), theXMLTypePackage.getInt(), "NumberStock", null, 0, 1, Nourriture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boissonEClass, Boisson.class, "Boisson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoisson_Name(), theXMLTypePackage.getString(), "Name", null, 0, 1, Boisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoisson_Price(), theXMLTypePackage.getInt(), "Price", null, 0, 1, Boisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoisson_NumberStock(), theXMLTypePackage.getInt(), "NumberStock", null, 0, 1, Boisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jeuxVideoEClass, JeuxVideo.class, "JeuxVideo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJeuxVideo_Name(), theXMLTypePackage.getString(), "Name", null, 0, 1, JeuxVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJeuxVideo_Support(), theXMLTypePackage.getString(), "Support", null, 0, 1, JeuxVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJeuxVideo_StartTime(), theXMLTypePackage.getDateTime(), "StartTime", null, 0, 1, JeuxVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJeuxVideo_EndTime(), theXMLTypePackage.getDateTime(), "EndTime", null, 0, 1, JeuxVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJeuxVideo_CustomerRequired(), theXMLTypePackage.getInt(), "CustomerRequired", null, 0, 1, JeuxVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenu_Price(), theXMLTypePackage.getInt(), "Price", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_Plats(), this.getNourriture(), null, "plats", null, 0, 3, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_Boisson(), this.getBoisson(), null, "boisson", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (nourritureEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkName"
		   });
	}

} //GandBPackageImpl
