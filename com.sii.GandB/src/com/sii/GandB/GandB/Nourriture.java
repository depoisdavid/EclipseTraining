/**
 */
package com.sii.GandB.GandB;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nourriture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.GandB.GandB.Nourriture#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.Nourriture#getPrice <em>Price</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.Nourriture#getNumberStock <em>Number Stock</em>}</li>
 * </ul>
 *
 * @see com.sii.GandB.GandB.GandBPackage#getNourriture()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkName'"
 * @generated
 */
public interface Nourriture extends EObject {
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
	 * @see com.sii.GandB.GandB.GandBPackage#getNourriture_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.Nourriture#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see com.sii.GandB.GandB.GandBPackage#getNourriture_Price()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.Nourriture#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Number Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Stock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Stock</em>' attribute.
	 * @see #setNumberStock(int)
	 * @see com.sii.GandB.GandB.GandBPackage#getNourriture_NumberStock()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNumberStock();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.Nourriture#getNumberStock <em>Number Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Stock</em>' attribute.
	 * @see #getNumberStock()
	 * @generated
	 */
	void setNumberStock(int value);

} // Nourriture
