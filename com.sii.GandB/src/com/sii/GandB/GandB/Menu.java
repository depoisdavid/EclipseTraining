/**
 */
package com.sii.GandB.GandB;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.GandB.GandB.Menu#getPrice <em>Price</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.Menu#getPlats <em>Plats</em>}</li>
 *   <li>{@link com.sii.GandB.GandB.Menu#getBoisson <em>Boisson</em>}</li>
 * </ul>
 *
 * @see com.sii.GandB.GandB.GandBPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject {
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
	 * @see com.sii.GandB.GandB.GandBPackage#getMenu_Price()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.Menu#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Plats</b></em>' reference list.
	 * The list contents are of type {@link com.sii.GandB.GandB.Nourriture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plats</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plats</em>' reference list.
	 * @see com.sii.GandB.GandB.GandBPackage#getMenu_Plats()
	 * @model upper="3"
	 * @generated
	 */
	EList<Nourriture> getPlats();

	/**
	 * Returns the value of the '<em><b>Boisson</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boisson</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boisson</em>' reference.
	 * @see #setBoisson(Boisson)
	 * @see com.sii.GandB.GandB.GandBPackage#getMenu_Boisson()
	 * @model
	 * @generated
	 */
	Boisson getBoisson();

	/**
	 * Sets the value of the '{@link com.sii.GandB.GandB.Menu#getBoisson <em>Boisson</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boisson</em>' reference.
	 * @see #getBoisson()
	 * @generated
	 */
	void setBoisson(Boisson value);

} // Menu
