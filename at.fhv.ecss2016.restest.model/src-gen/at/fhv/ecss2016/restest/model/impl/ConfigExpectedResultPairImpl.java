/**
 */
package at.fhv.ecss2016.restest.model.impl;

import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ConfigExpectedResultPair;
import at.fhv.ecss2016.restest.model.ExpectedResult;
import at.fhv.ecss2016.restest.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Expected Result Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ConfigExpectedResultPairImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ConfigExpectedResultPairImpl#getExpectedResult <em>Expected Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigExpectedResultPairImpl extends MinimalEObjectImpl.Container implements ConfigExpectedResultPair {
	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected Config config;

	/**
	 * The cached value of the '{@link #getExpectedResult() <em>Expected Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedResult()
	 * @generated
	 * @ordered
	 */
	protected ExpectedResult expectedResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigExpectedResultPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONFIG_EXPECTED_RESULT_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config getConfig() {
		if (config != null && config.eIsProxy()) {
			InternalEObject oldConfig = (InternalEObject)config;
			config = (Config)eResolveProxy(oldConfig);
			if (config != oldConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__CONFIG, oldConfig, config));
			}
		}
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config basicGetConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(Config newConfig) {
		Config oldConfig = config;
		config = newConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__CONFIG, oldConfig, config));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedResult getExpectedResult() {
		if (expectedResult != null && expectedResult.eIsProxy()) {
			InternalEObject oldExpectedResult = (InternalEObject)expectedResult;
			expectedResult = (ExpectedResult)eResolveProxy(oldExpectedResult);
			if (expectedResult != oldExpectedResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__EXPECTED_RESULT, oldExpectedResult, expectedResult));
			}
		}
		return expectedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedResult basicGetExpectedResult() {
		return expectedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedResult(ExpectedResult newExpectedResult) {
		ExpectedResult oldExpectedResult = expectedResult;
		expectedResult = newExpectedResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__EXPECTED_RESULT, oldExpectedResult, expectedResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__CONFIG:
				if (resolve) return getConfig();
				return basicGetConfig();
			case ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__EXPECTED_RESULT:
				if (resolve) return getExpectedResult();
				return basicGetExpectedResult();
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
			case ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__CONFIG:
				setConfig((Config)newValue);
				return;
			case ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__EXPECTED_RESULT:
				setExpectedResult((ExpectedResult)newValue);
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
			case ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__CONFIG:
				setConfig((Config)null);
				return;
			case ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__EXPECTED_RESULT:
				setExpectedResult((ExpectedResult)null);
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
			case ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__CONFIG:
				return config != null;
			case ModelPackage.CONFIG_EXPECTED_RESULT_PAIR__EXPECTED_RESULT:
				return expectedResult != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigExpectedResultPairImpl
