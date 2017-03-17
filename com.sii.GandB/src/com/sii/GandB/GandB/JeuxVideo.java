/**
 */
package com.sii.GandB.GandB;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jeux Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.GandB.GandB.JeuxVideo#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.JeuxVideo#getSupport <em>Support</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.JeuxVideo#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.JeuxVideo#getEndTime <em>End Time</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.JeuxVideo#getCustomerRequired <em>Customer Required</em>}</li>
 * </ul>
 *
 * @see com.sii.GandB.GandB.GandBPackage#getJeuxVideo()
 * @model
 * @generated
 */
public interface JeuxVideo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.sii.GandB.GandB.GandBPackage#getJeuxVideo_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.JeuxVideo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support</em>' attribute.
	 * @see #setSupport(String)
	 * @see com.sii.GandB.GandB.GandBPackage#getJeuxVideo_Support()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSupport();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.JeuxVideo#getSupport <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support</em>' attribute.
	 * @see #getSupport()
	 * @generated
	 */
	void setSupport(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(XMLGregorianCalendar)
	 * @see com.sii.GandB.GandB.GandBPackage#getJeuxVideo_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.JeuxVideo#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(XMLGregorianCalendar)
	 * @see com.sii.GandB.GandB.GandBPackage#getJeuxVideo_EndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getEndTime();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.JeuxVideo#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Customer Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Required</em>' attribute.
	 * @see #setCustomerRequired(int)
	 * @see com.sii.GandB.GandB.GandBPackage#getJeuxVideo_CustomerRequired()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getCustomerRequired();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.JeuxVideo#getCustomerRequired <em>Customer Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Required</em>' attribute.
	 * @see #getCustomerRequired()
	 * @generated
	 */
	void setCustomerRequired(int value);

} // JeuxVideo
