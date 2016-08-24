package projectManager.service;


import java.util.List;

import projectManager.model.Project;
import projectManager.model.User;


public interface UserService  {

   
    public void registerUser(User user );
    
    public List<User> listVolunteers();
    
	public User findUserById(long id) ;
	
	public List<Project> findUserProjects(long userID);

	public String findVolunteerTasks(long userID) ;
	
	/*public void registerUser();
	public void findByRole();
	public void findTaskByProject();
	public void findProjectByVolunteer();
	public List<Project> findProjectByStatus();*/
   
}
