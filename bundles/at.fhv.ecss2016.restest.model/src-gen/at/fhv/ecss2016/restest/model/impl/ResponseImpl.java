/**
 */
package at.fhv.ecss2016.restest.model.impl;

import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.ModelPackage;
import at.fhv.ecss2016.restest.model.Response;
import at.fhv.ecss2016.restest.model.StatusCode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ResponseImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ResponseImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ResponseImpl#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ResponseImpl#getResponseBody <em>Response Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends MinimalEObjectImpl.Container implements Response {
	/**
	 * The default value of the '{@link #getStatusCode() <em>Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected static final StatusCode STATUS_CODE_EDEFAULT = StatusCode.CONTINUE;

	/**
	 * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected StatusCode statusCode = STATUS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final ContentType CONTENT_TYPE_EDEFAULT = ContentType.TEXT;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected ContentType contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected String responseTime = RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseBody() <em>Response Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseBody()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseBody() <em>Response Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseBody()
	 * @generated
	 * @ordered
	 */
	protected String responseBody = RESPONSE_BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode getStatusCode() {
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusCode(StatusCode newStatusCode) {
		StatusCode oldStatusCode = statusCode;
		statusCode = newStatusCode == null ? STATUS_CODE_EDEFAULT : newStatusCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESPONSE__STATUS_CODE, oldStatusCode, statusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(ContentType newContentType) {
		ContentType oldContentType = contentType;
		contentType = newContentType == null ? CONTENT_TYPE_EDEFAULT : newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESPONSE__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponseTime() {
		return responseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseTime(String newResponseTime) {
		String oldResponseTime = responseTime;
		responseTime = newResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESPONSE__RESPONSE_TIME, oldResponseTime, responseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponseBody() {
		return responseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseBody(String newResponseBody) {
		String oldResponseBody = responseBody;
		responseBody = newResponseBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESPONSE__RESPONSE_BODY, oldResponseBody, responseBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RESPONSE__STATUS_CODE:
				return getStatusCode();
			case ModelPackage.RESPONSE__CONTENT_TYPE:
				return getContentType();
			case ModelPackage.RESPONSE__RESPONSE_TIME:
				return getResponseTime();
			case ModelPackage.RESPONSE__RESPONSE_BODY:
				return getResponseBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.RESPONSE__STATUS_CODE:
				setStatusCode((StatusCode)newValue);
				return;
			case ModelPackage.RESPONSE__CONTENT_TYPE:
				setContentType((ContentType)newValue);
				return;
			case ModelPackage.RESPONSE__RESPONSE_TIME:
				setResponseTime((String)newValue);
				return;
			case ModelPackage.RESPONSE__RESPONSE_BODY:
				setResponseBody((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.RESPONSE__STATUS_CODE:
				setStatusCode(STATUS_CODE_EDEFAULT);
				return;
			case ModelPackage.RESPONSE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case ModelPackage.RESPONSE__RESPONSE_TIME:
				setResponseTime(RESPONSE_TIME_EDEFAULT);
				return;
			case ModelPackage.RESPONSE__RESPONSE_BODY:
				setResponseBody(RESPONSE_BODY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.RESPONSE__STATUS_CODE:
				return statusCode != STATUS_CODE_EDEFAULT;
			case ModelPackage.RESPONSE__CONTENT_TYPE:
				return contentType != CONTENT_TYPE_EDEFAULT;
			case ModelPackage.RESPONSE__RESPONSE_TIME:
				return RESPONSE_TIME_EDEFAULT == null ? responseTime != null : !RESPONSE_TIME_EDEFAULT.equals(responseTime);
			case ModelPackage.RESPONSE__RESPONSE_BODY:
				return RESPONSE_BODY_EDEFAULT == null ? responseBody != null : !RESPONSE_BODY_EDEFAULT.equals(responseBody);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (statusCode: ");
		result.append(statusCode);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", responseTime: ");
		result.append(responseTime);
		result.append(", responseBody: ");
		result.append(responseBody);
		result.append(')');
		return result.toString();
	}

} //ResponseImpl
