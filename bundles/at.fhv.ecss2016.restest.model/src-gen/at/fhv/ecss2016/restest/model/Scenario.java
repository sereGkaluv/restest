/**
 */
package at.fhv.ecss2016.restest.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.fhv.ecss2016.restest.model.Scenario#getScenarioFilePath <em>Scenario File Path</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.Scenario#getConfigExpectedResultPairList <em>Config Expected Result Pair List</em>}</li>
 * </ul>
 *
 * @see at.fhv.ecss2016.restest.model.ModelPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenario File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario File Path</em>' attribute.
	 * @see #setScenarioFilePath(String)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getScenario_ScenarioFilePath()
	 * @model
	 * @generated
	 */
	String getScenarioFilePath();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Scenario#getScenarioFilePath <em>Scenario File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario File Path</em>' attribute.
	 * @see #getScenarioFilePath()
	 * @generated
	 */
	void setScenarioFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Config Expected Result Pair List</b></em>' reference list.
	 * The list contents are of type {@link at.fhv.ecss2016.restest.model.ConfigExpectedResultPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Expected Result Pair List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Expected Result Pair List</em>' reference list.
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getScenario_ConfigExpectedResultPairList()
	 * @model
	 * @generated
	 */
	EList<ConfigExpectedResultPair> getConfigExpectedResultPairList();

} // Scenario
