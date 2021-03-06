/**
 */
package org.framed.iorm.featuremodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.framed.iorm.featuremodel.FRaMEDConfiguration;
import org.framed.iorm.featuremodel.FRaMEDFeature;
import org.framed.iorm.featuremodel.FeatureName;
import org.framed.iorm.featuremodel.FeaturemodelFactory;
import org.framed.iorm.featuremodel.FeaturemodelPackage;

import org.framed.iorm.model.OrmPackage;

import org.framed.iorm.model.impl.OrmPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemodelPackageImpl extends EPackageImpl implements FeaturemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fRaMEDFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fRaMEDConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureNameEEnum = null;

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
	 * @see org.framed.iorm.featuremodel.FeaturemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FeaturemodelPackageImpl() {
		super(eNS_URI, FeaturemodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FeaturemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FeaturemodelPackage init() {
		if (isInited)
			return (FeaturemodelPackage) EPackage.Registry.INSTANCE.getEPackage(FeaturemodelPackage.eNS_URI);

		// Obtain or create and register package
		FeaturemodelPackageImpl theFeaturemodelPackage = (FeaturemodelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof FeaturemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new FeaturemodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OrmPackageImpl theOrmPackage = (OrmPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(OrmPackage.eNS_URI) instanceof OrmPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI) : OrmPackage.eINSTANCE);

		// Create package meta-data objects
		theFeaturemodelPackage.createPackageContents();
		theOrmPackage.createPackageContents();

		// Initialize created meta-data
		theFeaturemodelPackage.initializePackageContents();
		theOrmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFeaturemodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FeaturemodelPackage.eNS_URI, theFeaturemodelPackage);
		return theFeaturemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFRaMEDFeature() {
		return fRaMEDFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRaMEDFeature_Name() {
		return (EAttribute) fRaMEDFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRaMEDFeature_ManuallySelected() {
		return (EAttribute) fRaMEDFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFRaMEDConfiguration() {
		return fRaMEDConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFRaMEDConfiguration_Features() {
		return (EReference) fRaMEDConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeatureName() {
		return featureNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemodelFactory getFeaturemodelFactory() {
		return (FeaturemodelFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		fRaMEDFeatureEClass = createEClass(FRA_MED_FEATURE);
		createEAttribute(fRaMEDFeatureEClass, FRA_MED_FEATURE__NAME);
		createEAttribute(fRaMEDFeatureEClass, FRA_MED_FEATURE__MANUALLY_SELECTED);

		fRaMEDConfigurationEClass = createEClass(FRA_MED_CONFIGURATION);
		createEReference(fRaMEDConfigurationEClass, FRA_MED_CONFIGURATION__FEATURES);

		// Create enums
		featureNameEEnum = createEEnum(FEATURE_NAME);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(fRaMEDFeatureEClass, FRaMEDFeature.class, "FRaMEDFeature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFRaMEDFeature_Name(), this.getFeatureName(), "name", "RML_Feature_Model", 1, 1,
				FRaMEDFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFRaMEDFeature_ManuallySelected(), ecorePackage.getEBoolean(), "manuallySelected", null, 1, 1,
				FRaMEDFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(fRaMEDConfigurationEClass, FRaMEDConfiguration.class, "FRaMEDConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFRaMEDConfiguration_Features(), this.getFRaMEDFeature(), null, "features", null, 0, -1,
				FRaMEDConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(featureNameEEnum, FeatureName.class, "FeatureName");
		addEEnumLiteral(featureNameEEnum, FeatureName.RML_FEATURE_MODEL);
		addEEnumLiteral(featureNameEEnum, FeatureName.ROLE_TYPES);
		addEEnumLiteral(featureNameEEnum, FeatureName.ROLE_STRUCTURE);
		addEEnumLiteral(featureNameEEnum, FeatureName.ROLE_PROPERTIES);
		addEEnumLiteral(featureNameEEnum, FeatureName.ROLE_BEHAVIOR);
		addEEnumLiteral(featureNameEEnum, FeatureName.ROLE_INHERITANCE);
		addEEnumLiteral(featureNameEEnum, FeatureName.PLAYABLE);
		addEEnumLiteral(featureNameEEnum, FeatureName.PLAYERS);
		addEEnumLiteral(featureNameEEnum, FeatureName.NATURALS);
		addEEnumLiteral(featureNameEEnum, FeatureName.ROLES);
		addEEnumLiteral(featureNameEEnum, FeatureName.COMPARTMENTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.DATES);
		addEEnumLiteral(featureNameEEnum, FeatureName.DEPENDENT);
		addEEnumLiteral(featureNameEEnum, FeatureName.ON_COMPARTMENTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.ON_RELATIONSHIPS);
		addEEnumLiteral(featureNameEEnum, FeatureName.ROLE_CONSTRAINTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.ROLE_IMPLICATION);
		addEEnumLiteral(featureNameEEnum, FeatureName.ROLE_PROHIBITION);
		addEEnumLiteral(featureNameEEnum, FeatureName.ROLE_EQUIVALENCE);
		addEEnumLiteral(featureNameEEnum, FeatureName.GROUP_CONSTRAINTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.OCCURRENCE_CONSTRAINTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.RELATIONSHIPS);
		addEEnumLiteral(featureNameEEnum, FeatureName.RELATIONSHIP_CONSTRAINTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.RELATIONSHIP_CARDINALITY);
		addEEnumLiteral(featureNameEEnum, FeatureName.INTRA_RELATIONSHIP_CONSTRAINTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.PARTHOOD_CONSTRAINTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.INTER_RELATIONSHIP_CONSTRAINTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.COMPARTMENT_TYPES);
		addEEnumLiteral(featureNameEEnum, FeatureName.COMPARTMENT_STRUCTURE);
		addEEnumLiteral(featureNameEEnum, FeatureName.COMPARTMENT_PROPERTIES);
		addEEnumLiteral(featureNameEEnum, FeatureName.COMPARTMENT_BEHAVIOR);
		addEEnumLiteral(featureNameEEnum, FeatureName.COMPARTMENT_INHERITANCE);
		addEEnumLiteral(featureNameEEnum, FeatureName.PARTICIPANTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.CONTAINS_COMPARTMENTS);
		addEEnumLiteral(featureNameEEnum, FeatureName.PLAYABLE_BY_DEFINING_COMPARTMENT);
		addEEnumLiteral(featureNameEEnum, FeatureName.DATA_TYPES);
		addEEnumLiteral(featureNameEEnum, FeatureName.DATA_TYPE_INHERITANCE);
	}

} //FeaturemodelPackageImpl
