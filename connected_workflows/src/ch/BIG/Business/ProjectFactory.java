/**
 * Class implementing a factory for Media implementations.
 * 
 * @author Arif Chughtai
 */

//import static org.arifchughtai.training.casestudies.librarymanager.v2.persistence.PersistenceBase.TITLE_KEY;
//import static org.arifchughtai.training.casestudies.librarymanager.v2.persistence.PersistenceBase.PRICE_KEY;

//import static org.arifchughtai.training.casestudies.librarymanager.v2.persistence.PersistenceBase.TITLE_INDEX;
//import static org.arifchughtai.training.casestudies.librarymanager.v2.persistence.PersistenceBase.PRICE_INDEX;

////

package ch.BIG.Business;
import ch.BIG.Persistence.ProjectDAOFactory;
import ch.BIG.Persistence.IProjectDAO;

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
	private IProjectDAO theDAO = null;
	
	
	/**
	 * Default constructor
	 */
	private ProjectFactory() {
		theDAO = ProjectDAOFactory.getInstance().createIProjectDAO();
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
	 * @param state
	 * @param projectID
	 * @return IProject
	 */	
	public IProject createIProject(){
		return new ExternProject("ZUSPA", "COOP", "MIGROS");	// Concrete Media should be configured.
	}
	
	/**
	 * Creates a concrete media object with title and price set
	 * @param state
	 * @param projectID
	 * @return IProject
	 */	
	public IProject createIProject(String state, String projectID){ 		//String price, String isbn)
		return new ExternProject(state);	// Concrete Media should be configured.
	}	
	
	/**
	 * Saves a media object
	 * @param media
	 */
	public void saveIProject(IProject project){		
		theDAO.insertIProjectAsArray(projectToArray(project));
		theDAO.insertIProjectAsMap(projectToMap(project));
	}
	
	/**
	 * Finds a media object.
	 * @param projectID
	 * @return Media object or null if there is no media object with given id 
	 */
	public IProject findIProject(int projectID){
		
		String[] projectData = theDAO.selectIProjectAsArray(projectID);
		Map<String, String> projectData = theDAO.selectIProjectAsMap(projectID);
		
		if(projectData == null){
			return null;
		}
		
		return arrayToIProject(projectData);
		return mapToIProject(projectData);
	}
	
	/**
	 * Converts Media to Array.
	 * @param media to convert
	 * @return Array containing data of given Media
	 */
	private String[] projectToArray(IProject project){		
		String[] projectData = new String[2];
		
		projectData[STATE_INDEX] = project.getState();
		projectData[ID_INDEX] = project.getProjectID();	
		
		return projectData;
	}
	
	/**
	 * Converts Array to Media.
	 * @param projectData
	 * @return Array containing data of given Media
	 */
	private IProject arrayToIProject(String[] projectData){		
		IProject project = createIProject(projectData[STATE_INDEX], projectData[ID_INDEX]);		
		
		return project;
	}
	
	/**
	 * Converts Media to Map.
	 * @param media to convert
	 * @return HashMap containing data of given Media
	 */
	private Map<String, String> projectToMap(IProject project){
		Map <String, String> projectData = new HashMap<String, String>();
		
		projectData.put(STATE_KEY), project.getState());
		projectData.put(ID_KEY), project.getProjectID());
		
		return projectData;
	}
	
	/**
	 * Converts Map to Media.
	 * @param projectData
	 * @return HashMap containing data of given Media
	 */
	private IProject mapToIProject(Map<String, String> projectData){
		
		IProject project = createIProject(projectData.get(STATE_KEY), projectData.get(ID_KEY));		
		
		return project;
	}
}
