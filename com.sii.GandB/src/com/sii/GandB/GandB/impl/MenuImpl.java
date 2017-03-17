/**
 */
package com.sii.GandB.GandB.impl;

import com.sii.GandB.GandB.Boisson;
import com.sii.GandB.GandB.GandBPackage;
import com.sii.GandB.GandB.Menu;
import com.sii.GandB.GandB.Nourriture;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.GandB.GandB.impl.MenuImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.MenuImpl#getPlats <em>Plats</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.MenuImpl#getBoisson <em>Boisson</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuImpl extends MinimalEObjectImpl.Container implements Menu {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlats() <em>Plats</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlats()
	 * @generated
	 * @ordered
	 */
	protected EList<Nourriture> plats;

	/**
	 * The cached value of the '{@link #getBoisson() <em>Boisson</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoisson()
	 * @generated
	 * @ordered
	 */
	protected Boisson boisson;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GandBPackage.Literals.MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.MENU__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nourriture> getPlats() {
		if (plats == null) {
			plats = new EObjectResolvingEList<Nourriture>(Nourriture.class, this, GandBPackage.MENU__PLATS);
		}
		return plats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boisson getBoisson() {
		if (boisson != null && boisson.eIsProxy()) {
			InternalEObject oldBoisson = (InternalEObject)boisson;
			boisson = (Boisson)eResolveProxy(oldBoisson);
			if (boisson != oldBoisson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GandBPackage.MENU__BOISSON, oldBoisson, boisson));
			}
		}
		return boisson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boisson basicGetBoisson() {
		return boisson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoisson(Boisson newBoisson) {
		Boisson oldBoisson = boisson;
		boisson = newBoisson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.MENU__BOISSON, oldBoisson, boisson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GandBPackage.MENU__PRICE:
				return getPrice();
			case GandBPackage.MENU__PLATS:
				return getPlats();
			case GandBPackage.MENU__BOISSON:
				if (resolve) return getBoisson();
				return basicGetBoisson();
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
			case GandBPackage.MENU__PRICE:
				setPrice((Integer)newValue);
				return;
			case GandBPackage.MENU__PLATS:
				getPlats().clear();
				getPlats().addAll((Collection<? extends Nourriture>)newValue);
				return;
			case GandBPackage.MENU__BOISSON:
				setBoisson((Boisson)newValue);
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
			case GandBPackage.MENU__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case GandBPackage.MENU__PLATS:
				getPlats().clear();
				return;
			case GandBPackage.MENU__BOISSON:
				setBoisson((Boisson)null);
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
			case GandBPackage.MENU__PRICE:
				return price != PRICE_EDEFAULT;
			case GandBPackage.MENU__PLATS:
				return plats != null && !plats.isEmpty();
			case GandBPackage.MENU__BOISSON:
				return boisson != null;
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
		result.append(" (Price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //MenuImpl
