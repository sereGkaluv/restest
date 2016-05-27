/**
 */
package at.fhv.ecss2016.restest.model.impl;

import at.fhv.ecss2016.restest.model.ConfigExpectedResultPair;
import at.fhv.ecss2016.restest.model.ModelPackage;
import at.fhv.ecss2016.restest.model.Scenario;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ScenarioImpl#getScenarioFilePath <em>Scenario File Path</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ScenarioImpl#getConfigExpectedResultPairList <em>Config Expected Result Pair List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The default value of the '{@link #getScenarioFilePath() <em>Scenario File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENARIO_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenarioFilePath() <em>Scenario File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioFilePath()
	 * @generated
	 * @ordered
	 */
	protected String scenarioFilePath = SCENARIO_FILE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigExpectedResultPairList() <em>Config Expected Result Pair List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigExpectedResultPairList()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigExpectedResultPair> configExpectedResultPairList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScenarioFilePath() {
		return scenarioFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioFilePath(String newScenarioFilePath) {
		String oldScenarioFilePath = scenarioFilePath;
		scenarioFilePath = newScenarioFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCENARIO__SCENARIO_FILE_PATH, oldScenarioFilePath, scenarioFilePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigExpectedResultPair> getConfigExpectedResultPairList() {
		if (configExpectedResultPairList == null) {
			configExpectedResultPairList = new EObjectResolvingEList<ConfigExpectedResultPair>(ConfigExpectedResultPair.class, this, ModelPackage.SCENARIO__CONFIG_EXPECTED_RESULT_PAIR_LIST);
		}
		return configExpectedResultPairList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SCENARIO__SCENARIO_FILE_PATH:
				return getScenarioFilePath();
			case ModelPackage.SCENARIO__CONFIG_EXPECTED_RESULT_PAIR_LIST:
				return getConfigExpectedResultPairList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.SCENARIO__SCENARIO_FILE_PATH:
				setScenarioFilePath((String)newValue);
				return;
			case ModelPackage.SCENARIO__CONFIG_EXPECTED_RESULT_PAIR_LIST:
				getConfigExpectedResultPairList().clear();
				getConfigExpectedResultPairList().addAll((Collection<? extends ConfigExpectedResultPair>)newValue);
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
			case ModelPackage.SCENARIO__SCENARIO_FILE_PATH:
				setScenarioFilePath(SCENARIO_FILE_PATH_EDEFAULT);
				return;
			case ModelPackage.SCENARIO__CONFIG_EXPECTED_RESULT_PAIR_LIST:
				getConfigExpectedResultPairList().clear();
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
			case ModelPackage.SCENARIO__SCENARIO_FILE_PATH:
				return SCENARIO_FILE_PATH_EDEFAULT == null ? scenarioFilePath != null : !SCENARIO_FILE_PATH_EDEFAULT.equals(scenarioFilePath);
			case ModelPackage.SCENARIO__CONFIG_EXPECTED_RESULT_PAIR_LIST:
				return configExpectedResultPairList != null && !configExpectedResultPairList.isEmpty();
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
		result.append(" (scenarioFilePath: ");
		result.append(scenarioFilePath);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
