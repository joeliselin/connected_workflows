package ch.BIG.Business;

class AbstractProject {

	
	
	
}


/**
 * Parent class for media such as book and magazine.
 * 
 * @author Arif Chughtai
 */

// Package declaration
package org.arifchughtai.training.casestudies.librarymanager.v2.business;

// Class declaration
abstract class AbstractProject implements IProject {	

	// Attributes
	/**
	 * The state.
	 */
	private String status;
	
	/**
	 * The price.
	 */
	private String projectID;

	
	// Special constructor
	
	/**
	 * @param title
	 * @param price
	 */
	public AbstractProject(final String state, final String projectID) {
		setStatus(status);
		setProjectID(projectID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.arifchughtai.training.objectorientation.interfaceclass.library.Media#
	 * getTitle()
	 */
	public final String getStatus() {
		return status;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.arifchughtai.training.objectorientation.interfaceclass.library.Media#
	 * getPrice()
	 */
	public final String getProjecID() {
		return projectID;
	}

	// Setter methods
	/**
	 * @param title the title to set
	 */
	public void setStatus(final String status) {
		this.status = status;
	}

	/**
	 * @param projectID the price to set
	 */
	public void setProjectID(final String projectID) {
		this.projectID = projectID;
	}	
}
