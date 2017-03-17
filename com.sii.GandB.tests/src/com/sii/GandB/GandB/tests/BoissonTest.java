/**
 */
package com.sii.GandB.GandB.tests;

import com.sii.GandB.GandB.Boisson;
import com.sii.GandB.GandB.GandBFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boisson</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoissonTest extends TestCase {

	/**
	 * The fixture for this Boisson test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Boisson fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoissonTest.class);
	}

	/**
	 * Constructs a new Boisson test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoissonTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Boisson test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Boisson fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Boisson test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Boisson getFixture() {
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
		setFixture(GandBFactory.eINSTANCE.createBoisson());
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

} //BoissonTest
