package projectManager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import projectManager.core.CustomEntity;
import projectManager.model.Project;
import projectManager.model.User;


public interface UserRepositoryDAO extends JpaRepository<User, Integer>{

	void registerUser(CustomEntity user);
	
	public User findUserById(long id);

	   
    public List<Project> findUserProjects(long userID);

  
    public String findVolunteerTasks(long userID);
    
    public List<User> listVolunteers();
    

}
