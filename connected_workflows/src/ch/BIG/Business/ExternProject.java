/**
 * Class implementing a book.
 * 
 * @author Arif Chughtai
 */

// Package declaration
package ch.BIG.Business;

// Class declaration
class ExternProject extends AbstractProject {

	// Attributes

	/**
	 * The isbn.
	 */
	private String externAffiliation;

	// Special constructor
	public ExternProject(String state, String projectID) //, String isbn) 
	{
		super(state, projectID);	// Call constructor of parent class (constructor chaining)

		//setIsbn(isbn);
	}

	// Setter methods

	/**
	 * @param internAffiliation
	 *            //the isbn to set
	 */
	public void setExternAffiliation(String externAffiliation) {
		this.externAffiliation = externAffiliation;
	}

	// Getter methods

	/**
	 * @return the isbn
	 */
	public final String getExternAffiliation() {
		return externAffiliation;
	}
}