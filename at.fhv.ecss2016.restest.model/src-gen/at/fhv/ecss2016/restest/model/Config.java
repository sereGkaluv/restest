/**
 */
package at.fhv.ecss2016.restest.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.fhv.ecss2016.restest.model.Config#getName <em>Name</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.Config#getRequestURL <em>Request URL</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.Config#getHttpVerb <em>Http Verb</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.Config#getContentType <em>Content Type</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.Config#getRequestBody <em>Request Body</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.Config#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
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
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfig_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Config#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Request URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request URL</em>' attribute.
	 * @see #setRequestURL(String)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfig_RequestURL()
	 * @model
	 * @generated
	 */
	String getRequestURL();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Config#getRequestURL <em>Request URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request URL</em>' attribute.
	 * @see #getRequestURL()
	 * @generated
	 */
	void setRequestURL(String value);

	/**
	 * Returns the value of the '<em><b>Http Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link at.fhv.ecss2016.restest.model.HttpVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Verb</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.HttpVerb
	 * @see #setHttpVerb(HttpVerb)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfig_HttpVerb()
	 * @model
	 * @generated
	 */
	HttpVerb getHttpVerb();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Config#getHttpVerb <em>Http Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Verb</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.HttpVerb
	 * @see #getHttpVerb()
	 * @generated
	 */
	void setHttpVerb(HttpVerb value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.fhv.ecss2016.restest.model.ContentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.ContentType
	 * @see #setContentType(ContentType)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfig_ContentType()
	 * @model
	 * @generated
	 */
	ContentType getContentType();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Config#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.ContentType
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(ContentType value);

	/**
	 * Returns the value of the '<em><b>Request Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Body</em>' attribute.
	 * @see #setRequestBody(String)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfig_RequestBody()
	 * @model
	 * @generated
	 */
	String getRequestBody();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Config#getRequestBody <em>Request Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Body</em>' attribute.
	 * @see #getRequestBody()
	 * @generated
	 */
	void setRequestBody(String value);

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
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getConfig_Response()
	 * @model
	 * @generated
	 */
	Response getResponse();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Config#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Response value);

} // Config
