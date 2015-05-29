/**
 */
package de.familytree.familytree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relationship Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.familytree.familytree.FamilytreePackage#getRelationshipStatus()
 * @model
 * @generated
 */
public enum RelationshipStatus implements Enumerator {
	/**
	 * The '<em><b>Single</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE(2, "Single", "Single"),

	/**
	 * The '<em><b>Widowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDOWED_VALUE
	 * @generated
	 * @ordered
	 */
	WIDOWED(4, "Widowed", "Widowed"),

	/**
	 * The '<em><b>Divorced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVORCED_VALUE
	 * @generated
	 * @ordered
	 */
	DIVORCED(3, "Divorced", "Divorced"),

	/**
	 * The '<em><b>Liaised</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIAISED_VALUE
	 * @generated
	 * @ordered
	 */
	LIAISED(1, "Liaised", "Liaised"),

	/**
	 * The '<em><b>Married</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARRIED_VALUE
	 * @generated
	 * @ordered
	 */
	MARRIED(0, "Married", "Married");

	/**
	 * The '<em><b>Single</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Single</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE
	 * @model name="Single"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUE = 2;

	/**
	 * The '<em><b>Widowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Widowed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDOWED
	 * @model name="Widowed"
	 * @generated
	 * @ordered
	 */
	public static final int WIDOWED_VALUE = 4;

	/**
	 * The '<em><b>Divorced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Divorced</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVORCED
	 * @model name="Divorced"
	 * @generated
	 * @ordered
	 */
	public static final int DIVORCED_VALUE = 3;

	/**
	 * The '<em><b>Liaised</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Liaised</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIAISED
	 * @model name="Liaised"
	 * @generated
	 * @ordered
	 */
	public static final int LIAISED_VALUE = 1;

	/**
	 * The '<em><b>Married</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Married</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARRIED
	 * @model name="Married"
	 * @generated
	 * @ordered
	 */
	public static final int MARRIED_VALUE = 0;

	/**
	 * An array of all the '<em><b>Relationship Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationshipStatus[] VALUES_ARRAY =
		new RelationshipStatus[] {
			SINGLE,
			WIDOWED,
			DIVORCED,
			LIAISED,
			MARRIED,
		};

	/**
	 * A public read-only list of all the '<em><b>Relationship Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationshipStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relationship Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipStatus get(int value) {
		switch (value) {
			case SINGLE_VALUE: return SINGLE;
			case WIDOWED_VALUE: return WIDOWED;
			case DIVORCED_VALUE: return DIVORCED;
			case LIAISED_VALUE: return LIAISED;
			case MARRIED_VALUE: return MARRIED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelationshipStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RelationshipStatus
