/**
 */
package at.fhv.ecss2016.restest.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Result Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.fhv.ecss2016.restest.model.ConfigResultPair#getConfig <em>Config</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.ConfigResultPair#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfigResultPair()
 * @model
 * @generated
 */
public interface ConfigResultPair extends EObject {
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
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfigResultPair_Config()
	 * @model
	 * @generated
	 */
	Config getConfig();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.ConfigResultPair#getConfig <em>Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(Config value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference.
	 * @see #setResponse(Response)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfigResultPair_Response()
	 * @model
	 * @generated
	 */
	Response getResponse();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.ConfigResultPair#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Response value);

} // ConfigResultPair
