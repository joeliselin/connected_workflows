/**
 * Parent class for media such as book and magazine.
 * 
 * @author Arif Chughtai
 */

// Package declaration
package ch.BIG.Business;

// Class declaration
abstract class AbstractProject implements IProject {	

	// Attributes
	/**
	 * The state.
	 */
	private String state;
	
	/**
	 * The price.
	 */
	private String projectID;

	
	// Special constructor
	
	/**
	 * @param state
	 * @param projectID
	 */
	public AbstractProject(final String state, final String projectID) {
		setState(state);
		setProjectID(projectID);
	}

	
	



	// Setter methods
	/**
	 * @param title the title to set
	 */
	public void setState(final String state) {
		this.state = state;
	}
	
	/**
	 * @param projectID the price to set
	 */
	public void setProjectID(final String projectID) {
		this.projectID = projectID;
	}		
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.arifchughtai.training.objectorientation.interfaceclass.library.Media#
	 * getTitle()
	 */
	public final String getState() {
		return state;
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

}
