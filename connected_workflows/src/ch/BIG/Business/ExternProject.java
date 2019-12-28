package ch.BIG.Business;

public class ExternProject {

}


/**
 * Class implementing a book.
 * 
 * @author Arif Chughtai
 */

// Package declaration
package org.arifchughtai.training.casestudies.librarymanager.v2.business;

// Class declaration
class ExternProject extends AbstractProject {

	// Attributes

	/**
	 * The isbn.
	 */
	private String internAffiliation;

	// Special constructor
	public ExternProject(String status, String projectID) //, String isbn) 
	{
		super(title, price);	// Call constructor of parent class (constructor chaining)

		setIsbn(isbn);
	}

	// Setter methods

	/**
	 * @param internAffiliation
	 *            the isbn to set
	 */
	public void setInternAffiliation(String internAffiliation) {
		this.internAffiliation = internAffiliation;
	}

	// Getter methods

	/**
	 * @return the isbn
	 */
	public final String getInternAffiliation() {
		return internAffiliation;
	}
}