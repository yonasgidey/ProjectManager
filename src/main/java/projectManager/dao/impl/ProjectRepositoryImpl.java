package projectManager.dao.impl;

import java.util.List;

import projectManager.core.CRUDEntity;
import projectManager.core.CustomEntity;
import projectManager.dao.ProjectRepositoryDAO;
import projectManager.model.Project;
import projectManager.model.ProjectStatus;



public class ProjectRepositoryImpl extends CRUDEntity implements ProjectRepositoryDAO {

	public ProjectRepositoryImpl() {
		
        setupEntityClass(Project.class);
	}
	public void setUp() {
		System.out.println("ProjectRepository Created!");
	}


	public void registerProject(CustomEntity project) {
		
		insert(project);
	}
	
	
	@Override
	public Project findProjectById(long id) {
		return  (Project) findById(id);
	}
	
	@Override
	public Project findByProjectKeyWord(String searchKeyWord) {
		return (Project) session.createQuery("from Project c where lower(c.projectName) LIKE lower(:searchKeyWord)")
				.setParameter("searchKeyWord", searchKeyWord).uniqueResult();
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> findTasks(Project parentProject) {
		return (List<Project>) sessionFactory.getCurrentSession()
				.createQuery("from Project c where c.tasks = :tasks")
				.setParameter("tasks", parentProject).list();
	}

	@Override
	public ProjectStatus findProjectStatus(long projectID) {
		return (ProjectStatus) session.createQuery("SELECT p.projectStatus from Project p where p.projectID = :ProjectID")
				.setParameter("ProjectID", projectID).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> findProjectByStatus(String status) {
		return (List<Project>) session.createQuery("from Project c where c.projectStatus = :status")
				.setParameter("status", status).list();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Project> findProjectByLocation(String loc) {
		
		return (List<Project>) session.createQuery("from Project c where c.projectLocation = :location")
				.setParameter("location", loc).list();
	}


	
	
}
