/**
 */
package at.fhv.ecss2016.restest.model.impl;

import at.fhv.ecss2016.restest.model.ModelPackage;
import at.fhv.ecss2016.restest.model.Response;

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
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ResponseImpl#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ResponseImpl#getResponseContentType <em>Response Content Type</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ResponseImpl#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ResponseImpl#getResponseBody <em>Response Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends MinimalEObjectImpl.Container implements Response {
	/**
	 * The default value of the '{@link #getResponseCode() <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseCode() <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected String responseCode = RESPONSE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseContentType() <em>Response Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseContentType() <em>Response Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseContentType()
	 * @generated
	 * @ordered
	 */
	protected String responseContentType = RESPONSE_CONTENT_TYPE_EDEFAULT;

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
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseCode(String newResponseCode) {
		String oldResponseCode = responseCode;
		responseCode = newResponseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESPONSE__RESPONSE_CODE, oldResponseCode, responseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponseContentType() {
		return responseContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseContentType(String newResponseContentType) {
		String oldResponseContentType = responseContentType;
		responseContentType = newResponseContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESPONSE__RESPONSE_CONTENT_TYPE, oldResponseContentType, responseContentType));
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
			case ModelPackage.RESPONSE__RESPONSE_CODE:
				return getResponseCode();
			case ModelPackage.RESPONSE__RESPONSE_CONTENT_TYPE:
				return getResponseContentType();
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
			case ModelPackage.RESPONSE__RESPONSE_CODE:
				setResponseCode((String)newValue);
				return;
			case ModelPackage.RESPONSE__RESPONSE_CONTENT_TYPE:
				setResponseContentType((String)newValue);
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
			case ModelPackage.RESPONSE__RESPONSE_CODE:
				setResponseCode(RESPONSE_CODE_EDEFAULT);
				return;
			case ModelPackage.RESPONSE__RESPONSE_CONTENT_TYPE:
				setResponseContentType(RESPONSE_CONTENT_TYPE_EDEFAULT);
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
			case ModelPackage.RESPONSE__RESPONSE_CODE:
				return RESPONSE_CODE_EDEFAULT == null ? responseCode != null : !RESPONSE_CODE_EDEFAULT.equals(responseCode);
			case ModelPackage.RESPONSE__RESPONSE_CONTENT_TYPE:
				return RESPONSE_CONTENT_TYPE_EDEFAULT == null ? responseContentType != null : !RESPONSE_CONTENT_TYPE_EDEFAULT.equals(responseContentType);
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
		result.append(" (responseCode: ");
		result.append(responseCode);
		result.append(", responseContentType: ");
		result.append(responseContentType);
		result.append(", responseTime: ");
		result.append(responseTime);
		result.append(", responseBody: ");
		result.append(responseBody);
		result.append(')');
		return result.toString();
	}

} //ResponseImpl
