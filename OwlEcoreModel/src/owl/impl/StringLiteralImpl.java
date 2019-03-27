/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.OwlPackage;
import owl.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.StringLiteralImpl#getQuotedString <em>Quoted String</em>}</li>
 *   <li>{@link owl.impl.StringLiteralImpl#getLanguageTag <em>Language Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringLiteralImpl extends LiteralImpl implements StringLiteral {
	/**
	 * The default value of the '{@link #getQuotedString() <em>Quoted String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotedString()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuotedString() <em>Quoted String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotedString()
	 * @generated
	 * @ordered
	 */
	protected String quotedString = QUOTED_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageTag() <em>Language Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageTag()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageTag() <em>Language Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageTag()
	 * @generated
	 * @ordered
	 */
	protected String languageTag = LANGUAGE_TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.STRING_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuotedString() {
		return quotedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuotedString(String newQuotedString) {
		String oldQuotedString = quotedString;
		quotedString = newQuotedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.STRING_LITERAL__QUOTED_STRING, oldQuotedString, quotedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageTag() {
		return languageTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageTag(String newLanguageTag) {
		String oldLanguageTag = languageTag;
		languageTag = newLanguageTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.STRING_LITERAL__LANGUAGE_TAG, oldLanguageTag, languageTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.STRING_LITERAL__QUOTED_STRING:
				return getQuotedString();
			case OwlPackage.STRING_LITERAL__LANGUAGE_TAG:
				return getLanguageTag();
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
			case OwlPackage.STRING_LITERAL__QUOTED_STRING:
				setQuotedString((String)newValue);
				return;
			case OwlPackage.STRING_LITERAL__LANGUAGE_TAG:
				setLanguageTag((String)newValue);
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
			case OwlPackage.STRING_LITERAL__QUOTED_STRING:
				setQuotedString(QUOTED_STRING_EDEFAULT);
				return;
			case OwlPackage.STRING_LITERAL__LANGUAGE_TAG:
				setLanguageTag(LANGUAGE_TAG_EDEFAULT);
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
			case OwlPackage.STRING_LITERAL__QUOTED_STRING:
				return QUOTED_STRING_EDEFAULT == null ? quotedString != null : !QUOTED_STRING_EDEFAULT.equals(quotedString);
			case OwlPackage.STRING_LITERAL__LANGUAGE_TAG:
				return LANGUAGE_TAG_EDEFAULT == null ? languageTag != null : !LANGUAGE_TAG_EDEFAULT.equals(languageTag);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quotedString: ");
		result.append(quotedString);
		result.append(", languageTag: ");
		result.append(languageTag);
		result.append(')');
		return result.toString();
	}

} //StringLiteralImpl
