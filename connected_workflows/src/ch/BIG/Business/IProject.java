package ch.BIG.Business;

public interface IProject {

}


/**
 * Interface for media such as book and magazine.
 * 
 * @author Arif Chughtai
 */

package org.arifchughtai.training.casestudies.librarymanager.v2.business;

// Interface declaration
public interface IProject {

	// Setter methods

	/**
	 * Set the title
	 */
	public void setStatus(String status);

	/**
	 * Set the price
	 */
	public void setProjectID(String projectID);

	// Getter methods

	/**
	 * @return the title
	 */
	public String getStatus();

	/**
	 * @return the price
	 */
	public String getProjectID();
}