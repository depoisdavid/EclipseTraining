/**
 */
package com.sii.GandB.GandB.impl;

import com.sii.GandB.GandB.GandBPackage;
import com.sii.GandB.GandB.JeuxVideo;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jeux Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.GandB.GandB.impl.JeuxVideoImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.JeuxVideoImpl#getSupport <em>Support</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.JeuxVideoImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.JeuxVideoImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.impl.JeuxVideoImpl#getCustomerRequired <em>Customer Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JeuxVideoImpl extends MinimalEObjectImpl.Container implements JeuxVideo {
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
	 * The default value of the '{@link #getSupport() <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupport() <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected String support = SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerRequired() <em>Customer Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerRequired()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_REQUIRED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerRequired() <em>Customer Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerRequired()
	 * @generated
	 * @ordered
	 */
	protected int customerRequired = CUSTOMER_REQUIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JeuxVideoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GandBPackage.Literals.JEUX_VIDEO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.JEUX_VIDEO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupport() {
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupport(String newSupport) {
		String oldSupport = support;
		support = newSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.JEUX_VIDEO__SUPPORT, oldSupport, support));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(XMLGregorianCalendar newStartTime) {
		XMLGregorianCalendar oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.JEUX_VIDEO__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(XMLGregorianCalendar newEndTime) {
		XMLGregorianCalendar oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.JEUX_VIDEO__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomerRequired() {
		return customerRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerRequired(int newCustomerRequired) {
		int oldCustomerRequired = customerRequired;
		customerRequired = newCustomerRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GandBPackage.JEUX_VIDEO__CUSTOMER_REQUIRED, oldCustomerRequired, customerRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GandBPackage.JEUX_VIDEO__NAME:
				return getName();
			case GandBPackage.JEUX_VIDEO__SUPPORT:
				return getSupport();
			case GandBPackage.JEUX_VIDEO__START_TIME:
				return getStartTime();
			case GandBPackage.JEUX_VIDEO__END_TIME:
				return getEndTime();
			case GandBPackage.JEUX_VIDEO__CUSTOMER_REQUIRED:
				return getCustomerRequired();
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
			case GandBPackage.JEUX_VIDEO__NAME:
				setName((String)newValue);
				return;
			case GandBPackage.JEUX_VIDEO__SUPPORT:
				setSupport((String)newValue);
				return;
			case GandBPackage.JEUX_VIDEO__START_TIME:
				setStartTime((XMLGregorianCalendar)newValue);
				return;
			case GandBPackage.JEUX_VIDEO__END_TIME:
				setEndTime((XMLGregorianCalendar)newValue);
				return;
			case GandBPackage.JEUX_VIDEO__CUSTOMER_REQUIRED:
				setCustomerRequired((Integer)newValue);
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
			case GandBPackage.JEUX_VIDEO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GandBPackage.JEUX_VIDEO__SUPPORT:
				setSupport(SUPPORT_EDEFAULT);
				return;
			case GandBPackage.JEUX_VIDEO__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case GandBPackage.JEUX_VIDEO__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case GandBPackage.JEUX_VIDEO__CUSTOMER_REQUIRED:
				setCustomerRequired(CUSTOMER_REQUIRED_EDEFAULT);
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
			case GandBPackage.JEUX_VIDEO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GandBPackage.JEUX_VIDEO__SUPPORT:
				return SUPPORT_EDEFAULT == null ? support != null : !SUPPORT_EDEFAULT.equals(support);
			case GandBPackage.JEUX_VIDEO__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case GandBPackage.JEUX_VIDEO__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case GandBPackage.JEUX_VIDEO__CUSTOMER_REQUIRED:
				return customerRequired != CUSTOMER_REQUIRED_EDEFAULT;
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
		result.append(", Support: ");
		result.append(support);
		result.append(", StartTime: ");
		result.append(startTime);
		result.append(", EndTime: ");
		result.append(endTime);
		result.append(", CustomerRequired: ");
		result.append(customerRequired);
		result.append(')');
		return result.toString();
	}

} //JeuxVideoImpl
