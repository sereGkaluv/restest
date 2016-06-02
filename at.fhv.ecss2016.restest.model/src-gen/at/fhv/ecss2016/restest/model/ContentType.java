/**
 */
package at.fhv.ecss2016.restest.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Content Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.fhv.ecss2016.restest.model.ModelPackage#getContentType()
 * @model
 * @generated
 */
public enum ContentType implements Enumerator {
	/**
	 * The '<em><b>TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(0, "TEXT", "text"),

	/**
	 * The '<em><b>TEXT PLAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_PLAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_PLAIN(1, "TEXT_PLAIN", "text/plain"),

	/**
	 * The '<em><b>JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(2, "JSON", "application/json"),

	/**
	 * The '<em><b>JAVASCRIPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVASCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	JAVASCRIPT(3, "JAVASCRIPT", "application/javascript"),

	/**
	 * The '<em><b>XML TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	XML_TEXT(4, "XML_TEXT", "text/xml"),

	/**
	 * The '<em><b>XML APPLICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_APPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	XML_APPLICATION(5, "XML_APPLICATION", "application/xml"),

	/**
	 * The '<em><b>HTML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTML_VALUE
	 * @generated
	 * @ordered
	 */
	HTML(6, "HTML", "text/html"),

	/**
	 * The '<em><b>JAVA LANG EXCEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_LANG_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_LANG_EXCEPTION(7, "JAVA_LANG_EXCEPTION", "java.lang.Exception");

	/**
	 * The '<em><b>TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model literal="text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 0;

	/**
	 * The '<em><b>TEXT PLAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXT PLAIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT_PLAIN
	 * @model literal="text/plain"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_PLAIN_VALUE = 1;

	/**
	 * The '<em><b>JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JSON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JSON
	 * @model literal="application/json"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 2;

	/**
	 * The '<em><b>JAVASCRIPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JAVASCRIPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVASCRIPT
	 * @model literal="application/javascript"
	 * @generated
	 * @ordered
	 */
	public static final int JAVASCRIPT_VALUE = 3;

	/**
	 * The '<em><b>XML TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XML TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML_TEXT
	 * @model literal="text/xml"
	 * @generated
	 * @ordered
	 */
	public static final int XML_TEXT_VALUE = 4;

	/**
	 * The '<em><b>XML APPLICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XML APPLICATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML_APPLICATION
	 * @model literal="application/xml"
	 * @generated
	 * @ordered
	 */
	public static final int XML_APPLICATION_VALUE = 5;

	/**
	 * The '<em><b>HTML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HTML</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTML
	 * @model literal="text/html"
	 * @generated
	 * @ordered
	 */
	public static final int HTML_VALUE = 6;

	/**
	 * The '<em><b>JAVA LANG EXCEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JAVA LANG EXCEPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_LANG_EXCEPTION
	 * @model literal="java.lang.Exception"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_LANG_EXCEPTION_VALUE = 7;

	/**
	 * An array of all the '<em><b>Content Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContentType[] VALUES_ARRAY =
		new ContentType[] {
			TEXT,
			TEXT_PLAIN,
			JSON,
			JAVASCRIPT,
			XML_TEXT,
			XML_APPLICATION,
			HTML,
			JAVA_LANG_EXCEPTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Content Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Content Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType get(int value) {
		switch (value) {
			case TEXT_VALUE: return TEXT;
			case TEXT_PLAIN_VALUE: return TEXT_PLAIN;
			case JSON_VALUE: return JSON;
			case JAVASCRIPT_VALUE: return JAVASCRIPT;
			case XML_TEXT_VALUE: return XML_TEXT;
			case XML_APPLICATION_VALUE: return XML_APPLICATION;
			case HTML_VALUE: return HTML;
			case JAVA_LANG_EXCEPTION_VALUE: return JAVA_LANG_EXCEPTION;
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
	private ContentType(int value, String name, String literal) {
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
	
} //ContentType
