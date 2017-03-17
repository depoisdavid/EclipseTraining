/**
 */
package com.sii.GandB.GandB;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sii.GandB.GandB.GandBFactory
 * @model kind="package"
 * @generated
 */
public interface GandBPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GandB";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.sii/GandB/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GandB";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GandBPackage eINSTANCE = com.sii.GandB.GandB.impl.GandBPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.sii.GandB.GandB.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.GandB.GandB.impl.BarImpl
	 * @see com.sii.GandB.GandB.impl.GandBPackageImpl#getBar()
	 * @generated
	 */
	int BAR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nbre Employee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__NBRE_EMPLOYEE = 1;

	/**
	 * The feature id for the '<em><b>Jeuxvideos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__JEUXVIDEOS = 2;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__CUSTOMER = 3;

	/**
	 * The feature id for the '<em><b>Nourritures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__NOURRITURES = 4;

	/**
	 * The feature id for the '<em><b>Boissons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__BOISSONS = 5;

	/**
	 * The feature id for the '<em><b>Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__MENUS = 6;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.GandB.GandB.impl.NourritureImpl <em>Nourriture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.GandB.GandB.impl.NourritureImpl
	 * @see com.sii.GandB.GandB.impl.GandBPackageImpl#getNourriture()
	 * @generated
	 */
	int NOURRITURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOURRITURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOURRITURE__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Number Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOURRITURE__NUMBER_STOCK = 2;

	/**
	 * The number of structural features of the '<em>Nourriture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOURRITURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Nourriture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOURRITURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.GandB.GandB.impl.BoissonImpl <em>Boisson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.GandB.GandB.impl.BoissonImpl
	 * @see com.sii.GandB.GandB.impl.GandBPackageImpl#getBoisson()
	 * @generated
	 */
	int BOISSON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOISSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOISSON__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Number Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOISSON__NUMBER_STOCK = 2;

	/**
	 * The number of structural features of the '<em>Boisson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOISSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boisson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOISSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.GandB.GandB.impl.JeuxVideoImpl <em>Jeux Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.GandB.GandB.impl.JeuxVideoImpl
	 * @see com.sii.GandB.GandB.impl.GandBPackageImpl#getJeuxVideo()
	 * @generated
	 */
	int JEUX_VIDEO = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEUX_VIDEO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEUX_VIDEO__SUPPORT = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEUX_VIDEO__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEUX_VIDEO__END_TIME = 3;

	/**
	 * The feature id for the '<em><b>Customer Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEUX_VIDEO__CUSTOMER_REQUIRED = 4;

	/**
	 * The number of structural features of the '<em>Jeux Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEUX_VIDEO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Jeux Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEUX_VIDEO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.GandB.GandB.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.GandB.GandB.impl.MenuImpl
	 * @see com.sii.GandB.GandB.impl.GandBPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Plats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__PLATS = 1;

	/**
	 * The feature id for the '<em><b>Boisson</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__BOISSON = 2;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.sii.GandB.GandB.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see com.sii.GandB.GandB.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.Bar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.GandB.GandB.Bar#getName()
	 * @see #getBar()
	 * @generated
	 */
	EAttribute getBar_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.Bar#getNbreEmployee <em>Nbre Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbre Employee</em>'.
	 * @see com.sii.GandB.GandB.Bar#getNbreEmployee()
	 * @see #getBar()
	 * @generated
	 */
	EAttribute getBar_NbreEmployee();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.GandB.GandB.Bar#getJeuxvideos <em>Jeuxvideos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jeuxvideos</em>'.
	 * @see com.sii.GandB.GandB.Bar#getJeuxvideos()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_Jeuxvideos();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.Bar#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer</em>'.
	 * @see com.sii.GandB.GandB.Bar#getCustomer()
	 * @see #getBar()
	 * @generated
	 */
	EAttribute getBar_Customer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.GandB.GandB.Bar#getNourritures <em>Nourritures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nourritures</em>'.
	 * @see com.sii.GandB.GandB.Bar#getNourritures()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_Nourritures();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.GandB.GandB.Bar#getBoissons <em>Boissons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boissons</em>'.
	 * @see com.sii.GandB.GandB.Bar#getBoissons()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_Boissons();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.GandB.GandB.Bar#getMenus <em>Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menus</em>'.
	 * @see com.sii.GandB.GandB.Bar#getMenus()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_Menus();

	/**
	 * Returns the meta object for class '{@link com.sii.GandB.GandB.Nourriture <em>Nourriture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nourriture</em>'.
	 * @see com.sii.GandB.GandB.Nourriture
	 * @generated
	 */
	EClass getNourriture();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.Nourriture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.GandB.GandB.Nourriture#getName()
	 * @see #getNourriture()
	 * @generated
	 */
	EAttribute getNourriture_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.Nourriture#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see com.sii.GandB.GandB.Nourriture#getPrice()
	 * @see #getNourriture()
	 * @generated
	 */
	EAttribute getNourriture_Price();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.Nourriture#getNumberStock <em>Number Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Stock</em>'.
	 * @see com.sii.GandB.GandB.Nourriture#getNumberStock()
	 * @see #getNourriture()
	 * @generated
	 */
	EAttribute getNourriture_NumberStock();

	/**
	 * Returns the meta object for class '{@link com.sii.GandB.GandB.Boisson <em>Boisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boisson</em>'.
	 * @see com.sii.GandB.GandB.Boisson
	 * @generated
	 */
	EClass getBoisson();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.Boisson#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.GandB.GandB.Boisson#getName()
	 * @see #getBoisson()
	 * @generated
	 */
	EAttribute getBoisson_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.Boisson#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see com.sii.GandB.GandB.Boisson#getPrice()
	 * @see #getBoisson()
	 * @generated
	 */
	EAttribute getBoisson_Price();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.Boisson#getNumberStock <em>Number Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Stock</em>'.
	 * @see com.sii.GandB.GandB.Boisson#getNumberStock()
	 * @see #getBoisson()
	 * @generated
	 */
	EAttribute getBoisson_NumberStock();

	/**
	 * Returns the meta object for class '{@link com.sii.GandB.GandB.JeuxVideo <em>Jeux Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jeux Video</em>'.
	 * @see com.sii.GandB.GandB.JeuxVideo
	 * @generated
	 */
	EClass getJeuxVideo();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.JeuxVideo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.GandB.GandB.JeuxVideo#getName()
	 * @see #getJeuxVideo()
	 * @generated
	 */
	EAttribute getJeuxVideo_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.JeuxVideo#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Support</em>'.
	 * @see com.sii.GandB.GandB.JeuxVideo#getSupport()
	 * @see #getJeuxVideo()
	 * @generated
	 */
	EAttribute getJeuxVideo_Support();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.JeuxVideo#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see com.sii.GandB.GandB.JeuxVideo#getStartTime()
	 * @see #getJeuxVideo()
	 * @generated
	 */
	EAttribute getJeuxVideo_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.JeuxVideo#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see com.sii.GandB.GandB.JeuxVideo#getEndTime()
	 * @see #getJeuxVideo()
	 * @generated
	 */
	EAttribute getJeuxVideo_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.JeuxVideo#getCustomerRequired <em>Customer Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Required</em>'.
	 * @see com.sii.GandB.GandB.JeuxVideo#getCustomerRequired()
	 * @see #getJeuxVideo()
	 * @generated
	 */
	EAttribute getJeuxVideo_CustomerRequired();

	/**
	 * Returns the meta object for class '{@link com.sii.GandB.GandB.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see com.sii.GandB.GandB.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.GandB.GandB.Menu#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see com.sii.GandB.GandB.Menu#getPrice()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Price();

	/**
	 * Returns the meta object for the reference list '{@link com.sii.GandB.GandB.Menu#getPlats <em>Plats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plats</em>'.
	 * @see com.sii.GandB.GandB.Menu#getPlats()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Plats();

	/**
	 * Returns the meta object for the reference '{@link com.sii.GandB.GandB.Menu#getBoisson <em>Boisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Boisson</em>'.
	 * @see com.sii.GandB.GandB.Menu#getBoisson()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Boisson();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GandBFactory getGandBFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.sii.GandB.GandB.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.GandB.GandB.impl.BarImpl
		 * @see com.sii.GandB.GandB.impl.GandBPackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAR__NAME = eINSTANCE.getBar_Name();

		/**
		 * The meta object literal for the '<em><b>Nbre Employee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAR__NBRE_EMPLOYEE = eINSTANCE.getBar_NbreEmployee();

		/**
		 * The meta object literal for the '<em><b>Jeuxvideos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__JEUXVIDEOS = eINSTANCE.getBar_Jeuxvideos();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAR__CUSTOMER = eINSTANCE.getBar_Customer();

		/**
		 * The meta object literal for the '<em><b>Nourritures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__NOURRITURES = eINSTANCE.getBar_Nourritures();

		/**
		 * The meta object literal for the '<em><b>Boissons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__BOISSONS = eINSTANCE.getBar_Boissons();

		/**
		 * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__MENUS = eINSTANCE.getBar_Menus();

		/**
		 * The meta object literal for the '{@link com.sii.GandB.GandB.impl.NourritureImpl <em>Nourriture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.GandB.GandB.impl.NourritureImpl
		 * @see com.sii.GandB.GandB.impl.GandBPackageImpl#getNourriture()
		 * @generated
		 */
		EClass NOURRITURE = eINSTANCE.getNourriture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOURRITURE__NAME = eINSTANCE.getNourriture_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOURRITURE__PRICE = eINSTANCE.getNourriture_Price();

		/**
		 * The meta object literal for the '<em><b>Number Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOURRITURE__NUMBER_STOCK = eINSTANCE.getNourriture_NumberStock();

		/**
		 * The meta object literal for the '{@link com.sii.GandB.GandB.impl.BoissonImpl <em>Boisson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.GandB.GandB.impl.BoissonImpl
		 * @see com.sii.GandB.GandB.impl.GandBPackageImpl#getBoisson()
		 * @generated
		 */
		EClass BOISSON = eINSTANCE.getBoisson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOISSON__NAME = eINSTANCE.getBoisson_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOISSON__PRICE = eINSTANCE.getBoisson_Price();

		/**
		 * The meta object literal for the '<em><b>Number Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOISSON__NUMBER_STOCK = eINSTANCE.getBoisson_NumberStock();

		/**
		 * The meta object literal for the '{@link com.sii.GandB.GandB.impl.JeuxVideoImpl <em>Jeux Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.GandB.GandB.impl.JeuxVideoImpl
		 * @see com.sii.GandB.GandB.impl.GandBPackageImpl#getJeuxVideo()
		 * @generated
		 */
		EClass JEUX_VIDEO = eINSTANCE.getJeuxVideo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JEUX_VIDEO__NAME = eINSTANCE.getJeuxVideo_Name();

		/**
		 * The meta object literal for the '<em><b>Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JEUX_VIDEO__SUPPORT = eINSTANCE.getJeuxVideo_Support();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JEUX_VIDEO__START_TIME = eINSTANCE.getJeuxVideo_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JEUX_VIDEO__END_TIME = eINSTANCE.getJeuxVideo_EndTime();

		/**
		 * The meta object literal for the '<em><b>Customer Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JEUX_VIDEO__CUSTOMER_REQUIRED = eINSTANCE.getJeuxVideo_CustomerRequired();

		/**
		 * The meta object literal for the '{@link com.sii.GandB.GandB.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.GandB.GandB.impl.MenuImpl
		 * @see com.sii.GandB.GandB.impl.GandBPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__PRICE = eINSTANCE.getMenu_Price();

		/**
		 * The meta object literal for the '<em><b>Plats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__PLATS = eINSTANCE.getMenu_Plats();

		/**
		 * The meta object literal for the '<em><b>Boisson</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__BOISSON = eINSTANCE.getMenu_Boisson();

	}

} //GandBPackage
