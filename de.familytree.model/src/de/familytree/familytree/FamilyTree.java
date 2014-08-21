/**
 */
package de.familytree.familytree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.familytree.familytree.FamilyTree#getPersons <em>Persons</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.familytree.familytree.FamilytreePackage#getFamilyTree()
 * @model
 * @generated
 */
public interface FamilyTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link de.familytree.familytree.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see de.familytree.familytree.FamilytreePackage#getFamilyTree_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // FamilyTree
