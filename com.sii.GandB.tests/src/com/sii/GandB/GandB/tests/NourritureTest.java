/**
 */
package com.sii.GandB.GandB.tests;

import com.sii.GandB.GandB.GandBFactory;
import com.sii.GandB.GandB.Nourriture;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nourriture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NourritureTest extends TestCase {

	/**
	 * The fixture for this Nourriture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nourriture fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NourritureTest.class);
	}

	/**
	 * Constructs a new Nourriture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NourritureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Nourriture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Nourriture fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Nourriture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nourriture getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GandBFactory.eINSTANCE.createNourriture());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NourritureTest
