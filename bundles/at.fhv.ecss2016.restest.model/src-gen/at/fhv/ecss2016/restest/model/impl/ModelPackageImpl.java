/**
 */
package at.fhv.ecss2016.restest.model.impl;

import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ConfigExpectedResultPair;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.ExpectedResult;
import at.fhv.ecss2016.restest.model.HttpVerb;
import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.ModelPackage;
import at.fhv.ecss2016.restest.model.Response;
import at.fhv.ecss2016.restest.model.Scenario;
import at.fhv.ecss2016.restest.model.StatusCode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configExpectedResultPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpVerbEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusCodeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.fhv.ecss2016.restest.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Name() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_RequestURL() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_HttpVerb() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_ContentType() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_RequestBody() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Response() {
		return (EReference)configEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_ScenarioFilePath() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_ConfigExpectedResultPairList() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_StatusCode() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_ContentType() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_ResponseTime() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_ResponseBody() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectedResult() {
		return expectedResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectedResult_StatusCode() {
		return (EAttribute)expectedResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectedResult_ContentType() {
		return (EAttribute)expectedResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectedResult_ResponseBody() {
		return (EAttribute)expectedResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigExpectedResultPair() {
		return configExpectedResultPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigExpectedResultPair_Config() {
		return (EReference)configExpectedResultPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigExpectedResultPair_ExpectedResult() {
		return (EReference)configExpectedResultPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContentType() {
		return contentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpVerb() {
		return httpVerbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusCode() {
		return statusCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configEClass = createEClass(CONFIG);
		createEAttribute(configEClass, CONFIG__NAME);
		createEAttribute(configEClass, CONFIG__REQUEST_URL);
		createEAttribute(configEClass, CONFIG__HTTP_VERB);
		createEAttribute(configEClass, CONFIG__CONTENT_TYPE);
		createEAttribute(configEClass, CONFIG__REQUEST_BODY);
		createEReference(configEClass, CONFIG__RESPONSE);

		scenarioEClass = createEClass(SCENARIO);
		createEAttribute(scenarioEClass, SCENARIO__SCENARIO_FILE_PATH);
		createEReference(scenarioEClass, SCENARIO__CONFIG_EXPECTED_RESULT_PAIR_LIST);

		responseEClass = createEClass(RESPONSE);
		createEAttribute(responseEClass, RESPONSE__STATUS_CODE);
		createEAttribute(responseEClass, RESPONSE__CONTENT_TYPE);
		createEAttribute(responseEClass, RESPONSE__RESPONSE_TIME);
		createEAttribute(responseEClass, RESPONSE__RESPONSE_BODY);

		expectedResultEClass = createEClass(EXPECTED_RESULT);
		createEAttribute(expectedResultEClass, EXPECTED_RESULT__STATUS_CODE);
		createEAttribute(expectedResultEClass, EXPECTED_RESULT__CONTENT_TYPE);
		createEAttribute(expectedResultEClass, EXPECTED_RESULT__RESPONSE_BODY);

		configExpectedResultPairEClass = createEClass(CONFIG_EXPECTED_RESULT_PAIR);
		createEReference(configExpectedResultPairEClass, CONFIG_EXPECTED_RESULT_PAIR__CONFIG);
		createEReference(configExpectedResultPairEClass, CONFIG_EXPECTED_RESULT_PAIR__EXPECTED_RESULT);

		// Create enums
		contentTypeEEnum = createEEnum(CONTENT_TYPE);
		httpVerbEEnum = createEEnum(HTTP_VERB);
		statusCodeEEnum = createEEnum(STATUS_CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfig_Name(), ecorePackage.getEString(), "name", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_RequestURL(), ecorePackage.getEString(), "requestURL", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_HttpVerb(), this.getHttpVerb(), "httpVerb", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_ContentType(), this.getContentType(), "contentType", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_RequestBody(), ecorePackage.getEString(), "requestBody", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Response(), this.getResponse(), null, "response", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenario_ScenarioFilePath(), ecorePackage.getEString(), "scenarioFilePath", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_ConfigExpectedResultPairList(), this.getConfigExpectedResultPair(), null, "configExpectedResultPairList", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponse_StatusCode(), this.getStatusCode(), "statusCode", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponse_ContentType(), this.getContentType(), "contentType", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponse_ResponseTime(), ecorePackage.getEString(), "responseTime", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponse_ResponseBody(), ecorePackage.getEString(), "responseBody", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expectedResultEClass, ExpectedResult.class, "ExpectedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpectedResult_StatusCode(), this.getStatusCode(), "statusCode", null, 0, 1, ExpectedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpectedResult_ContentType(), this.getContentType(), "contentType", null, 0, 1, ExpectedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpectedResult_ResponseBody(), ecorePackage.getEString(), "responseBody", null, 0, 1, ExpectedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configExpectedResultPairEClass, ConfigExpectedResultPair.class, "ConfigExpectedResultPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigExpectedResultPair_Config(), this.getConfig(), null, "config", null, 0, 1, ConfigExpectedResultPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigExpectedResultPair_ExpectedResult(), this.getExpectedResult(), null, "expectedResult", null, 0, 1, ConfigExpectedResultPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contentTypeEEnum, ContentType.class, "ContentType");
		addEEnumLiteral(contentTypeEEnum, ContentType.TEXT);
		addEEnumLiteral(contentTypeEEnum, ContentType.TEXT_PLAIN);
		addEEnumLiteral(contentTypeEEnum, ContentType.JSON);
		addEEnumLiteral(contentTypeEEnum, ContentType.JAVASCRIPT);
		addEEnumLiteral(contentTypeEEnum, ContentType.XML_TEXT);
		addEEnumLiteral(contentTypeEEnum, ContentType.XML_APPLICATION);
		addEEnumLiteral(contentTypeEEnum, ContentType.HTML);
		addEEnumLiteral(contentTypeEEnum, ContentType.JAVA_LANG_EXCEPTION);

		initEEnum(httpVerbEEnum, HttpVerb.class, "HttpVerb");
		addEEnumLiteral(httpVerbEEnum, HttpVerb.GET);
		addEEnumLiteral(httpVerbEEnum, HttpVerb.POST);
		addEEnumLiteral(httpVerbEEnum, HttpVerb.PUT);
		addEEnumLiteral(httpVerbEEnum, HttpVerb.DELETE);

		initEEnum(statusCodeEEnum, StatusCode.class, "StatusCode");
		addEEnumLiteral(statusCodeEEnum, StatusCode.CONTINUE);
		addEEnumLiteral(statusCodeEEnum, StatusCode.SWITCHING_PROTOCOLS);
		addEEnumLiteral(statusCodeEEnum, StatusCode.PROCESSING);
		addEEnumLiteral(statusCodeEEnum, StatusCode.OK);
		addEEnumLiteral(statusCodeEEnum, StatusCode.CREATED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.ACCEPTED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.NON_AUTHORITATIVE_INFORMATION);
		addEEnumLiteral(statusCodeEEnum, StatusCode.NO_CONTENT);
		addEEnumLiteral(statusCodeEEnum, StatusCode.RESET_CONTENT);
		addEEnumLiteral(statusCodeEEnum, StatusCode.PARTIAL_CONTENT);
		addEEnumLiteral(statusCodeEEnum, StatusCode.MULTI_STATUS);
		addEEnumLiteral(statusCodeEEnum, StatusCode.MULTIPLE_CHOICES);
		addEEnumLiteral(statusCodeEEnum, StatusCode.MOVED_PERMANENTLY);
		addEEnumLiteral(statusCodeEEnum, StatusCode.MOVED_TEMPORARILY);
		addEEnumLiteral(statusCodeEEnum, StatusCode.SEE_OTHER);
		addEEnumLiteral(statusCodeEEnum, StatusCode.NOT_MODIFIED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.USE_PROXY);
		addEEnumLiteral(statusCodeEEnum, StatusCode.TEMPORARY_REDIRECT);
		addEEnumLiteral(statusCodeEEnum, StatusCode.BAD_REQUEST);
		addEEnumLiteral(statusCodeEEnum, StatusCode.UNAUTHORIZED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.PAYMENT_REQUIRED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.FORBIDDEN);
		addEEnumLiteral(statusCodeEEnum, StatusCode.NOT_FOUND);
		addEEnumLiteral(statusCodeEEnum, StatusCode.METHOD_NOT_ALLOWED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.NOT_ACCEPTABLE);
		addEEnumLiteral(statusCodeEEnum, StatusCode.PROXY_AUTHENTICATION_REQUIRED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.REQUEST_TIMEOUT);
		addEEnumLiteral(statusCodeEEnum, StatusCode.CONFLICT);
		addEEnumLiteral(statusCodeEEnum, StatusCode.GONE);
		addEEnumLiteral(statusCodeEEnum, StatusCode.LENGTH_REQUIRED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.PRECONDITION_FAILED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.REQUEST_TOO_LONG);
		addEEnumLiteral(statusCodeEEnum, StatusCode.REQUEST_URI_TOO_LONG);
		addEEnumLiteral(statusCodeEEnum, StatusCode.UNSUPPORTED_MEDIA_TYPE);
		addEEnumLiteral(statusCodeEEnum, StatusCode.REQUESTED_RANGE_NOT_SATISFIABLE);
		addEEnumLiteral(statusCodeEEnum, StatusCode.EXPECTATION_FAILED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.INSUFFICIENT_SPACE_ON_RESOURCE);
		addEEnumLiteral(statusCodeEEnum, StatusCode.METHOD_FAILURE);
		addEEnumLiteral(statusCodeEEnum, StatusCode.UNPROCESSABLE_ENTITY);
		addEEnumLiteral(statusCodeEEnum, StatusCode.LOCKED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.FAILED_DEPENDENCY);
		addEEnumLiteral(statusCodeEEnum, StatusCode.INTERNAL_SERVER_ERROR);
		addEEnumLiteral(statusCodeEEnum, StatusCode.NOT_IMPLEMENTED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.BAD_GATEWAY);
		addEEnumLiteral(statusCodeEEnum, StatusCode.SERVICE_UNAVAILABLE);
		addEEnumLiteral(statusCodeEEnum, StatusCode.GATEWAY_TIMEOUT);
		addEEnumLiteral(statusCodeEEnum, StatusCode.HTTP_VERSION_NOT_SUPPORTED);
		addEEnumLiteral(statusCodeEEnum, StatusCode.INSUFFICIENT_STORAGE);
		addEEnumLiteral(statusCodeEEnum, StatusCode.CONNECTION_EXCEPTION);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
