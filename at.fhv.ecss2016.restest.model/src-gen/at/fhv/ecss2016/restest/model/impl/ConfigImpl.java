/**
 */
package at.fhv.ecss2016.restest.model.impl;

import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.HTTPVerb;
import at.fhv.ecss2016.restest.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ConfigImpl#getRequestURL <em>Request URL</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ConfigImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ConfigImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ConfigImpl#getRequestBody <em>Request Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config {
	/**
	 * The default value of the '{@link #getRequestURL() <em>Request URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestURL()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestURL() <em>Request URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestURL()
	 * @generated
	 * @ordered
	 */
	protected String requestURL = REQUEST_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerb() <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPVerb VERB_EDEFAULT = HTTPVerb.GET;

	/**
	 * The cached value of the '{@link #getVerb() <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerb verb = VERB_EDEFAULT;

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
	 * The default value of the '{@link #getRequestBody() <em>Request Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestBody()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestBody() <em>Request Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestBody()
	 * @generated
	 * @ordered
	 */
	protected String requestBody = REQUEST_BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestURL() {
		return requestURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestURL(String newRequestURL) {
		String oldRequestURL = requestURL;
		requestURL = newRequestURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONFIG__REQUEST_URL, oldRequestURL, requestURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb getVerb() {
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerb(HTTPVerb newVerb) {
		HTTPVerb oldVerb = verb;
		verb = newVerb == null ? VERB_EDEFAULT : newVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONFIG__VERB, oldVerb, verb));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONFIG__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestBody() {
		return requestBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestBody(String newRequestBody) {
		String oldRequestBody = requestBody;
		requestBody = newRequestBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONFIG__REQUEST_BODY, oldRequestBody, requestBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CONFIG__REQUEST_URL:
				return getRequestURL();
			case ModelPackage.CONFIG__VERB:
				return getVerb();
			case ModelPackage.CONFIG__CONTENT_TYPE:
				return getContentType();
			case ModelPackage.CONFIG__REQUEST_BODY:
				return getRequestBody();
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
			case ModelPackage.CONFIG__REQUEST_URL:
				setRequestURL((String)newValue);
				return;
			case ModelPackage.CONFIG__VERB:
				setVerb((HTTPVerb)newValue);
				return;
			case ModelPackage.CONFIG__CONTENT_TYPE:
				setContentType((ContentType)newValue);
				return;
			case ModelPackage.CONFIG__REQUEST_BODY:
				setRequestBody((String)newValue);
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
			case ModelPackage.CONFIG__REQUEST_URL:
				setRequestURL(REQUEST_URL_EDEFAULT);
				return;
			case ModelPackage.CONFIG__VERB:
				setVerb(VERB_EDEFAULT);
				return;
			case ModelPackage.CONFIG__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case ModelPackage.CONFIG__REQUEST_BODY:
				setRequestBody(REQUEST_BODY_EDEFAULT);
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
			case ModelPackage.CONFIG__REQUEST_URL:
				return REQUEST_URL_EDEFAULT == null ? requestURL != null : !REQUEST_URL_EDEFAULT.equals(requestURL);
			case ModelPackage.CONFIG__VERB:
				return verb != VERB_EDEFAULT;
			case ModelPackage.CONFIG__CONTENT_TYPE:
				return contentType != CONTENT_TYPE_EDEFAULT;
			case ModelPackage.CONFIG__REQUEST_BODY:
				return REQUEST_BODY_EDEFAULT == null ? requestBody != null : !REQUEST_BODY_EDEFAULT.equals(requestBody);
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
		result.append(" (requestURL: ");
		result.append(requestURL);
		result.append(", verb: ");
		result.append(verb);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", requestBody: ");
		result.append(requestBody);
		result.append(')');
		return result.toString();
	}

} //ConfigImpl
