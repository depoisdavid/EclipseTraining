/**
 */
package com.sii.GandB.GandB.impl;

import com.sii.GandB.GandB.Bar;
import com.sii.GandB.GandB.Boisson;
import com.sii.GandB.GandB.GandBPackage;
import com.sii.GandB.GandB.JeuxVideo;
import com.sii.GandB.GandB.Menu;
import com.sii.GandB.GandB.Nourriture;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.GandB.GandB.impl.BarImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.BarImpl#getNbreEmployee <em>Nbre Employee</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.BarImpl#getJeuxvideos <em>Jeuxvideos</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.BarImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.BarImpl#getNourritures <em>Nourritures</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.BarImpl#getBoissons <em>Boissons</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.BarImpl#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BarImpl extends MinimalEObjectImpl.Container implements Bar {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbreEmployee() <em>Nbre Employee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbreEmployee()
	 * @generated
	 * @ordered
	 */
	protected static final int NBRE_EMPLOYEE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbreEmployee() <em>Nbre Employee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbreEmployee()
	 * @generated
	 * @ordered
	 */
	protected int nbreEmployee = NBRE_EMPLOYEE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJeuxvideos() <em>Jeuxvideos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJeuxvideos()
	 * @generated
	 * @ordered
	 */
	protected EList<JeuxVideo> jeuxvideos;

	/**
	 * The default value of the '{@link #getCustomer() <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected int customer = CUSTOMER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNourritures() <em>Nourritures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNourritures()
	 * @generated
	 * @ordered
	 */
	protected EList<Nourriture> nourritures;

	/**
	 * The cached value of the '{@link #getBoissons() <em>Boissons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoissons()
	 * @generated
	 * @ordered
	 */
	protected EList<Boisson> boissons;

	/**
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GandBPackage.Literals.BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.BAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbreEmployee() {
		return nbreEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbreEmployee(int newNbreEmployee) {
		int oldNbreEmployee = nbreEmployee;
		nbreEmployee = newNbreEmployee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.BAR__NBRE_EMPLOYEE, oldNbreEmployee, nbreEmployee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JeuxVideo> getJeuxvideos() {
		if (jeuxvideos == null) {
			jeuxvideos = new EObjectContainmentEList<JeuxVideo>(JeuxVideo.class, this, GandBPackage.BAR__JEUXVIDEOS);
		}
		return jeuxvideos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(int newCustomer) {
		int oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.BAR__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nourriture> getNourritures() {
		if (nourritures == null) {
			nourritures = new EObjectContainmentEList<Nourriture>(Nourriture.class, this, GandBPackage.BAR__NOURRITURES);
		}
		return nourritures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boisson> getBoissons() {
		if (boissons == null) {
			boissons = new EObjectContainmentEList<Boisson>(Boisson.class, this, GandBPackage.BAR__BOISSONS);
		}
		return boissons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, GandBPackage.BAR__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GandBPackage.BAR__JEUXVIDEOS:
				return ((InternalEList<?>)getJeuxvideos()).basicRemove(otherEnd, msgs);
			case GandBPackage.BAR__NOURRITURES:
				return ((InternalEList<?>)getNourritures()).basicRemove(otherEnd, msgs);
			case GandBPackage.BAR__BOISSONS:
				return ((InternalEList<?>)getBoissons()).basicRemove(otherEnd, msgs);
			case GandBPackage.BAR__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GandBPackage.BAR__NAME:
				return getName();
			case GandBPackage.BAR__NBRE_EMPLOYEE:
				return getNbreEmployee();
			case GandBPackage.BAR__JEUXVIDEOS:
				return getJeuxvideos();
			case GandBPackage.BAR__CUSTOMER:
				return getCustomer();
			case GandBPackage.BAR__NOURRITURES:
				return getNourritures();
			case GandBPackage.BAR__BOISSONS:
				return getBoissons();
			case GandBPackage.BAR__MENUS:
				return getMenus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GandBPackage.BAR__NAME:
				setName((String)newValue);
				return;
			case GandBPackage.BAR__NBRE_EMPLOYEE:
				setNbreEmployee((Integer)newValue);
				return;
			case GandBPackage.BAR__JEUXVIDEOS:
				getJeuxvideos().clear();
				getJeuxvideos().addAll((Collection<? extends JeuxVideo>)newValue);
				return;
			case GandBPackage.BAR__CUSTOMER:
				setCustomer((Integer)newValue);
				return;
			case GandBPackage.BAR__NOURRITURES:
				getNourritures().clear();
				getNourritures().addAll((Collection<? extends Nourriture>)newValue);
				return;
			case GandBPackage.BAR__BOISSONS:
				getBoissons().clear();
				getBoissons().addAll((Collection<? extends Boisson>)newValue);
				return;
			case GandBPackage.BAR__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GandBPackage.BAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GandBPackage.BAR__NBRE_EMPLOYEE:
				setNbreEmployee(NBRE_EMPLOYEE_EDEFAULT);
				return;
			case GandBPackage.BAR__JEUXVIDEOS:
				getJeuxvideos().clear();
				return;
			case GandBPackage.BAR__CUSTOMER:
				setCustomer(CUSTOMER_EDEFAULT);
				return;
			case GandBPackage.BAR__NOURRITURES:
				getNourritures().clear();
				return;
			case GandBPackage.BAR__BOISSONS:
				getBoissons().clear();
				return;
			case GandBPackage.BAR__MENUS:
				getMenus().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GandBPackage.BAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GandBPackage.BAR__NBRE_EMPLOYEE:
				return nbreEmployee != NBRE_EMPLOYEE_EDEFAULT;
			case GandBPackage.BAR__JEUXVIDEOS:
				return jeuxvideos != null && !jeuxvideos.isEmpty();
			case GandBPackage.BAR__CUSTOMER:
				return customer != CUSTOMER_EDEFAULT;
			case GandBPackage.BAR__NOURRITURES:
				return nourritures != null && !nourritures.isEmpty();
			case GandBPackage.BAR__BOISSONS:
				return boissons != null && !boissons.isEmpty();
			case GandBPackage.BAR__MENUS:
				return menus != null && !menus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", NbreEmployee: ");
		result.append(nbreEmployee);
		result.append(", Customer: ");
		result.append(customer);
		result.append(')');
		return result.toString();
	}

} //BarImpl
