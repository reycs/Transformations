/**
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.Annotation;
import owl.Entity;
import owl.EntityAnnotation;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.EntityAnnotationImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link owl.impl.EntityAnnotationImpl#getEntityAnnotations <em>Entity Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityAnnotationImpl extends AxiomImpl implements EntityAnnotation {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getEntityAnnotations() <em>Entity Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> entityAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.ENTITY_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.ENTITY_ANNOTATION__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ENTITY_ANNOTATION__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getEntityAnnotations() {
		if (entityAnnotations == null) {
			entityAnnotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, OwlPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS);
		}
		return entityAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.ENTITY_ANNOTATION__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case OwlPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS:
				return getEntityAnnotations();
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
			case OwlPackage.ENTITY_ANNOTATION__ENTITY:
				setEntity((Entity)newValue);
				return;
			case OwlPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS:
				getEntityAnnotations().clear();
				getEntityAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case OwlPackage.ENTITY_ANNOTATION__ENTITY:
				setEntity((Entity)null);
				return;
			case OwlPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS:
				getEntityAnnotations().clear();
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
			case OwlPackage.ENTITY_ANNOTATION__ENTITY:
				return entity != null;
			case OwlPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS:
				return entityAnnotations != null && !entityAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityAnnotationImpl
