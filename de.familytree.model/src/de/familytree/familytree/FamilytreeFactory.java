/**
 */
package de.familytree.familytree;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.familytree.familytree.FamilytreePackage
 * @generated
 */
public interface FamilytreeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FamilytreeFactory eINSTANCE = de.familytree.familytree.impl.FamilytreeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Family Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family Tree</em>'.
	 * @generated
	 */
	FamilyTree createFamilyTree();

	/**
	 * Returns a new object of class '<em>Woman</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Woman</em>'.
	 * @generated
	 */
	Woman createWoman();

	/**
	 * Returns a new object of class '<em>Man</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Man</em>'.
	 * @generated
	 */
	Man createMan();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FamilytreePackage getFamilytreePackage();

} //FamilytreeFactory
