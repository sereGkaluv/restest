/**
 */
package at.fhv.ecss2016.restest.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.fhv.ecss2016.restest.model.Response#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.Response#getResponseContentType <em>Response Content Type</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.Response#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.Response#getResponseBody <em>Response Body</em>}</li>
 * </ul>
 *
 * @see at.fhv.ecss2016.restest.model.ModelPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Code</b></em>' attribute.
	 * The literals are from the enumeration {@link at.fhv.ecss2016.restest.model.StatusCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Code</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.StatusCode
	 * @see #setResponseCode(StatusCode)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getResponse_ResponseCode()
	 * @model
	 * @generated
	 */
	StatusCode getResponseCode();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Response#getResponseCode <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Code</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.StatusCode
	 * @see #getResponseCode()
	 * @generated
	 */
	void setResponseCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Response Content Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.fhv.ecss2016.restest.model.ContentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Content Type</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.ContentType
	 * @see #setResponseContentType(ContentType)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getResponse_ResponseContentType()
	 * @model
	 * @generated
	 */
	ContentType getResponseContentType();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Response#getResponseContentType <em>Response Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Content Type</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.ContentType
	 * @see #getResponseContentType()
	 * @generated
	 */
	void setResponseContentType(ContentType value);

	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time</em>' attribute.
	 * @see #setResponseTime(String)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getResponse_ResponseTime()
	 * @model
	 * @generated
	 */
	String getResponseTime();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Response#getResponseTime <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' attribute.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(String value);

	/**
	 * Returns the value of the '<em><b>Response Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Body</em>' attribute.
	 * @see #setResponseBody(String)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getResponse_ResponseBody()
	 * @model
	 * @generated
	 */
	String getResponseBody();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.Response#getResponseBody <em>Response Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Body</em>' attribute.
	 * @see #getResponseBody()
	 * @generated
	 */
	void setResponseBody(String value);

} // Response
