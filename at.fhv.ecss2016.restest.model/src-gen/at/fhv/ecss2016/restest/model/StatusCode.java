/**
 */
package at.fhv.ecss2016.restest.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.fhv.ecss2016.restest.model.ModelPackage#getStatusCode()
 * @model
 * @generated
 */
public enum StatusCode implements Enumerator {
	/**
	 * The '<em><b>CONTINUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUE(100, "CONTINUE", "CONTINUE"),

	/**
	 * The '<em><b>SWITCHING PROTOCOLS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCHING_PROTOCOLS_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCHING_PROTOCOLS(101, "SWITCHING_PROTOCOLS", "SWITCHING PROTOCOLS"),

	/**
	 * The '<em><b>PROCESSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSING(102, "PROCESSING", "PROCESSING"),

	/**
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(200, "OK", "OK"),

	/**
	 * The '<em><b>CREATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	CREATED(201, "CREATED", "CREATED"),

	/**
	 * The '<em><b>ACCEPTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(202, "ACCEPTED", "ACCEPTED"),

	/**
	 * The '<em><b>NON AUTHORITATIVE INFORMATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_AUTHORITATIVE_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	NON_AUTHORITATIVE_INFORMATION(203, "NON_AUTHORITATIVE_INFORMATION", "NON AUTHORITATIVE INFORMATION"),

	/**
	 * The '<em><b>NO CONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONTENT(204, "NO_CONTENT", "NO CONTENT"),

	/**
	 * The '<em><b>RESET CONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	RESET_CONTENT(205, "RESET_CONTENT", "RESET CONTENT"),

	/**
	 * The '<em><b>PARTIAL CONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL_CONTENT(206, "PARTIAL_CONTENT", "PARTIAL CONTENT"),

	/**
	 * The '<em><b>MULTI STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_STATUS(207, "MULTI_STATUS", "MULTI STATUS"),

	/**
	 * The '<em><b>MULTIPLE CHOICES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_CHOICES_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_CHOICES(300, "MULTIPLE_CHOICES", "MULTIPLE CHOICES"),

	/**
	 * The '<em><b>MOVED PERMANENTLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVED_PERMANENTLY_VALUE
	 * @generated
	 * @ordered
	 */
	MOVED_PERMANENTLY(301, "MOVED_PERMANENTLY", "MOVED PERMANENTLY"),

	/**
	 * The '<em><b>MOVED TEMPORARILY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVED_TEMPORARILY_VALUE
	 * @generated
	 * @ordered
	 */
	MOVED_TEMPORARILY(302, "MOVED_TEMPORARILY", "MOVED TEMPORARILY"),

	/**
	 * The '<em><b>SEE OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEE_OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	SEE_OTHER(303, "SEE_OTHER", "SEE OTHER"),

	/**
	 * The '<em><b>NOT MODIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_MODIFIED(304, "NOT_MODIFIED", "NOT MODIFIED"),

	/**
	 * The '<em><b>USE PROXY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USE_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	USE_PROXY(305, "USE_PROXY", "USE PROXY"),

	/**
	 * The '<em><b>TEMPORARY REDIRECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORARY_REDIRECT_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORARY_REDIRECT(307, "TEMPORARY_REDIRECT", "TEMPORARY REDIRECT"),

	/**
	 * The '<em><b>BAD REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_REQUEST(400, "BAD_REQUEST", "BAD REQUEST"),

	/**
	 * The '<em><b>UNAUTHORIZED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAUTHORIZED_VALUE
	 * @generated
	 * @ordered
	 */
	UNAUTHORIZED(401, "UNAUTHORIZED", "UNAUTHORIZED"),

	/**
	 * The '<em><b>PAYMENT REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_REQUIRED(402, "PAYMENT_REQUIRED", "PAYMENT REQUIRED"),

	/**
	 * The '<em><b>FORBIDDEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORBIDDEN_VALUE
	 * @generated
	 * @ordered
	 */
	FORBIDDEN(403, "FORBIDDEN", "FORBIDDEN"),

	/**
	 * The '<em><b>NOT FOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_FOUND_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_FOUND(404, "NOT_FOUND", "NOT FOUND"),

	/**
	 * The '<em><b>METHOD NOT ALLOWED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_NOT_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_NOT_ALLOWED(405, "METHOD_NOT_ALLOWED", "METHOD NOT ALLOWED"),

	/**
	 * The '<em><b>NOT ACCEPTABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ACCEPTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ACCEPTABLE(406, "NOT_ACCEPTABLE", "NOT ACCEPTABLE"),

	/**
	 * The '<em><b>PROXY AUTHENTICATION REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXY_AUTHENTICATION_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	PROXY_AUTHENTICATION_REQUIRED(407, "PROXY_AUTHENTICATION_REQUIRED", "PROXY AUTHENTICATION REQUIRED"),

	/**
	 * The '<em><b>REQUEST TIMEOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_TIMEOUT(408, "REQUEST_TIMEOUT", "REQUEST TIMEOUT"),

	/**
	 * The '<em><b>CONFLICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICT(409, "CONFLICT", "CONFLICT"),

	/**
	 * The '<em><b>GONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GONE_VALUE
	 * @generated
	 * @ordered
	 */
	GONE(410, "GONE", "GONE"),

	/**
	 * The '<em><b>LENGTH REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH_REQUIRED(411, "LENGTH_REQUIRED", "LENGTH REQUIRED"),

	/**
	 * The '<em><b>PRECONDITION FAILED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECONDITION_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	PRECONDITION_FAILED(412, "PRECONDITION_FAILED", "PRECONDITION FAILED"),

	/**
	 * The '<em><b>REQUEST TOO LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TOO_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_TOO_LONG(413, "REQUEST_TOO_LONG", "REQUEST TOO LONG"),

	/**
	 * The '<em><b>REQUEST URI TOO LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_URI_TOO_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_URI_TOO_LONG(414, "REQUEST_URI_TOO_LONG", "REQUEST URI TOO LONG"),

	/**
	 * The '<em><b>UNSUPPORTED MEDIA TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED_MEDIA_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUPPORTED_MEDIA_TYPE(415, "UNSUPPORTED_MEDIA_TYPE", "UNSUPPORTED MEDIA TYPE"),

	/**
	 * The '<em><b>REQUESTED RANGE NOT SATISFIABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_RANGE_NOT_SATISFIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTED_RANGE_NOT_SATISFIABLE(416, "REQUESTED_RANGE_NOT_SATISFIABLE", "REQUESTED RANGE NOT SATISFIABLE"),

	/**
	 * The '<em><b>EXPECTATION FAILED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPECTATION_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	EXPECTATION_FAILED(417, "EXPECTATION_FAILED", "EXPECTATION FAILED"),

	/**
	 * The '<em><b>INSUFFICIENT SPACE ON RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSUFFICIENT_SPACE_ON_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	INSUFFICIENT_SPACE_ON_RESOURCE(419, "INSUFFICIENT_SPACE_ON_RESOURCE", "INSUFFICIENT SPACE ON RESOURCE"),

	/**
	 * The '<em><b>METHOD FAILURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_FAILURE(420, "METHOD_FAILURE", "METHOD FAILURE"),

	/**
	 * The '<em><b>UNPROCESSABLE ENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPROCESSABLE_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	UNPROCESSABLE_ENTITY(422, "UNPROCESSABLE_ENTITY", "UNPROCESSABLE ENTITY"),

	/**
	 * The '<em><b>LOCKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	LOCKED(423, "LOCKED", "LOCKED"),

	/**
	 * The '<em><b>FAILED DEPENDENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED_DEPENDENCY_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED_DEPENDENCY(424, "FAILED_DEPENDENCY", "FAILED DEPENDENCY"),

	/**
	 * The '<em><b>INTERNAL SERVER ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_SERVER_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR", "INTERNAL SERVER ERROR"),

	/**
	 * The '<em><b>NOT IMPLEMENTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_IMPLEMENTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_IMPLEMENTED(501, "NOT_IMPLEMENTED", "NOT IMPLEMENTED"),

	/**
	 * The '<em><b>BAD GATEWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_GATEWAY(502, "BAD_GATEWAY", "BAD GATEWAY"),

	/**
	 * The '<em><b>SERVICE UNAVAILABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_UNAVAILABLE(503, "SERVICE_UNAVAILABLE", "SERVICE UNAVAILABLE"),

	/**
	 * The '<em><b>GATEWAY TIMEOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	GATEWAY_TIMEOUT(504, "GATEWAY_TIMEOUT", "GATEWAY TIMEOUT"),

	/**
	 * The '<em><b>HTTP VERSION NOT SUPPORTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_VERSION_NOT_SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_VERSION_NOT_SUPPORTED(505, "HTTP_VERSION_NOT_SUPPORTED", "HTTP VERSION NOT SUPPORTED"),

	/**
	 * The '<em><b>INSUFFICIENT STORAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSUFFICIENT_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	INSUFFICIENT_STORAGE(507, "INSUFFICIENT_STORAGE", "INSUFFICIENT STORAGE");

	/**
	 * The '<em><b>CONTINUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTINUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUE_VALUE = 100;

	/**
	 * The '<em><b>SWITCHING PROTOCOLS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SWITCHING PROTOCOLS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWITCHING_PROTOCOLS
	 * @model literal="SWITCHING PROTOCOLS"
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_PROTOCOLS_VALUE = 101;

	/**
	 * The '<em><b>PROCESSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESSING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSING_VALUE = 102;

	/**
	 * The '<em><b>OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 200;

	/**
	 * The '<em><b>CREATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREATED_VALUE = 201;

	/**
	 * The '<em><b>ACCEPTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCEPTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 202;

	/**
	 * The '<em><b>NON AUTHORITATIVE INFORMATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NON AUTHORITATIVE INFORMATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_AUTHORITATIVE_INFORMATION
	 * @model literal="NON AUTHORITATIVE INFORMATION"
	 * @generated
	 * @ordered
	 */
	public static final int NON_AUTHORITATIVE_INFORMATION_VALUE = 203;

	/**
	 * The '<em><b>NO CONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO CONTENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CONTENT
	 * @model literal="NO CONTENT"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONTENT_VALUE = 204;

	/**
	 * The '<em><b>RESET CONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESET CONTENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESET_CONTENT
	 * @model literal="RESET CONTENT"
	 * @generated
	 * @ordered
	 */
	public static final int RESET_CONTENT_VALUE = 205;

	/**
	 * The '<em><b>PARTIAL CONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARTIAL CONTENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_CONTENT
	 * @model literal="PARTIAL CONTENT"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_CONTENT_VALUE = 206;

	/**
	 * The '<em><b>MULTI STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_STATUS
	 * @model literal="MULTI STATUS"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_STATUS_VALUE = 207;

	/**
	 * The '<em><b>MULTIPLE CHOICES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLE CHOICES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_CHOICES
	 * @model literal="MULTIPLE CHOICES"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_CHOICES_VALUE = 300;

	/**
	 * The '<em><b>MOVED PERMANENTLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVED PERMANENTLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVED_PERMANENTLY
	 * @model literal="MOVED PERMANENTLY"
	 * @generated
	 * @ordered
	 */
	public static final int MOVED_PERMANENTLY_VALUE = 301;

	/**
	 * The '<em><b>MOVED TEMPORARILY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVED TEMPORARILY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVED_TEMPORARILY
	 * @model literal="MOVED TEMPORARILY"
	 * @generated
	 * @ordered
	 */
	public static final int MOVED_TEMPORARILY_VALUE = 302;

	/**
	 * The '<em><b>SEE OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEE OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEE_OTHER
	 * @model literal="SEE OTHER"
	 * @generated
	 * @ordered
	 */
	public static final int SEE_OTHER_VALUE = 303;

	/**
	 * The '<em><b>NOT MODIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT MODIFIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_MODIFIED
	 * @model literal="NOT MODIFIED"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_MODIFIED_VALUE = 304;

	/**
	 * The '<em><b>USE PROXY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USE PROXY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USE_PROXY
	 * @model literal="USE PROXY"
	 * @generated
	 * @ordered
	 */
	public static final int USE_PROXY_VALUE = 305;

	/**
	 * The '<em><b>TEMPORARY REDIRECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPORARY REDIRECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPORARY_REDIRECT
	 * @model literal="TEMPORARY REDIRECT"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORARY_REDIRECT_VALUE = 307;

	/**
	 * The '<em><b>BAD REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAD REQUEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_REQUEST
	 * @model literal="BAD REQUEST"
	 * @generated
	 * @ordered
	 */
	public static final int BAD_REQUEST_VALUE = 400;

	/**
	 * The '<em><b>UNAUTHORIZED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNAUTHORIZED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNAUTHORIZED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNAUTHORIZED_VALUE = 401;

	/**
	 * The '<em><b>PAYMENT REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAYMENT REQUIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_REQUIRED
	 * @model literal="PAYMENT REQUIRED"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_REQUIRED_VALUE = 402;

	/**
	 * The '<em><b>FORBIDDEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORBIDDEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORBIDDEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FORBIDDEN_VALUE = 403;

	/**
	 * The '<em><b>NOT FOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT FOUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_FOUND
	 * @model literal="NOT FOUND"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_FOUND_VALUE = 404;

	/**
	 * The '<em><b>METHOD NOT ALLOWED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METHOD NOT ALLOWED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_NOT_ALLOWED
	 * @model literal="METHOD NOT ALLOWED"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_NOT_ALLOWED_VALUE = 405;

	/**
	 * The '<em><b>NOT ACCEPTABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT ACCEPTABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_ACCEPTABLE
	 * @model literal="NOT ACCEPTABLE"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ACCEPTABLE_VALUE = 406;

	/**
	 * The '<em><b>PROXY AUTHENTICATION REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROXY AUTHENTICATION REQUIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROXY_AUTHENTICATION_REQUIRED
	 * @model literal="PROXY AUTHENTICATION REQUIRED"
	 * @generated
	 * @ordered
	 */
	public static final int PROXY_AUTHENTICATION_REQUIRED_VALUE = 407;

	/**
	 * The '<em><b>REQUEST TIMEOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST TIMEOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TIMEOUT
	 * @model literal="REQUEST TIMEOUT"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_TIMEOUT_VALUE = 408;

	/**
	 * The '<em><b>CONFLICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFLICT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFLICT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICT_VALUE = 409;

	/**
	 * The '<em><b>GONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GONE_VALUE = 410;

	/**
	 * The '<em><b>LENGTH REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LENGTH REQUIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LENGTH_REQUIRED
	 * @model literal="LENGTH REQUIRED"
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_REQUIRED_VALUE = 411;

	/**
	 * The '<em><b>PRECONDITION FAILED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRECONDITION FAILED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRECONDITION_FAILED
	 * @model literal="PRECONDITION FAILED"
	 * @generated
	 * @ordered
	 */
	public static final int PRECONDITION_FAILED_VALUE = 412;

	/**
	 * The '<em><b>REQUEST TOO LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST TOO LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TOO_LONG
	 * @model literal="REQUEST TOO LONG"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_TOO_LONG_VALUE = 413;

	/**
	 * The '<em><b>REQUEST URI TOO LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST URI TOO LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_URI_TOO_LONG
	 * @model literal="REQUEST URI TOO LONG"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_URI_TOO_LONG_VALUE = 414;

	/**
	 * The '<em><b>UNSUPPORTED MEDIA TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSUPPORTED MEDIA TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED_MEDIA_TYPE
	 * @model literal="UNSUPPORTED MEDIA TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int UNSUPPORTED_MEDIA_TYPE_VALUE = 415;

	/**
	 * The '<em><b>REQUESTED RANGE NOT SATISFIABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUESTED RANGE NOT SATISFIABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_RANGE_NOT_SATISFIABLE
	 * @model literal="REQUESTED RANGE NOT SATISFIABLE"
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTED_RANGE_NOT_SATISFIABLE_VALUE = 416;

	/**
	 * The '<em><b>EXPECTATION FAILED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPECTATION FAILED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPECTATION_FAILED
	 * @model literal="EXPECTATION FAILED"
	 * @generated
	 * @ordered
	 */
	public static final int EXPECTATION_FAILED_VALUE = 417;

	/**
	 * The '<em><b>INSUFFICIENT SPACE ON RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSUFFICIENT SPACE ON RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSUFFICIENT_SPACE_ON_RESOURCE
	 * @model literal="INSUFFICIENT SPACE ON RESOURCE"
	 * @generated
	 * @ordered
	 */
	public static final int INSUFFICIENT_SPACE_ON_RESOURCE_VALUE = 419;

	/**
	 * The '<em><b>METHOD FAILURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METHOD FAILURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_FAILURE
	 * @model literal="METHOD FAILURE"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_FAILURE_VALUE = 420;

	/**
	 * The '<em><b>UNPROCESSABLE ENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNPROCESSABLE ENTITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNPROCESSABLE_ENTITY
	 * @model literal="UNPROCESSABLE ENTITY"
	 * @generated
	 * @ordered
	 */
	public static final int UNPROCESSABLE_ENTITY_VALUE = 422;

	/**
	 * The '<em><b>LOCKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCKED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCKED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCKED_VALUE = 423;

	/**
	 * The '<em><b>FAILED DEPENDENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAILED DEPENDENCY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILED_DEPENDENCY
	 * @model literal="FAILED DEPENDENCY"
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_DEPENDENCY_VALUE = 424;

	/**
	 * The '<em><b>INTERNAL SERVER ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERNAL SERVER ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_SERVER_ERROR
	 * @model literal="INTERNAL SERVER ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_SERVER_ERROR_VALUE = 500;

	/**
	 * The '<em><b>NOT IMPLEMENTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT IMPLEMENTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_IMPLEMENTED
	 * @model literal="NOT IMPLEMENTED"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_IMPLEMENTED_VALUE = 501;

	/**
	 * The '<em><b>BAD GATEWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAD GATEWAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_GATEWAY
	 * @model literal="BAD GATEWAY"
	 * @generated
	 * @ordered
	 */
	public static final int BAD_GATEWAY_VALUE = 502;

	/**
	 * The '<em><b>SERVICE UNAVAILABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICE UNAVAILABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_UNAVAILABLE
	 * @model literal="SERVICE UNAVAILABLE"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_UNAVAILABLE_VALUE = 503;

	/**
	 * The '<em><b>GATEWAY TIMEOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GATEWAY TIMEOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_TIMEOUT
	 * @model literal="GATEWAY TIMEOUT"
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_TIMEOUT_VALUE = 504;

	/**
	 * The '<em><b>HTTP VERSION NOT SUPPORTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HTTP VERSION NOT SUPPORTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTTP_VERSION_NOT_SUPPORTED
	 * @model literal="HTTP VERSION NOT SUPPORTED"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_VERSION_NOT_SUPPORTED_VALUE = 505;

	/**
	 * The '<em><b>INSUFFICIENT STORAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSUFFICIENT STORAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSUFFICIENT_STORAGE
	 * @model literal="INSUFFICIENT STORAGE"
	 * @generated
	 * @ordered
	 */
	public static final int INSUFFICIENT_STORAGE_VALUE = 507;

	/**
	 * An array of all the '<em><b>Status Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatusCode[] VALUES_ARRAY =
		new StatusCode[] {
			CONTINUE,
			SWITCHING_PROTOCOLS,
			PROCESSING,
			OK,
			CREATED,
			ACCEPTED,
			NON_AUTHORITATIVE_INFORMATION,
			NO_CONTENT,
			RESET_CONTENT,
			PARTIAL_CONTENT,
			MULTI_STATUS,
			MULTIPLE_CHOICES,
			MOVED_PERMANENTLY,
			MOVED_TEMPORARILY,
			SEE_OTHER,
			NOT_MODIFIED,
			USE_PROXY,
			TEMPORARY_REDIRECT,
			BAD_REQUEST,
			UNAUTHORIZED,
			PAYMENT_REQUIRED,
			FORBIDDEN,
			NOT_FOUND,
			METHOD_NOT_ALLOWED,
			NOT_ACCEPTABLE,
			PROXY_AUTHENTICATION_REQUIRED,
			REQUEST_TIMEOUT,
			CONFLICT,
			GONE,
			LENGTH_REQUIRED,
			PRECONDITION_FAILED,
			REQUEST_TOO_LONG,
			REQUEST_URI_TOO_LONG,
			UNSUPPORTED_MEDIA_TYPE,
			REQUESTED_RANGE_NOT_SATISFIABLE,
			EXPECTATION_FAILED,
			INSUFFICIENT_SPACE_ON_RESOURCE,
			METHOD_FAILURE,
			UNPROCESSABLE_ENTITY,
			LOCKED,
			FAILED_DEPENDENCY,
			INTERNAL_SERVER_ERROR,
			NOT_IMPLEMENTED,
			BAD_GATEWAY,
			SERVICE_UNAVAILABLE,
			GATEWAY_TIMEOUT,
			HTTP_VERSION_NOT_SUPPORTED,
			INSUFFICIENT_STORAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Status Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatusCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCode get(int value) {
		switch (value) {
			case CONTINUE_VALUE: return CONTINUE;
			case SWITCHING_PROTOCOLS_VALUE: return SWITCHING_PROTOCOLS;
			case PROCESSING_VALUE: return PROCESSING;
			case OK_VALUE: return OK;
			case CREATED_VALUE: return CREATED;
			case ACCEPTED_VALUE: return ACCEPTED;
			case NON_AUTHORITATIVE_INFORMATION_VALUE: return NON_AUTHORITATIVE_INFORMATION;
			case NO_CONTENT_VALUE: return NO_CONTENT;
			case RESET_CONTENT_VALUE: return RESET_CONTENT;
			case PARTIAL_CONTENT_VALUE: return PARTIAL_CONTENT;
			case MULTI_STATUS_VALUE: return MULTI_STATUS;
			case MULTIPLE_CHOICES_VALUE: return MULTIPLE_CHOICES;
			case MOVED_PERMANENTLY_VALUE: return MOVED_PERMANENTLY;
			case MOVED_TEMPORARILY_VALUE: return MOVED_TEMPORARILY;
			case SEE_OTHER_VALUE: return SEE_OTHER;
			case NOT_MODIFIED_VALUE: return NOT_MODIFIED;
			case USE_PROXY_VALUE: return USE_PROXY;
			case TEMPORARY_REDIRECT_VALUE: return TEMPORARY_REDIRECT;
			case BAD_REQUEST_VALUE: return BAD_REQUEST;
			case UNAUTHORIZED_VALUE: return UNAUTHORIZED;
			case PAYMENT_REQUIRED_VALUE: return PAYMENT_REQUIRED;
			case FORBIDDEN_VALUE: return FORBIDDEN;
			case NOT_FOUND_VALUE: return NOT_FOUND;
			case METHOD_NOT_ALLOWED_VALUE: return METHOD_NOT_ALLOWED;
			case NOT_ACCEPTABLE_VALUE: return NOT_ACCEPTABLE;
			case PROXY_AUTHENTICATION_REQUIRED_VALUE: return PROXY_AUTHENTICATION_REQUIRED;
			case REQUEST_TIMEOUT_VALUE: return REQUEST_TIMEOUT;
			case CONFLICT_VALUE: return CONFLICT;
			case GONE_VALUE: return GONE;
			case LENGTH_REQUIRED_VALUE: return LENGTH_REQUIRED;
			case PRECONDITION_FAILED_VALUE: return PRECONDITION_FAILED;
			case REQUEST_TOO_LONG_VALUE: return REQUEST_TOO_LONG;
			case REQUEST_URI_TOO_LONG_VALUE: return REQUEST_URI_TOO_LONG;
			case UNSUPPORTED_MEDIA_TYPE_VALUE: return UNSUPPORTED_MEDIA_TYPE;
			case REQUESTED_RANGE_NOT_SATISFIABLE_VALUE: return REQUESTED_RANGE_NOT_SATISFIABLE;
			case EXPECTATION_FAILED_VALUE: return EXPECTATION_FAILED;
			case INSUFFICIENT_SPACE_ON_RESOURCE_VALUE: return INSUFFICIENT_SPACE_ON_RESOURCE;
			case METHOD_FAILURE_VALUE: return METHOD_FAILURE;
			case UNPROCESSABLE_ENTITY_VALUE: return UNPROCESSABLE_ENTITY;
			case LOCKED_VALUE: return LOCKED;
			case FAILED_DEPENDENCY_VALUE: return FAILED_DEPENDENCY;
			case INTERNAL_SERVER_ERROR_VALUE: return INTERNAL_SERVER_ERROR;
			case NOT_IMPLEMENTED_VALUE: return NOT_IMPLEMENTED;
			case BAD_GATEWAY_VALUE: return BAD_GATEWAY;
			case SERVICE_UNAVAILABLE_VALUE: return SERVICE_UNAVAILABLE;
			case GATEWAY_TIMEOUT_VALUE: return GATEWAY_TIMEOUT;
			case HTTP_VERSION_NOT_SUPPORTED_VALUE: return HTTP_VERSION_NOT_SUPPORTED;
			case INSUFFICIENT_STORAGE_VALUE: return INSUFFICIENT_STORAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StatusCode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StatusCode
