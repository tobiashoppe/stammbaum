/**
 */
package de.familytree.familytree.impl;

import de.familytree.familytree.FamilytreePackage;
import de.familytree.familytree.Person;
import de.familytree.familytree.RelationshipStatus;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#getSecondName <em>Second Name</em>}</li>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#getDayOfBirth <em>Day Of Birth</em>}</li>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#getRelationshipStatus <em>Relationship Status</em>}</li>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#isDied <em>Died</em>}</li>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#getNameOfBirth <em>Name Of Birth</em>}</li>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#getLocationOfBirth <em>Location Of Birth</em>}</li>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#getInRelationWith <em>In Relation With</em>}</li>
 *   <li>{@link de.familytree.familytree.impl.PersonImpl#getInRelationTo <em>In Relation To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondName() <em>Second Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondName() <em>Second Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondName()
	 * @generated
	 * @ordered
	 */
	protected String secondName = SECOND_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> children;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> parents;

	/**
	 * The default value of the '{@link #getDayOfBirth() <em>Day Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final Date DAY_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDayOfBirth() <em>Day Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfBirth()
	 * @generated
	 * @ordered
	 */
	protected Date dayOfBirth = DAY_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationshipStatus() <em>Relationship Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RelationshipStatus RELATIONSHIP_STATUS_EDEFAULT = RelationshipStatus.SINGLE;

	/**
	 * The cached value of the '{@link #getRelationshipStatus() <em>Relationship Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipStatus()
	 * @generated
	 * @ordered
	 */
	protected RelationshipStatus relationshipStatus = RELATIONSHIP_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isDied() <em>Died</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDied() <em>Died</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDied()
	 * @generated
	 * @ordered
	 */
	protected boolean died = DIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameOfBirth() <em>Name Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameOfBirth() <em>Name Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfBirth()
	 * @generated
	 * @ordered
	 */
	protected String nameOfBirth = NAME_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationOfBirth() <em>Location Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationOfBirth() <em>Location Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationOfBirth()
	 * @generated
	 * @ordered
	 */
	protected String locationOfBirth = LOCATION_OF_BIRTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInRelationWith() <em>In Relation With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRelationWith()
	 * @generated
	 * @ordered
	 */
	protected Person inRelationWith;

	/**
	 * The cached value of the '{@link #getInRelationTo() <em>In Relation To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRelationTo()
	 * @generated
	 * @ordered
	 */
	protected Person inRelationTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilytreePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondName(String newSecondName) {
		String oldSecondName = secondName;
		secondName = newSecondName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__SECOND_NAME, oldSecondName, secondName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, FamilytreePackage.PERSON__CHILDREN, FamilytreePackage.PERSON__PARENTS);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getParents() {
		if (parents == null) {
			parents = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, FamilytreePackage.PERSON__PARENTS, FamilytreePackage.PERSON__CHILDREN);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDayOfBirth() {
		return dayOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOfBirth(Date newDayOfBirth) {
		Date oldDayOfBirth = dayOfBirth;
		dayOfBirth = newDayOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__DAY_OF_BIRTH, oldDayOfBirth, dayOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipStatus getRelationshipStatus() {
		return relationshipStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipStatus(RelationshipStatus newRelationshipStatus) {
		RelationshipStatus oldRelationshipStatus = relationshipStatus;
		relationshipStatus = newRelationshipStatus == null ? RELATIONSHIP_STATUS_EDEFAULT : newRelationshipStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__RELATIONSHIP_STATUS, oldRelationshipStatus, relationshipStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDied() {
		return died;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDied(boolean newDied) {
		boolean oldDied = died;
		died = newDied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__DIED, oldDied, died));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameOfBirth() {
		return nameOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameOfBirth(String newNameOfBirth) {
		String oldNameOfBirth = nameOfBirth;
		nameOfBirth = newNameOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__NAME_OF_BIRTH, oldNameOfBirth, nameOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationOfBirth() {
		return locationOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationOfBirth(String newLocationOfBirth) {
		String oldLocationOfBirth = locationOfBirth;
		locationOfBirth = newLocationOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__LOCATION_OF_BIRTH, oldLocationOfBirth, locationOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getInRelationWith() {
		if (inRelationWith != null && inRelationWith.eIsProxy()) {
			InternalEObject oldInRelationWith = (InternalEObject)inRelationWith;
			inRelationWith = (Person)eResolveProxy(oldInRelationWith);
			if (inRelationWith != oldInRelationWith) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilytreePackage.PERSON__IN_RELATION_WITH, oldInRelationWith, inRelationWith));
			}
		}
		return inRelationWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetInRelationWith() {
		return inRelationWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInRelationWith(Person newInRelationWith, NotificationChain msgs) {
		Person oldInRelationWith = inRelationWith;
		inRelationWith = newInRelationWith;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__IN_RELATION_WITH, oldInRelationWith, newInRelationWith);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInRelationWith(Person newInRelationWith) {
		if (newInRelationWith != inRelationWith) {
			NotificationChain msgs = null;
			if (inRelationWith != null)
				msgs = ((InternalEObject)inRelationWith).eInverseRemove(this, FamilytreePackage.PERSON__IN_RELATION_TO, Person.class, msgs);
			if (newInRelationWith != null)
				msgs = ((InternalEObject)newInRelationWith).eInverseAdd(this, FamilytreePackage.PERSON__IN_RELATION_TO, Person.class, msgs);
			msgs = basicSetInRelationWith(newInRelationWith, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__IN_RELATION_WITH, newInRelationWith, newInRelationWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getInRelationTo() {
		if (inRelationTo != null && inRelationTo.eIsProxy()) {
			InternalEObject oldInRelationTo = (InternalEObject)inRelationTo;
			inRelationTo = (Person)eResolveProxy(oldInRelationTo);
			if (inRelationTo != oldInRelationTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilytreePackage.PERSON__IN_RELATION_TO, oldInRelationTo, inRelationTo));
			}
		}
		return inRelationTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetInRelationTo() {
		return inRelationTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInRelationTo(Person newInRelationTo, NotificationChain msgs) {
		Person oldInRelationTo = inRelationTo;
		inRelationTo = newInRelationTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__IN_RELATION_TO, oldInRelationTo, newInRelationTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInRelationTo(Person newInRelationTo) {
		if (newInRelationTo != inRelationTo) {
			NotificationChain msgs = null;
			if (inRelationTo != null)
				msgs = ((InternalEObject)inRelationTo).eInverseRemove(this, FamilytreePackage.PERSON__IN_RELATION_WITH, Person.class, msgs);
			if (newInRelationTo != null)
				msgs = ((InternalEObject)newInRelationTo).eInverseAdd(this, FamilytreePackage.PERSON__IN_RELATION_WITH, Person.class, msgs);
			msgs = basicSetInRelationTo(newInRelationTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilytreePackage.PERSON__IN_RELATION_TO, newInRelationTo, newInRelationTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilytreePackage.PERSON__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case FamilytreePackage.PERSON__PARENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParents()).basicAdd(otherEnd, msgs);
			case FamilytreePackage.PERSON__IN_RELATION_WITH:
				if (inRelationWith != null)
					msgs = ((InternalEObject)inRelationWith).eInverseRemove(this, FamilytreePackage.PERSON__IN_RELATION_TO, Person.class, msgs);
				return basicSetInRelationWith((Person)otherEnd, msgs);
			case FamilytreePackage.PERSON__IN_RELATION_TO:
				if (inRelationTo != null)
					msgs = ((InternalEObject)inRelationTo).eInverseRemove(this, FamilytreePackage.PERSON__IN_RELATION_WITH, Person.class, msgs);
				return basicSetInRelationTo((Person)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilytreePackage.PERSON__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case FamilytreePackage.PERSON__PARENTS:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case FamilytreePackage.PERSON__IN_RELATION_WITH:
				return basicSetInRelationWith(null, msgs);
			case FamilytreePackage.PERSON__IN_RELATION_TO:
				return basicSetInRelationTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilytreePackage.PERSON__FIRST_NAME:
				return getFirstName();
			case FamilytreePackage.PERSON__SECOND_NAME:
				return getSecondName();
			case FamilytreePackage.PERSON__CHILDREN:
				return getChildren();
			case FamilytreePackage.PERSON__PARENTS:
				return getParents();
			case FamilytreePackage.PERSON__DAY_OF_BIRTH:
				return getDayOfBirth();
			case FamilytreePackage.PERSON__RELATIONSHIP_STATUS:
				return getRelationshipStatus();
			case FamilytreePackage.PERSON__DIED:
				return isDied();
			case FamilytreePackage.PERSON__NAME_OF_BIRTH:
				return getNameOfBirth();
			case FamilytreePackage.PERSON__LOCATION_OF_BIRTH:
				return getLocationOfBirth();
			case FamilytreePackage.PERSON__IN_RELATION_WITH:
				if (resolve) return getInRelationWith();
				return basicGetInRelationWith();
			case FamilytreePackage.PERSON__IN_RELATION_TO:
				if (resolve) return getInRelationTo();
				return basicGetInRelationTo();
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
			case FamilytreePackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case FamilytreePackage.PERSON__SECOND_NAME:
				setSecondName((String)newValue);
				return;
			case FamilytreePackage.PERSON__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Person>)newValue);
				return;
			case FamilytreePackage.PERSON__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Person>)newValue);
				return;
			case FamilytreePackage.PERSON__DAY_OF_BIRTH:
				setDayOfBirth((Date)newValue);
				return;
			case FamilytreePackage.PERSON__RELATIONSHIP_STATUS:
				setRelationshipStatus((RelationshipStatus)newValue);
				return;
			case FamilytreePackage.PERSON__DIED:
				setDied((Boolean)newValue);
				return;
			case FamilytreePackage.PERSON__NAME_OF_BIRTH:
				setNameOfBirth((String)newValue);
				return;
			case FamilytreePackage.PERSON__LOCATION_OF_BIRTH:
				setLocationOfBirth((String)newValue);
				return;
			case FamilytreePackage.PERSON__IN_RELATION_WITH:
				setInRelationWith((Person)newValue);
				return;
			case FamilytreePackage.PERSON__IN_RELATION_TO:
				setInRelationTo((Person)newValue);
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
			case FamilytreePackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case FamilytreePackage.PERSON__SECOND_NAME:
				setSecondName(SECOND_NAME_EDEFAULT);
				return;
			case FamilytreePackage.PERSON__CHILDREN:
				getChildren().clear();
				return;
			case FamilytreePackage.PERSON__PARENTS:
				getParents().clear();
				return;
			case FamilytreePackage.PERSON__DAY_OF_BIRTH:
				setDayOfBirth(DAY_OF_BIRTH_EDEFAULT);
				return;
			case FamilytreePackage.PERSON__RELATIONSHIP_STATUS:
				setRelationshipStatus(RELATIONSHIP_STATUS_EDEFAULT);
				return;
			case FamilytreePackage.PERSON__DIED:
				setDied(DIED_EDEFAULT);
				return;
			case FamilytreePackage.PERSON__NAME_OF_BIRTH:
				setNameOfBirth(NAME_OF_BIRTH_EDEFAULT);
				return;
			case FamilytreePackage.PERSON__LOCATION_OF_BIRTH:
				setLocationOfBirth(LOCATION_OF_BIRTH_EDEFAULT);
				return;
			case FamilytreePackage.PERSON__IN_RELATION_WITH:
				setInRelationWith((Person)null);
				return;
			case FamilytreePackage.PERSON__IN_RELATION_TO:
				setInRelationTo((Person)null);
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
			case FamilytreePackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case FamilytreePackage.PERSON__SECOND_NAME:
				return SECOND_NAME_EDEFAULT == null ? secondName != null : !SECOND_NAME_EDEFAULT.equals(secondName);
			case FamilytreePackage.PERSON__CHILDREN:
				return children != null && !children.isEmpty();
			case FamilytreePackage.PERSON__PARENTS:
				return parents != null && !parents.isEmpty();
			case FamilytreePackage.PERSON__DAY_OF_BIRTH:
				return DAY_OF_BIRTH_EDEFAULT == null ? dayOfBirth != null : !DAY_OF_BIRTH_EDEFAULT.equals(dayOfBirth);
			case FamilytreePackage.PERSON__RELATIONSHIP_STATUS:
				return relationshipStatus != RELATIONSHIP_STATUS_EDEFAULT;
			case FamilytreePackage.PERSON__DIED:
				return died != DIED_EDEFAULT;
			case FamilytreePackage.PERSON__NAME_OF_BIRTH:
				return NAME_OF_BIRTH_EDEFAULT == null ? nameOfBirth != null : !NAME_OF_BIRTH_EDEFAULT.equals(nameOfBirth);
			case FamilytreePackage.PERSON__LOCATION_OF_BIRTH:
				return LOCATION_OF_BIRTH_EDEFAULT == null ? locationOfBirth != null : !LOCATION_OF_BIRTH_EDEFAULT.equals(locationOfBirth);
			case FamilytreePackage.PERSON__IN_RELATION_WITH:
				return inRelationWith != null;
			case FamilytreePackage.PERSON__IN_RELATION_TO:
				return inRelationTo != null;
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", secondName: ");
		result.append(secondName);
		result.append(", dayOfBirth: ");
		result.append(dayOfBirth);
		result.append(", relationshipStatus: ");
		result.append(relationshipStatus);
		result.append(", died: ");
		result.append(died);
		result.append(", nameOfBirth: ");
		result.append(nameOfBirth);
		result.append(", locationOfBirth: ");
		result.append(locationOfBirth);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
