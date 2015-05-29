/**
 */
package de.familytree.familytree;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.familytree.familytree.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getSecondName <em>Second Name</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getChildren <em>Children</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getParents <em>Parents</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getDayOfBirth <em>Day Of Birth</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getNameOfBirth <em>Name Of Birth</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getRelationshipStatus <em>Relationship Status</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#isDied <em>Died</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getDayOfDeath <em>Day Of Death</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getLocationOfBirth <em>Location Of Birth</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getInRelationWith <em>In Relation With</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getInRelationTo <em>In Relation To</em>}</li>
 *   <li>{@link de.familytree.familytree.Person#getImagePaths <em>Image Paths</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.familytree.familytree.FamilytreePackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * The default value is <code>"?"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_FirstName()
	 * @model default="?"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link de.familytree.familytree.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Second Name</b></em>' attribute.
	 * The default value is <code>"?"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Name</em>' attribute.
	 * @see #setSecondName(String)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_SecondName()
	 * @model default="?"
	 * @generated
	 */
	String getSecondName();

	/**
	 * Sets the value of the '{@link de.familytree.familytree.Person#getSecondName <em>Second Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Name</em>' attribute.
	 * @see #getSecondName()
	 * @generated
	 */
	void setSecondName(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link de.familytree.familytree.Person}.
	 * It is bidirectional and its opposite is '{@link de.familytree.familytree.Person#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_Children()
	 * @see de.familytree.familytree.Person#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	EList<Person> getChildren();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link de.familytree.familytree.Person}.
	 * It is bidirectional and its opposite is '{@link de.familytree.familytree.Person#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_Parents()
	 * @see de.familytree.familytree.Person#getChildren
	 * @model opposite="children" upper="2"
	 * @generated
	 */
	EList<Person> getParents();

	/**
	 * Returns the value of the '<em><b>Day Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Birth</em>' attribute.
	 * @see #setDayOfBirth(Date)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_DayOfBirth()
	 * @model
	 * @generated
	 */
	Date getDayOfBirth();

	/**
	 * Sets the value of the '{@link de.familytree.familytree.Person#getDayOfBirth <em>Day Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Birth</em>' attribute.
	 * @see #getDayOfBirth()
	 * @generated
	 */
	void setDayOfBirth(Date value);

	/**
	 * Returns the value of the '<em><b>Relationship Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.familytree.familytree.RelationshipStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Status</em>' attribute.
	 * @see de.familytree.familytree.RelationshipStatus
	 * @see #setRelationshipStatus(RelationshipStatus)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_RelationshipStatus()
	 * @model required="true"
	 * @generated
	 */
	RelationshipStatus getRelationshipStatus();

	/**
	 * Sets the value of the '{@link de.familytree.familytree.Person#getRelationshipStatus <em>Relationship Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Status</em>' attribute.
	 * @see de.familytree.familytree.RelationshipStatus
	 * @see #getRelationshipStatus()
	 * @generated
	 */
	void setRelationshipStatus(RelationshipStatus value);

	/**
	 * Returns the value of the '<em><b>Died</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Died</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Died</em>' attribute.
	 * @see #setDied(boolean)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_Died()
	 * @model default="false"
	 * @generated
	 */
	boolean isDied();

	/**
	 * Sets the value of the '{@link de.familytree.familytree.Person#isDied <em>Died</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Died</em>' attribute.
	 * @see #isDied()
	 * @generated
	 */
	void setDied(boolean value);

	/**
	 * Returns the value of the '<em><b>Day Of Death</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Death</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Death</em>' attribute.
	 * @see #setDayOfDeath(Date)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_DayOfDeath()
	 * @model
	 * @generated
	 */
	Date getDayOfDeath();

	/**
	 * Sets the value of the '{@link de.familytree.familytree.Person#getDayOfDeath <em>Day Of Death</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Death</em>' attribute.
	 * @see #getDayOfDeath()
	 * @generated
	 */
	void setDayOfDeath(Date value);

	/**
	 * Returns the value of the '<em><b>Name Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Of Birth</em>' attribute.
	 * @see #setNameOfBirth(String)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_NameOfBirth()
	 * @model
	 * @generated
	 */
	String getNameOfBirth();

	/**
	 * Sets the value of the '{@link de.familytree.familytree.Person#getNameOfBirth <em>Name Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Of Birth</em>' attribute.
	 * @see #getNameOfBirth()
	 * @generated
	 */
	void setNameOfBirth(String value);

	/**
	 * Returns the value of the '<em><b>Location Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Of Birth</em>' attribute.
	 * @see #setLocationOfBirth(String)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_LocationOfBirth()
	 * @model
	 * @generated
	 */
	String getLocationOfBirth();

	/**
	 * Sets the value of the '{@link de.familytree.familytree.Person#getLocationOfBirth <em>Location Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Of Birth</em>' attribute.
	 * @see #getLocationOfBirth()
	 * @generated
	 */
	void setLocationOfBirth(String value);

	/**
	 * Returns the value of the '<em><b>In Relation With</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.familytree.familytree.Person#getInRelationTo <em>In Relation To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Relation With</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Relation With</em>' reference.
	 * @see #setInRelationWith(Person)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_InRelationWith()
	 * @see de.familytree.familytree.Person#getInRelationTo
	 * @model opposite="inRelationTo"
	 * @generated
	 */
	Person getInRelationWith();

	/**
	 * Sets the value of the '{@link de.familytree.familytree.Person#getInRelationWith <em>In Relation With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Relation With</em>' reference.
	 * @see #getInRelationWith()
	 * @generated
	 */
	void setInRelationWith(Person value);

	/**
	 * Returns the value of the '<em><b>In Relation To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.familytree.familytree.Person#getInRelationWith <em>In Relation With</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Relation To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Relation To</em>' reference.
	 * @see #setInRelationTo(Person)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_InRelationTo()
	 * @see de.familytree.familytree.Person#getInRelationWith
	 * @model opposite="inRelationWith"
	 * @generated
	 */
	Person getInRelationTo();

	/**
	 * Sets the value of the '{@link de.familytree.familytree.Person#getInRelationTo <em>In Relation To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Relation To</em>' reference.
	 * @see #getInRelationTo()
	 * @generated
	 */
	void setInRelationTo(Person value);

	/**
	 * Returns the value of the '<em><b>Image Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Paths</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Paths</em>' attribute list.
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_ImagePaths()
	 * @model
	 * @generated
	 */
	EList<String> getImagePaths();

} // Person
