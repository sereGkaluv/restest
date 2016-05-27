/**
 */
package at.fhv.ecss2016.restest.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expected Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.fhv.ecss2016.restest.model.ExpectedResult#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.ExpectedResult#getContentType <em>Content Type</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.ExpectedResult#getResponseBody <em>Response Body</em>}</li>
 * </ul>
 *
 * @see at.fhv.ecss2016.restest.model.ModelPackage#getExpectedResult()
 * @model
 * @generated
 */
public interface ExpectedResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' attribute.
	 * The literals are from the enumeration {@link at.fhv.ecss2016.restest.model.StatusCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.StatusCode
	 * @see #setStatusCode(StatusCode)
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getExpectedResult_StatusCode()
	 * @model
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.ExpectedResult#getStatusCode <em>Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.StatusCode
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

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
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getExpectedResult_ContentType()
	 * @model
	 * @generated
	 */
	ContentType getContentType();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.ExpectedResult#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see at.fhv.ecss2016.restest.model.ContentType
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(ContentType value);

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
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#getExpectedResult_ResponseBody()
	 * @model
	 * @generated
	 */
	String getResponseBody();

	/**
	 * Sets the value of the '{@link at.fhv.ecss2016.restest.model.ExpectedResult#getResponseBody <em>Response Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Body</em>' attribute.
	 * @see #getResponseBody()
	 * @generated
	 */
	void setResponseBody(String value);

} // ExpectedResult
