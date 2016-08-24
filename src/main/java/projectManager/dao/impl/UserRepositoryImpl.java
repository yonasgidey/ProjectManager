package projectManager.dao.impl;

import java.util.List;

import projectManager.core.CRUDEntity;
import projectManager.core.CustomEntity;
import projectManager.dao.UserRepositoryDAO;
import projectManager.model.Project;
import projectManager.model.Role;


public class UserRepositoryImpl extends CRUDEntity implements UserRepositoryDAO{

   public UserRepositoryImpl() {
	  		
	  setupEntityClass(User.class);
		
   }
		
	public void setUp() {
		System.out.println("ProjectRepository Created!");
	}



	@Override
	public void registerUser(CustomEntity user) {
		
		insert(user);
	}

	@Override
	public User findUserById(long id) {
		
		return (User) findById(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> findUserProjects(long userID) {
		return  sessionFactory.getCurrentSession()
				.createQuery("from User u INNER JOIN Project p WHERE u.userID =:p.projectID")
				.setParameter("Projects", userID).list();
		
	}

	@Override
	public String findVolunteerTasks(long userID) {
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> listVolunteers() {
		return  session.createQuery("from User u  WHERE u.role =:usrRole")
				.setParameter("usrRole", Role.VOLUNTEER).list();
	}

	

}
