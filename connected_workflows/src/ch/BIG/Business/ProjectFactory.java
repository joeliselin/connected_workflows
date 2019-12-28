//package ch.BIG.Business;

//public class ProjectFactory {

}


/**
 * Class implementing a factory for Media implementations.
 * 
 * @author Arif Chughtai
 */

package org.arifchughtai.training.casestudies.librarymanager.v2.business;

import static org.arifchughtai.training.casestudies.librarymanager.v2.persistence.PersistenceBase.TITLE_KEY;
import static org.arifchughtai.training.casestudies.librarymanager.v2.persistence.PersistenceBase.PRICE_KEY;

import static org.arifchughtai.training.casestudies.librarymanager.v2.persistence.PersistenceBase.TITLE_INDEX;
import static org.arifchughtai.training.casestudies.librarymanager.v2.persistence.PersistenceBase.PRICE_INDEX;

import org.arifchughtai.training.casestudies.librarymanager.v2.persistence.DAOFactory;
import org.arifchughtai.training.casestudies.librarymanager.v2.persistence.MediaDAO;

import java.util.HashMap;
import java.util.Map;

public class ProjectFactory {
	
	/**
	 * The singleton instance 
	 */
	private static ProjectFactory theInstance = null;
	
	/**
	 * The DAO instance 
	 */
	private ProjectDAO theDAO = null;
	
	
	/**
	 * Default constructor
	 */
	private ProjectFactory() {
		theDAO = DAOFactory.getInstance().createProjectDAO();
	}
	
	/**
	 * @return The Singleton
	 */
	public static ProjectFactory getInstance(){
		if(theInstance == null){
			theInstance = new ProjectFactory();
		}
		
		return theInstance;
	}
	
	/**
	 * Creates a concrete media object
	 * @param status
	 * @param projectID
	 * @return IProject
	 */	
	public IProject createIProject(){
		return new ExternProject("N/A", "N/A", "NA");	// Concrete Media should be configured.
	}
	
	/**
	 * Creates a concrete media object with title and price set
	 * @param status
	 * @param projectID
	 * @return IProject
	 */	
	public IProject createIProject(String status){ 		//String price, String isbn)
		return new InternProject(status);	// Concrete Media should be configured.
	}	
	
	/**
	 * Saves a media object
	 * @param media
	 */
	public void saveIProject(IProject project){		
		theDAO.insertIProjectAsArray(projectToArray(project));
		// theDAO.insertMediaAsMap(mediaToMap(media))
	}
	
	/**
	 * Finds a media object.
	 * @param projectID
	 * @return Media object or null if there is no media object with given id 
	 */
	public IProject findIProject(int projectID){
		
		String[] projectData = theDAO.selectIProjectAsArray(projectID);
		// Map<String, String> mediaData = theDAO.selectMediaAsMap(mediaId);
		
		if(projectData == null){
			return null;
		}
		
		return arrayToIProject(projectData);
		// return mapToMedia(mediaData);
	}
	
	/**
	 * Converts Media to Array.
	 * @param media to convert
	 * @return Array containing data of given Media
	 */
	private String[] projectToArray(IProject project){		
		String[] projectData = new String[2];
		
		projectData[STATUS_INDEX] = project.getStatus();
		//projectData[PRICE_INDEX] = project.getPrice();	
		
		return projectData;
	}
	
	/**
	 * Converts Array to Media.
	 * @param projectData
	 * @return Array containing data of given Media
	 */
	private IProject arrayToIProject(String[] projectData){		
		IProject project = createIProject(projectData[STATUS_INDEX]); //, mediaData[PRICE_INDEX], "N/A");		
		
		return project;
	}
	
	/**
	 * Converts Media to Map.
	 * @param media to convert
	 * @return HashMap containing data of given Media
	 */
	private Map<String, String> projectToMap(IProject project){
		Map <String, String> projectData = new HashMap<String, String>();
		
		projectData.put(STATUS_KEY, project.getStatus());
		//mediaData.put(PRICE_KEY, media.getPrice());
		
		return projectData;
	}
	
	/**
	 * Converts Map to Media.
	 * @param projectData
	 * @return HashMap containing data of given Media
	 */
	private IProject mapToIProject(Map<String, String> projectData){
		
		IProject project = createIProject(projectData.get(STATUS_KEY)); //, mediaData.get(PRICE_KEY), "N/A");		
		
		return project;
	}
}
