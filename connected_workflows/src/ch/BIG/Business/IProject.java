/**
 * Interface for media such as book and magazine.
 * 
 * @author Arif Chughtai
 */

package ch.BIG.Business;

// Interface declaration
public interface IProject {

	// Setter methods

	/**
	 * Set the title
	 */
	public void setState(String state);

	/**
	 * Set the price
	 */
	public void setProjectID(String projectID);

	// Getter methods

	/**
	 * @return the title
	 */
	public String getState();

	/**
	 * @return the price
	 */
	public String getProjectID();
}