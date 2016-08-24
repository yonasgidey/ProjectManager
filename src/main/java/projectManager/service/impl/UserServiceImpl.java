package projectManager.service.impl;

import java.util.List;

import org.hibernate.Session;

import projectManager.dao.impl.UserRepositoryImpl;
import projectManager.model.Project;
import projectManager.model.User;

public class UserServiceImpl implements UserService {

	UserRepositoryImpl userRepository;
	
	public UserServiceImpl() {
		userRepository = new UserRepositoryImpl() ;
	}
	
	
	@Override
	public void registerUser(User user ) {
		
		//authenticate
		userRepository.registerUser(user);
		
	  
	}
	
	
	public void registerProject(Project user ) {
		Session session = DataAccess.getSession();
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();
		session.close();
	  
	}


	@Override
	public List<User> listVolunteers() {
		return userRepository.listVolunteers();
	}


	@Override
	public User findUserById(long id) {
		return userRepository.findUserById(id);
	}


	@Override
	public List<Project> findUserProjects(long userID) {
		return userRepository.findUserProjects(userID);
	}


	@Override
	public String findVolunteerTasks(long userID) {
		return userRepository.findVolunteerTasks(userID);
	}

	

	

}
