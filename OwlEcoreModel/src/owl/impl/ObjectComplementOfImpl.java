/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.ClassExpression;
import owl.ObjectComplementOf;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Complement Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.ObjectComplementOfImpl#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectComplementOfImpl extends ClassExpressionImpl implements ObjectComplementOf {
	/**
	 * The cached value of the '{@link #getClassExpression() <em>Class Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExpression()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression classExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectComplementOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OBJECT_COMPLEMENT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getClassExpression() {
		if (classExpression != null && classExpression.eIsProxy()) {
			InternalEObject oldClassExpression = (InternalEObject)classExpression;
			classExpression = (ClassExpression)eResolveProxy(oldClassExpression);
			if (classExpression != oldClassExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION, oldClassExpression, classExpression));
			}
		}
		return classExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression basicGetClassExpression() {
		return classExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassExpression(ClassExpression newClassExpression) {
		ClassExpression oldClassExpression = classExpression;
		classExpression = newClassExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION, oldClassExpression, classExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION:
				if (resolve) return getClassExpression();
				return basicGetClassExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OwlPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION:
				setClassExpression((ClassExpression)newValue);
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
			case OwlPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION:
				setClassExpression((ClassExpression)null);
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
			case OwlPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION:
				return classExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectComplementOfImpl
