/**
 */
package at.fhv.ecss2016.restest.model.impl;

import at.fhv.ecss2016.restest.model.ConfigResultPair;
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
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ScenarioImpl#getScenariosFile <em>Scenarios File</em>}</li>
 *   <li>{@link at.fhv.ecss2016.restest.model.impl.ScenarioImpl#getConfigResultPairs <em>Config Result Pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The default value of the '{@link #getScenariosFile() <em>Scenarios File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenariosFile()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENARIOS_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenariosFile() <em>Scenarios File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenariosFile()
	 * @generated
	 * @ordered
	 */
	protected String scenariosFile = SCENARIOS_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigResultPairs() <em>Config Result Pairs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigResultPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigResultPair> configResultPairs;

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
	public String getScenariosFile() {
		return scenariosFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenariosFile(String newScenariosFile) {
		String oldScenariosFile = scenariosFile;
		scenariosFile = newScenariosFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCENARIO__SCENARIOS_FILE, oldScenariosFile, scenariosFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigResultPair> getConfigResultPairs() {
		if (configResultPairs == null) {
			configResultPairs = new EObjectResolvingEList<ConfigResultPair>(ConfigResultPair.class, this, ModelPackage.SCENARIO__CONFIG_RESULT_PAIRS);
		}
		return configResultPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SCENARIO__SCENARIOS_FILE:
				return getScenariosFile();
			case ModelPackage.SCENARIO__CONFIG_RESULT_PAIRS:
				return getConfigResultPairs();
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
			case ModelPackage.SCENARIO__SCENARIOS_FILE:
				setScenariosFile((String)newValue);
				return;
			case ModelPackage.SCENARIO__CONFIG_RESULT_PAIRS:
				getConfigResultPairs().clear();
				getConfigResultPairs().addAll((Collection<? extends ConfigResultPair>)newValue);
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
			case ModelPackage.SCENARIO__SCENARIOS_FILE:
				setScenariosFile(SCENARIOS_FILE_EDEFAULT);
				return;
			case ModelPackage.SCENARIO__CONFIG_RESULT_PAIRS:
				getConfigResultPairs().clear();
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
			case ModelPackage.SCENARIO__SCENARIOS_FILE:
				return SCENARIOS_FILE_EDEFAULT == null ? scenariosFile != null : !SCENARIOS_FILE_EDEFAULT.equals(scenariosFile);
			case ModelPackage.SCENARIO__CONFIG_RESULT_PAIRS:
				return configResultPairs != null && !configResultPairs.isEmpty();
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
		result.append(" (scenariosFile: ");
		result.append(scenariosFile);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
