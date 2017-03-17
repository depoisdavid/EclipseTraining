/**
 */
package com.sii.GandB.GandB.tests;

import com.sii.GandB.GandB.GandBFactory;
import com.sii.GandB.GandB.JeuxVideo;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Jeux Video</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JeuxVideoTest extends TestCase {

	/**
	 * The fixture for this Jeux Video test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JeuxVideo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JeuxVideoTest.class);
	}

	/**
	 * Constructs a new Jeux Video test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JeuxVideoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Jeux Video test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(JeuxVideo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Jeux Video test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JeuxVideo getFixture() {
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
		setFixture(GandBFactory.eINSTANCE.createJeuxVideo());
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

} //JeuxVideoTest
