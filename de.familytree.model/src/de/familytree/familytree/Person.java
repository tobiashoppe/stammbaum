/**
 */
package de.familytree.familytree;

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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_FirstName()
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Name</em>' attribute.
	 * @see #setSecondName(String)
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_SecondName()
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see de.familytree.familytree.FamilytreePackage#getPerson_Children()
	 * @model
	 * @generated
	 */
	EList<Person> getChildren();
} // Person
