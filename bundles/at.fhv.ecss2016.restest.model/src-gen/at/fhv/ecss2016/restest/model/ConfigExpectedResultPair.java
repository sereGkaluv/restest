/**
 */
package at.fhv.ecss2016.restest.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Expected Result Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.fhv.ecss2016.restest.model.ConfigExpectedResultPair#getConfig <em>Config</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.ConfigExpectedResultPair#getExpectedResult <em>Expected Result</em>}</li>
 * </ul>
 *
 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfigExpectedResultPair()
 * @model
 * @generated
 */
public interface ConfigExpectedResultPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' reference.
	 * @see #setConfig(Config)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfigExpectedResultPair_Config()
	 * @model
	 * @generated
	 */
	Config getConfig();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.ConfigExpectedResultPair#getConfig <em>Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(Config value);

	/**
	 * Returns the value of the '<em><b>Expected Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Result</em>' reference.
	 * @see #setExpectedResult(ExpectedResult)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfigExpectedResultPair_ExpectedResult()
	 * @model
	 * @generated
	 */
	ExpectedResult getExpectedResult();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.ConfigExpectedResultPair#getExpectedResult <em>Expected Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Result</em>' reference.
	 * @see #getExpectedResult()
	 * @generated
	 */
	void setExpectedResult(ExpectedResult value);

} // ConfigExpectedResultPair
