/**
 */
package de.familytree.familytree;

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
 * @see de.familytree.familytree.FamilytreeFactory
 * @model kind="package"
 * @generated
 */
public interface FamilytreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "familytree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://familytree/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.familytree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FamilytreePackage eINSTANCE = de.familytree.familytree.impl.FamilytreePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.familytree.familytree.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.familytree.familytree.impl.PersonImpl
	 * @see de.familytree.familytree.impl.FamilytreePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Second Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SECOND_NAME = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARENTS = 3;

	/**
	 * The feature id for the '<em><b>Day Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DAY_OF_BIRTH = 4;

	/**
	 * The feature id for the '<em><b>Name Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME_OF_BIRTH = 5;

	/**
	 * The feature id for the '<em><b>Relationship Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__RELATIONSHIP_STATUS = 6;

	/**
	 * The feature id for the '<em><b>Died</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DIED = 7;

	/**
	 * The feature id for the '<em><b>Day Of Death</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DAY_OF_DEATH = 8;

	/**
	 * The feature id for the '<em><b>Location Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOCATION_OF_BIRTH = 9;

	/**
	 * The feature id for the '<em><b>In Relation With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IN_RELATION_WITH = 10;

	/**
	 * The feature id for the '<em><b>In Relation To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IN_RELATION_TO = 11;

	/**
	 * The feature id for the '<em><b>Image Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IMAGE_PATHS = 12;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.familytree.familytree.impl.FamilyTreeImpl <em>Family Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.familytree.familytree.impl.FamilyTreeImpl
	 * @see de.familytree.familytree.impl.FamilytreePackageImpl#getFamilyTree()
	 * @generated
	 */
	int FAMILY_TREE = 1;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_TREE__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>Family Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_TREE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Family Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.familytree.familytree.impl.WomanImpl <em>Woman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.familytree.familytree.impl.WomanImpl
	 * @see de.familytree.familytree.impl.FamilytreePackageImpl#getWoman()
	 * @generated
	 */
	int WOMAN = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Second Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__SECOND_NAME = PERSON__SECOND_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__CHILDREN = PERSON__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__PARENTS = PERSON__PARENTS;

	/**
	 * The feature id for the '<em><b>Day Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__DAY_OF_BIRTH = PERSON__DAY_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>Name Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__NAME_OF_BIRTH = PERSON__NAME_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>Relationship Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__RELATIONSHIP_STATUS = PERSON__RELATIONSHIP_STATUS;

	/**
	 * The feature id for the '<em><b>Died</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__DIED = PERSON__DIED;

	/**
	 * The feature id for the '<em><b>Day Of Death</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__DAY_OF_DEATH = PERSON__DAY_OF_DEATH;

	/**
	 * The feature id for the '<em><b>Location Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__LOCATION_OF_BIRTH = PERSON__LOCATION_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>In Relation With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__IN_RELATION_WITH = PERSON__IN_RELATION_WITH;

	/**
	 * The feature id for the '<em><b>In Relation To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__IN_RELATION_TO = PERSON__IN_RELATION_TO;

	/**
	 * The feature id for the '<em><b>Image Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__IMAGE_PATHS = PERSON__IMAGE_PATHS;

	/**
	 * The number of structural features of the '<em>Woman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Woman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.familytree.familytree.impl.ManImpl <em>Man</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.familytree.familytree.impl.ManImpl
	 * @see de.familytree.familytree.impl.FamilytreePackageImpl#getMan()
	 * @generated
	 */
	int MAN = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Second Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__SECOND_NAME = PERSON__SECOND_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__CHILDREN = PERSON__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__PARENTS = PERSON__PARENTS;

	/**
	 * The feature id for the '<em><b>Day Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__DAY_OF_BIRTH = PERSON__DAY_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>Name Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__NAME_OF_BIRTH = PERSON__NAME_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>Relationship Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__RELATIONSHIP_STATUS = PERSON__RELATIONSHIP_STATUS;

	/**
	 * The feature id for the '<em><b>Died</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__DIED = PERSON__DIED;

	/**
	 * The feature id for the '<em><b>Day Of Death</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__DAY_OF_DEATH = PERSON__DAY_OF_DEATH;

	/**
	 * The feature id for the '<em><b>Location Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__LOCATION_OF_BIRTH = PERSON__LOCATION_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>In Relation With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__IN_RELATION_WITH = PERSON__IN_RELATION_WITH;

	/**
	 * The feature id for the '<em><b>In Relation To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__IN_RELATION_TO = PERSON__IN_RELATION_TO;

	/**
	 * The feature id for the '<em><b>Image Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__IMAGE_PATHS = PERSON__IMAGE_PATHS;

	/**
	 * The number of structural features of the '<em>Man</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Man</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.familytree.familytree.RelationshipStatus <em>Relationship Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.familytree.familytree.RelationshipStatus
	 * @see de.familytree.familytree.impl.FamilytreePackageImpl#getRelationshipStatus()
	 * @generated
	 */
	int RELATIONSHIP_STATUS = 4;


	/**
	 * Returns the meta object for class '{@link de.familytree.familytree.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see de.familytree.familytree.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.familytree.familytree.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see de.familytree.familytree.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link de.familytree.familytree.Person#getSecondName <em>Second Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Name</em>'.
	 * @see de.familytree.familytree.Person#getSecondName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SecondName();

	/**
	 * Returns the meta object for the reference list '{@link de.familytree.familytree.Person#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see de.familytree.familytree.Person#getChildren()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Children();

	/**
	 * Returns the meta object for the reference list '{@link de.familytree.familytree.Person#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see de.familytree.familytree.Person#getParents()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Parents();

	/**
	 * Returns the meta object for the attribute '{@link de.familytree.familytree.Person#getDayOfBirth <em>Day Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Birth</em>'.
	 * @see de.familytree.familytree.Person#getDayOfBirth()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DayOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link de.familytree.familytree.Person#getRelationshipStatus <em>Relationship Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Status</em>'.
	 * @see de.familytree.familytree.Person#getRelationshipStatus()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_RelationshipStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.familytree.familytree.Person#isDied <em>Died</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Died</em>'.
	 * @see de.familytree.familytree.Person#isDied()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Died();

	/**
	 * Returns the meta object for the attribute '{@link de.familytree.familytree.Person#getDayOfDeath <em>Day Of Death</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Death</em>'.
	 * @see de.familytree.familytree.Person#getDayOfDeath()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DayOfDeath();

	/**
	 * Returns the meta object for the attribute '{@link de.familytree.familytree.Person#getNameOfBirth <em>Name Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Birth</em>'.
	 * @see de.familytree.familytree.Person#getNameOfBirth()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_NameOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link de.familytree.familytree.Person#getLocationOfBirth <em>Location Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Of Birth</em>'.
	 * @see de.familytree.familytree.Person#getLocationOfBirth()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LocationOfBirth();

	/**
	 * Returns the meta object for the reference '{@link de.familytree.familytree.Person#getInRelationWith <em>In Relation With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Relation With</em>'.
	 * @see de.familytree.familytree.Person#getInRelationWith()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_InRelationWith();

	/**
	 * Returns the meta object for the reference '{@link de.familytree.familytree.Person#getInRelationTo <em>In Relation To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Relation To</em>'.
	 * @see de.familytree.familytree.Person#getInRelationTo()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_InRelationTo();

	/**
	 * Returns the meta object for the attribute list '{@link de.familytree.familytree.Person#getImagePaths <em>Image Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Image Paths</em>'.
	 * @see de.familytree.familytree.Person#getImagePaths()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ImagePaths();

	/**
	 * Returns the meta object for class '{@link de.familytree.familytree.FamilyTree <em>Family Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family Tree</em>'.
	 * @see de.familytree.familytree.FamilyTree
	 * @generated
	 */
	EClass getFamilyTree();

	/**
	 * Returns the meta object for the containment reference list '{@link de.familytree.familytree.FamilyTree#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see de.familytree.familytree.FamilyTree#getMembers()
	 * @see #getFamilyTree()
	 * @generated
	 */
	EReference getFamilyTree_Members();

	/**
	 * Returns the meta object for class '{@link de.familytree.familytree.Woman <em>Woman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Woman</em>'.
	 * @see de.familytree.familytree.Woman
	 * @generated
	 */
	EClass getWoman();

	/**
	 * Returns the meta object for class '{@link de.familytree.familytree.Man <em>Man</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Man</em>'.
	 * @see de.familytree.familytree.Man
	 * @generated
	 */
	EClass getMan();

	/**
	 * Returns the meta object for enum '{@link de.familytree.familytree.RelationshipStatus <em>Relationship Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Status</em>'.
	 * @see de.familytree.familytree.RelationshipStatus
	 * @generated
	 */
	EEnum getRelationshipStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FamilytreeFactory getFamilytreeFactory();

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
		 * The meta object literal for the '{@link de.familytree.familytree.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.familytree.familytree.impl.PersonImpl
		 * @see de.familytree.familytree.impl.FamilytreePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Second Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SECOND_NAME = eINSTANCE.getPerson_SecondName();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CHILDREN = eINSTANCE.getPerson_Children();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PARENTS = eINSTANCE.getPerson_Parents();

		/**
		 * The meta object literal for the '<em><b>Day Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DAY_OF_BIRTH = eINSTANCE.getPerson_DayOfBirth();

		/**
		 * The meta object literal for the '<em><b>Relationship Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__RELATIONSHIP_STATUS = eINSTANCE.getPerson_RelationshipStatus();

		/**
		 * The meta object literal for the '<em><b>Died</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DIED = eINSTANCE.getPerson_Died();

		/**
		 * The meta object literal for the '<em><b>Day Of Death</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DAY_OF_DEATH = eINSTANCE.getPerson_DayOfDeath();

		/**
		 * The meta object literal for the '<em><b>Name Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME_OF_BIRTH = eINSTANCE.getPerson_NameOfBirth();

		/**
		 * The meta object literal for the '<em><b>Location Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LOCATION_OF_BIRTH = eINSTANCE.getPerson_LocationOfBirth();

		/**
		 * The meta object literal for the '<em><b>In Relation With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__IN_RELATION_WITH = eINSTANCE.getPerson_InRelationWith();

		/**
		 * The meta object literal for the '<em><b>In Relation To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__IN_RELATION_TO = eINSTANCE.getPerson_InRelationTo();

		/**
		 * The meta object literal for the '<em><b>Image Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__IMAGE_PATHS = eINSTANCE.getPerson_ImagePaths();

		/**
		 * The meta object literal for the '{@link de.familytree.familytree.impl.FamilyTreeImpl <em>Family Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.familytree.familytree.impl.FamilyTreeImpl
		 * @see de.familytree.familytree.impl.FamilytreePackageImpl#getFamilyTree()
		 * @generated
		 */
		EClass FAMILY_TREE = eINSTANCE.getFamilyTree();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_TREE__MEMBERS = eINSTANCE.getFamilyTree_Members();

		/**
		 * The meta object literal for the '{@link de.familytree.familytree.impl.WomanImpl <em>Woman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.familytree.familytree.impl.WomanImpl
		 * @see de.familytree.familytree.impl.FamilytreePackageImpl#getWoman()
		 * @generated
		 */
		EClass WOMAN = eINSTANCE.getWoman();

		/**
		 * The meta object literal for the '{@link de.familytree.familytree.impl.ManImpl <em>Man</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.familytree.familytree.impl.ManImpl
		 * @see de.familytree.familytree.impl.FamilytreePackageImpl#getMan()
		 * @generated
		 */
		EClass MAN = eINSTANCE.getMan();

		/**
		 * The meta object literal for the '{@link de.familytree.familytree.RelationshipStatus <em>Relationship Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.familytree.familytree.RelationshipStatus
		 * @see de.familytree.familytree.impl.FamilytreePackageImpl#getRelationshipStatus()
		 * @generated
		 */
		EEnum RELATIONSHIP_STATUS = eINSTANCE.getRelationshipStatus();

	}

} //FamilytreePackage
