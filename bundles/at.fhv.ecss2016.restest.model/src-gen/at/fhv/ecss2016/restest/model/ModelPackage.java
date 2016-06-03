/**
 */
package at.fhv.ecss2016.restest.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.fhv.ecss2016.restest.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://at.fhv.ecss2016.restest/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "restestModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = at.fhv.ecss2016.restest.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.fhv.ecss2016.restest.model.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhv.ecss2016.restest.model.impl.ConfigImpl
	 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Request URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__REQUEST_URL = 1;

	/**
	 * The feature id for the '<em><b>Http Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__HTTP_VERB = 2;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__CONTENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Request Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__REQUEST_BODY = 4;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__RESPONSE = 5;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.fhv.ecss2016.restest.model.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhv.ecss2016.restest.model.impl.ScenarioImpl
	 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Scenario File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO_FILE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Config Expected Result Pair List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONFIG_EXPECTED_RESULT_PAIR_LIST = 1;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.fhv.ecss2016.restest.model.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhv.ecss2016.restest.model.impl.ResponseImpl
	 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__STATUS_CODE = 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__CONTENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Response Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_BODY = 3;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.fhv.ecss2016.restest.model.impl.ExpectedResultImpl <em>Expected Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhv.ecss2016.restest.model.impl.ExpectedResultImpl
	 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getExpectedResult()
	 * @generated
	 */
	int EXPECTED_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESULT__STATUS_CODE = 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESULT__CONTENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Response Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESULT__RESPONSE_BODY = 2;

	/**
	 * The number of structural features of the '<em>Expected Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Expected Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.fhv.ecss2016.restest.model.impl.ConfigExpectedResultPairImpl <em>Config Expected Result Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhv.ecss2016.restest.model.impl.ConfigExpectedResultPairImpl
	 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getConfigExpectedResultPair()
	 * @generated
	 */
	int CONFIG_EXPECTED_RESULT_PAIR = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_EXPECTED_RESULT_PAIR__CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Expected Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_EXPECTED_RESULT_PAIR__EXPECTED_RESULT = 1;

	/**
	 * The number of structural features of the '<em>Config Expected Result Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_EXPECTED_RESULT_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Config Expected Result Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_EXPECTED_RESULT_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.fhv.ecss2016.restest.model.ContentType <em>Content Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhv.ecss2016.restest.model.ContentType
	 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 5;

	/**
	 * The meta object id for the '{@link at.fhv.ecss2016.restest.model.HttpVerb <em>Http Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhv.ecss2016.restest.model.HttpVerb
	 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getHttpVerb()
	 * @generated
	 */
	int HTTP_VERB = 6;

	/**
	 * The meta object id for the '{@link at.fhv.ecss2016.restest.model.StatusCode <em>Status Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhv.ecss2016.restest.model.StatusCode
	 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getStatusCode()
	 * @generated
	 */
	int STATUS_CODE = 7;


	/**
	 * Returns the meta object for class '{@link at.fhv.ecss2016.restest.model.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see at.fhv.ecss2016.restest.model.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Config#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.fhv.ecss2016.restest.model.Config#getName()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Config#getRequestURL <em>Request URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request URL</em>'.
	 * @see at.fhv.ecss2016.restest.model.Config#getRequestURL()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_RequestURL();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Config#getHttpVerb <em>Http Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Verb</em>'.
	 * @see at.fhv.ecss2016.restest.model.Config#getHttpVerb()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_HttpVerb();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Config#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see at.fhv.ecss2016.restest.model.Config#getContentType()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Config#getRequestBody <em>Request Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Body</em>'.
	 * @see at.fhv.ecss2016.restest.model.Config#getRequestBody()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_RequestBody();

	/**
	 * Returns the meta object for the reference '{@link at.fhv.ecss2016.restest.model.Config#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see at.fhv.ecss2016.restest.model.Config#getResponse()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Response();

	/**
	 * Returns the meta object for class '{@link at.fhv.ecss2016.restest.model.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see at.fhv.ecss2016.restest.model.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Scenario#getScenarioFilePath <em>Scenario File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario File Path</em>'.
	 * @see at.fhv.ecss2016.restest.model.Scenario#getScenarioFilePath()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_ScenarioFilePath();

	/**
	 * Returns the meta object for the reference list '{@link at.fhv.ecss2016.restest.model.Scenario#getConfigExpectedResultPairList <em>Config Expected Result Pair List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config Expected Result Pair List</em>'.
	 * @see at.fhv.ecss2016.restest.model.Scenario#getConfigExpectedResultPairList()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ConfigExpectedResultPairList();

	/**
	 * Returns the meta object for class '{@link at.fhv.ecss2016.restest.model.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see at.fhv.ecss2016.restest.model.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Response#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Code</em>'.
	 * @see at.fhv.ecss2016.restest.model.Response#getStatusCode()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_StatusCode();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Response#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see at.fhv.ecss2016.restest.model.Response#getContentType()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Response#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see at.fhv.ecss2016.restest.model.Response#getResponseTime()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_ResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Response#getResponseBody <em>Response Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Body</em>'.
	 * @see at.fhv.ecss2016.restest.model.Response#getResponseBody()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_ResponseBody();

	/**
	 * Returns the meta object for class '{@link at.fhv.ecss2016.restest.model.ExpectedResult <em>Expected Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Result</em>'.
	 * @see at.fhv.ecss2016.restest.model.ExpectedResult
	 * @generated
	 */
	EClass getExpectedResult();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.ExpectedResult#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Code</em>'.
	 * @see at.fhv.ecss2016.restest.model.ExpectedResult#getStatusCode()
	 * @see #getExpectedResult()
	 * @generated
	 */
	EAttribute getExpectedResult_StatusCode();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.ExpectedResult#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see at.fhv.ecss2016.restest.model.ExpectedResult#getContentType()
	 * @see #getExpectedResult()
	 * @generated
	 */
	EAttribute getExpectedResult_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.ExpectedResult#getResponseBody <em>Response Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Body</em>'.
	 * @see at.fhv.ecss2016.restest.model.ExpectedResult#getResponseBody()
	 * @see #getExpectedResult()
	 * @generated
	 */
	EAttribute getExpectedResult_ResponseBody();

	/**
	 * Returns the meta object for class '{@link at.fhv.ecss2016.restest.model.ConfigExpectedResultPair <em>Config Expected Result Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Expected Result Pair</em>'.
	 * @see at.fhv.ecss2016.restest.model.ConfigExpectedResultPair
	 * @generated
	 */
	EClass getConfigExpectedResultPair();

	/**
	 * Returns the meta object for the reference '{@link at.fhv.ecss2016.restest.model.ConfigExpectedResultPair#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config</em>'.
	 * @see at.fhv.ecss2016.restest.model.ConfigExpectedResultPair#getConfig()
	 * @see #getConfigExpectedResultPair()
	 * @generated
	 */
	EReference getConfigExpectedResultPair_Config();

	/**
	 * Returns the meta object for the reference '{@link at.fhv.ecss2016.restest.model.ConfigExpectedResultPair#getExpectedResult <em>Expected Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expected Result</em>'.
	 * @see at.fhv.ecss2016.restest.model.ConfigExpectedResultPair#getExpectedResult()
	 * @see #getConfigExpectedResultPair()
	 * @generated
	 */
	EReference getConfigExpectedResultPair_ExpectedResult();

	/**
	 * Returns the meta object for enum '{@link at.fhv.ecss2016.restest.model.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Content Type</em>'.
	 * @see at.fhv.ecss2016.restest.model.ContentType
	 * @generated
	 */
	EEnum getContentType();

	/**
	 * Returns the meta object for enum '{@link at.fhv.ecss2016.restest.model.HttpVerb <em>Http Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Verb</em>'.
	 * @see at.fhv.ecss2016.restest.model.HttpVerb
	 * @generated
	 */
	EEnum getHttpVerb();

	/**
	 * Returns the meta object for enum '{@link at.fhv.ecss2016.restest.model.StatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Code</em>'.
	 * @see at.fhv.ecss2016.restest.model.StatusCode
	 * @generated
	 */
	EEnum getStatusCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.impl.ConfigImpl
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__NAME = eINSTANCE.getConfig_Name();

		/**
		 * The meta object literal for the '<em><b>Request URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__REQUEST_URL = eINSTANCE.getConfig_RequestURL();

		/**
		 * The meta object literal for the '<em><b>Http Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__HTTP_VERB = eINSTANCE.getConfig_HttpVerb();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__CONTENT_TYPE = eINSTANCE.getConfig_ContentType();

		/**
		 * The meta object literal for the '<em><b>Request Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__REQUEST_BODY = eINSTANCE.getConfig_RequestBody();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__RESPONSE = eINSTANCE.getConfig_Response();

		/**
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.impl.ScenarioImpl
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Scenario File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__SCENARIO_FILE_PATH = eINSTANCE.getScenario_ScenarioFilePath();

		/**
		 * The meta object literal for the '<em><b>Config Expected Result Pair List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CONFIG_EXPECTED_RESULT_PAIR_LIST = eINSTANCE.getScenario_ConfigExpectedResultPairList();

		/**
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.impl.ResponseImpl
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__STATUS_CODE = eINSTANCE.getResponse_StatusCode();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__CONTENT_TYPE = eINSTANCE.getResponse_ContentType();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__RESPONSE_TIME = eINSTANCE.getResponse_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Response Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__RESPONSE_BODY = eINSTANCE.getResponse_ResponseBody();

		/**
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.impl.ExpectedResultImpl <em>Expected Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.impl.ExpectedResultImpl
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getExpectedResult()
		 * @generated
		 */
		EClass EXPECTED_RESULT = eINSTANCE.getExpectedResult();

		/**
		 * The meta object literal for the '<em><b>Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_RESULT__STATUS_CODE = eINSTANCE.getExpectedResult_StatusCode();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_RESULT__CONTENT_TYPE = eINSTANCE.getExpectedResult_ContentType();

		/**
		 * The meta object literal for the '<em><b>Response Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_RESULT__RESPONSE_BODY = eINSTANCE.getExpectedResult_ResponseBody();

		/**
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.impl.ConfigExpectedResultPairImpl <em>Config Expected Result Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.impl.ConfigExpectedResultPairImpl
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getConfigExpectedResultPair()
		 * @generated
		 */
		EClass CONFIG_EXPECTED_RESULT_PAIR = eINSTANCE.getConfigExpectedResultPair();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_EXPECTED_RESULT_PAIR__CONFIG = eINSTANCE.getConfigExpectedResultPair_Config();

		/**
		 * The meta object literal for the '<em><b>Expected Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_EXPECTED_RESULT_PAIR__EXPECTED_RESULT = eINSTANCE.getConfigExpectedResultPair_ExpectedResult();

		/**
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.ContentType <em>Content Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.ContentType
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getContentType()
		 * @generated
		 */
		EEnum CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.HttpVerb <em>Http Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.HttpVerb
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getHttpVerb()
		 * @generated
		 */
		EEnum HTTP_VERB = eINSTANCE.getHttpVerb();

		/**
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.StatusCode <em>Status Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.StatusCode
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getStatusCode()
		 * @generated
		 */
		EEnum STATUS_CODE = eINSTANCE.getStatusCode();

	}

} //ModelPackage
