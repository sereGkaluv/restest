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
 *   <li>{@link at.fhv.ecss2016.restest.model.Scenario#getScenariosFile <em>Scenarios File</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.Scenario#getConfigResultPairs <em>Config Result Pairs</em>}</li>
 * </ul>
 *
 * @see at.fhv.ecss2016.restest.model.ModelPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenarios File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios File</em>' attribute.
	 * @see #setScenariosFile(String)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getScenario_ScenariosFile()
	 * @model
	 * @generated
	 */
	String getScenariosFile();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Scenario#getScenariosFile <em>Scenarios File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenarios File</em>' attribute.
	 * @see #getScenariosFile()
	 * @generated
	 */
	void setScenariosFile(String value);

	/**
	 * Returns the value of the '<em><b>Config Result Pairs</b></em>' reference list.
	 * The list contents are of type {@link at.fhv.ecss2016.restest.model.ConfigResultPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Result Pairs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Result Pairs</em>' reference list.
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getScenario_ConfigResultPairs()
	 * @model
	 * @generated
	 */
	EList<ConfigResultPair> getConfigResultPairs();

} // Scenario
