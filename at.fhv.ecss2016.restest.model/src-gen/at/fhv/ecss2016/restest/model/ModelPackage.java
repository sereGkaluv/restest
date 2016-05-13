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
	 * The feature id for the '<em><b>Request URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__REQUEST_URL = 0;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__VERB = 1;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__CONTENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Request Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__REQUEST_BODY = 3;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Scenarios File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIOS_FILE = 0;

	/**
	 * The feature id for the '<em><b>Config Result Pairs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONFIG_RESULT_PAIRS = 1;

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
	 * The feature id for the '<em><b>Response Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Response Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_CONTENT_TYPE = 1;

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
	 * The feature id for the '<em><b>Response Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESULT__RESPONSE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Response Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESULT__RESPONSE_CONTENT_TYPE = 1;

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
	 * The meta object id for the '{@link at.fhv.ecss2016.restest.model.impl.ConfigResultPairImpl <em>Config Result Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhv.ecss2016.restest.model.impl.ConfigResultPairImpl
	 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getConfigResultPair()
	 * @generated
	 */
	int CONFIG_RESULT_PAIR = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_RESULT_PAIR__CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_RESULT_PAIR__RESPONSE = 1;

	/**
	 * The number of structural features of the '<em>Config Result Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_RESULT_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Config Result Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_RESULT_PAIR_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link at.fhv.ecss2016.restest.model.HTTPVerb <em>HTTP Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhv.ecss2016.restest.model.HTTPVerb
	 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getHTTPVerb()
	 * @generated
	 */
	int HTTP_VERB = 6;


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
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Config#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verb</em>'.
	 * @see at.fhv.ecss2016.restest.model.Config#getVerb()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Verb();

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
	 * Returns the meta object for class '{@link at.fhv.ecss2016.restest.model.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see at.fhv.ecss2016.restest.model.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Scenario#getScenariosFile <em>Scenarios File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenarios File</em>'.
	 * @see at.fhv.ecss2016.restest.model.Scenario#getScenariosFile()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_ScenariosFile();

	/**
	 * Returns the meta object for the reference list '{@link at.fhv.ecss2016.restest.model.Scenario#getConfigResultPairs <em>Config Result Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config Result Pairs</em>'.
	 * @see at.fhv.ecss2016.restest.model.Scenario#getConfigResultPairs()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ConfigResultPairs();

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
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Response#getResponseCode <em>Response Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Code</em>'.
	 * @see at.fhv.ecss2016.restest.model.Response#getResponseCode()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_ResponseCode();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.Response#getResponseContentType <em>Response Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Content Type</em>'.
	 * @see at.fhv.ecss2016.restest.model.Response#getResponseContentType()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_ResponseContentType();

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
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.ExpectedResult#getResponseCode <em>Response Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Code</em>'.
	 * @see at.fhv.ecss2016.restest.model.ExpectedResult#getResponseCode()
	 * @see #getExpectedResult()
	 * @generated
	 */
	EAttribute getExpectedResult_ResponseCode();

	/**
	 * Returns the meta object for the attribute '{@link at.fhv.ecss2016.restest.model.ExpectedResult#getResponseContentType <em>Response Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Content Type</em>'.
	 * @see at.fhv.ecss2016.restest.model.ExpectedResult#getResponseContentType()
	 * @see #getExpectedResult()
	 * @generated
	 */
	EAttribute getExpectedResult_ResponseContentType();

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
	 * Returns the meta object for class '{@link at.fhv.ecss2016.restest.model.ConfigResultPair <em>Config Result Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Result Pair</em>'.
	 * @see at.fhv.ecss2016.restest.model.ConfigResultPair
	 * @generated
	 */
	EClass getConfigResultPair();

	/**
	 * Returns the meta object for the reference '{@link at.fhv.ecss2016.restest.model.ConfigResultPair#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config</em>'.
	 * @see at.fhv.ecss2016.restest.model.ConfigResultPair#getConfig()
	 * @see #getConfigResultPair()
	 * @generated
	 */
	EReference getConfigResultPair_Config();

	/**
	 * Returns the meta object for the reference '{@link at.fhv.ecss2016.restest.model.ConfigResultPair#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see at.fhv.ecss2016.restest.model.ConfigResultPair#getResponse()
	 * @see #getConfigResultPair()
	 * @generated
	 */
	EReference getConfigResultPair_Response();

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
	 * Returns the meta object for enum '{@link at.fhv.ecss2016.restest.model.HTTPVerb <em>HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP Verb</em>'.
	 * @see at.fhv.ecss2016.restest.model.HTTPVerb
	 * @generated
	 */
	EEnum getHTTPVerb();

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
		 * The meta object literal for the '<em><b>Request URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__REQUEST_URL = eINSTANCE.getConfig_RequestURL();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__VERB = eINSTANCE.getConfig_Verb();

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
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.impl.ScenarioImpl
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Scenarios File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__SCENARIOS_FILE = eINSTANCE.getScenario_ScenariosFile();

		/**
		 * The meta object literal for the '<em><b>Config Result Pairs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CONFIG_RESULT_PAIRS = eINSTANCE.getScenario_ConfigResultPairs();

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
		 * The meta object literal for the '<em><b>Response Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__RESPONSE_CODE = eINSTANCE.getResponse_ResponseCode();

		/**
		 * The meta object literal for the '<em><b>Response Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__RESPONSE_CONTENT_TYPE = eINSTANCE.getResponse_ResponseContentType();

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
		 * The meta object literal for the '<em><b>Response Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_RESULT__RESPONSE_CODE = eINSTANCE.getExpectedResult_ResponseCode();

		/**
		 * The meta object literal for the '<em><b>Response Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_RESULT__RESPONSE_CONTENT_TYPE = eINSTANCE.getExpectedResult_ResponseContentType();

		/**
		 * The meta object literal for the '<em><b>Response Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_RESULT__RESPONSE_BODY = eINSTANCE.getExpectedResult_ResponseBody();

		/**
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.impl.ConfigResultPairImpl <em>Config Result Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.impl.ConfigResultPairImpl
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getConfigResultPair()
		 * @generated
		 */
		EClass CONFIG_RESULT_PAIR = eINSTANCE.getConfigResultPair();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_RESULT_PAIR__CONFIG = eINSTANCE.getConfigResultPair_Config();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_RESULT_PAIR__RESPONSE = eINSTANCE.getConfigResultPair_Response();

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
		 * The meta object literal for the '{@link at.fhv.ecss2016.restest.model.HTTPVerb <em>HTTP Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhv.ecss2016.restest.model.HTTPVerb
		 * @see at.fhv.ecss2016.restest.model.impl.ModelPackageImpl#getHTTPVerb()
		 * @generated
		 */
		EEnum HTTP_VERB = eINSTANCE.getHTTPVerb();

	}

} //ModelPackage
