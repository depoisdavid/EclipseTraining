/**
 */
package com.sii.GandB.GandB;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.GandB.GandB.Bar#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.Bar#getNbreEmployee <em>Nbre Employee</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.Bar#getJeuxvideos <em>Jeuxvideos</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.Bar#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.Bar#getNourritures <em>Nourritures</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.Bar#getBoissons <em>Boissons</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.Bar#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @see com.sii.GandB.GandB.GandBPackage#getBar()
 * @model
 * @generated
 */
public interface Bar extends EObject {
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
	 * @see com.sii.GandB.GandB.GandBPackage#getBar_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.Bar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nbre Employee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbre Employee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbre Employee</em>' attribute.
	 * @see #setNbreEmployee(int)
	 * @see com.sii.GandB.GandB.GandBPackage#getBar_NbreEmployee()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNbreEmployee();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.Bar#getNbreEmployee <em>Nbre Employee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbre Employee</em>' attribute.
	 * @see #getNbreEmployee()
	 * @generated
	 */
	void setNbreEmployee(int value);

	/**
	 * Returns the value of the '<em><b>Jeuxvideos</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.GandB.GandB.JeuxVideo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jeuxvideos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jeuxvideos</em>' containment reference list.
	 * @see com.sii.GandB.GandB.GandBPackage#getBar_Jeuxvideos()
	 * @model containment="true"
	 * @generated
	 */
	EList<JeuxVideo> getJeuxvideos();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' attribute.
	 * @see #setCustomer(int)
	 * @see com.sii.GandB.GandB.GandBPackage#getBar_Customer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getCustomer();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.Bar#getCustomer <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' attribute.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(int value);

	/**
	 * Returns the value of the '<em><b>Nourritures</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.GandB.GandB.Nourriture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nourritures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nourritures</em>' containment reference list.
	 * @see com.sii.GandB.GandB.GandBPackage#getBar_Nourritures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nourriture> getNourritures();

	/**
	 * Returns the value of the '<em><b>Boissons</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.GandB.GandB.Boisson}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boissons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boissons</em>' containment reference list.
	 * @see com.sii.GandB.GandB.GandBPackage#getBar_Boissons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Boisson> getBoissons();

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.GandB.GandB.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see com.sii.GandB.GandB.GandBPackage#getBar_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenus();

} // Bar
