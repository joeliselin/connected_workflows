package ch.BIG.Persistence;

/**
 * Class providing basic types, constants etc. for the persistence layer.
 * 
 * @author Arif Chughtai
 */

import java.util.HashMap;
import java.util.Map;

public final class PersistenceBase {	
	/**
	 * Index for reading title of a media.
	 */
	public final static int STATE_INDEX = 0;	
	
	/**
	 * Index for reading the price of a media.
	 */
	public final static int ID_INDEX = 1;
	
	/**
	 * Key for reading title of a media.
	 */
	public final static String STATE_KEY = "STATE";
		
	/**
	 * Key for reading the price of a media.
	 */
	public final static String ID_KEY = "ID";
	
	private PersistenceBase(){		
	}
	
	/**
	 * Creates array containing data of media
	 * @param title
	 * @param price
	 * @return array
	 */
	public static String[] createIProjectDataAsArray(String state, String projectID)
	{		
		projectData[STATE_INDEX] = state;
		projectData[ID_INDEX] = projectID;
		
		return projectData;
	}
	
	/**
	 * Creates HashMap containing data of media
	 * @param title
	 * @param price
	 * @return HashMap
	 */
	public static Map<String, String> createIProjectDataAsMap(String state, String projectID){
		Map <String, String> projectData = new HashMap<String, String>();
		
		projectData.put(STATE_KEY, state);
		projectData.put(ID_KEY, projectID);
		
		return projectData;
	}
}
