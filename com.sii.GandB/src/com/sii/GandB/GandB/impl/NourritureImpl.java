/**
 */
package com.sii.GandB.GandB.impl;

import com.sii.GandB.GandB.GandBPackage;
import com.sii.GandB.GandB.Nourriture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nourriture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.GandB.GandB.impl.NourritureImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.NourritureImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.NourritureImpl#getNumberStock <em>Number Stock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NourritureImpl extends MinimalEObjectImpl.Container implements Nourriture {
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
	 * The default value of the '{@link #getNumberStock() <em>Number Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberStock()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_STOCK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberStock() <em>Number Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberStock()
	 * @generated
	 * @ordered
	 */
	protected int numberStock = NUMBER_STOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NourritureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GandBPackage.Literals.NOURRITURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.NOURRITURE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.NOURRITURE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberStock() {
		return numberStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberStock(int newNumberStock) {
		int oldNumberStock = numberStock;
		numberStock = newNumberStock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.NOURRITURE__NUMBER_STOCK, oldNumberStock, numberStock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GandBPackage.NOURRITURE__NAME:
				return getName();
			case GandBPackage.NOURRITURE__PRICE:
				return getPrice();
			case GandBPackage.NOURRITURE__NUMBER_STOCK:
				return getNumberStock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GandBPackage.NOURRITURE__NAME:
				setName((String)newValue);
				return;
			case GandBPackage.NOURRITURE__PRICE:
				setPrice((Integer)newValue);
				return;
			case GandBPackage.NOURRITURE__NUMBER_STOCK:
				setNumberStock((Integer)newValue);
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
			case GandBPackage.NOURRITURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GandBPackage.NOURRITURE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case GandBPackage.NOURRITURE__NUMBER_STOCK:
				setNumberStock(NUMBER_STOCK_EDEFAULT);
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
			case GandBPackage.NOURRITURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GandBPackage.NOURRITURE__PRICE:
				return price != PRICE_EDEFAULT;
			case GandBPackage.NOURRITURE__NUMBER_STOCK:
				return numberStock != NUMBER_STOCK_EDEFAULT;
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
		result.append(", Price: ");
		result.append(price);
		result.append(", NumberStock: ");
		result.append(numberStock);
		result.append(')');
		return result.toString();
	}

} //NourritureImpl
