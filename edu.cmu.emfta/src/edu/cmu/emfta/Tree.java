/**
 */
package edu.cmu.emfta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.emfta.Tree#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.emfta.Tree#getGate <em>Gate</em>}</li>
 *   <li>{@link edu.cmu.emfta.Tree#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.emfta.EmftaPackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.cmu.emfta.EmftaPackage#getTree_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.cmu.emfta.Tree#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate</em>' containment reference.
	 * @see #setGate(Gate)
	 * @see edu.cmu.emfta.EmftaPackage#getTree_Gate()
	 * @model containment="true"
	 * @generated
	 */
	Gate getGate();

	/**
	 * Sets the value of the '{@link edu.cmu.emfta.Tree#getGate <em>Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate</em>' containment reference.
	 * @see #getGate()
	 * @generated
	 */
	void setGate(Gate value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.cmu.emfta.EmftaPackage#getTree_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.cmu.emfta.Tree#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Tree
