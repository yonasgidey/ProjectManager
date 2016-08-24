package projectManager.service.impl;

import java.util.List;

import projectManager.core.CRUDEntity;
import projectManager.core.CustomEntity;
import projectManager.dao.ProjectRepositoryDAO;
import projectManager.dao.impl.ProjectRepositoryImpl;
import projectManager.model.Project;
import projectManager.model.ProjectStatus;
import projectManager.service.ProjectService;

public class ProjectServiceImpl extends CRUDEntity implements ProjectService {

	ProjectRepositoryDAO projectRepository;
	
	public ProjectServiceImpl() {
		projectRepository = new ProjectRepositoryImpl();
	}
	public void setUp() {
		System.out.println("ProjectRepository Created!");
	}


	public void registerProject(CustomEntity project) {
		
		projectRepository.registerProject(project);
	}
	
	@Override
	public Project findByProjectKeyWord(String ProjectName) {
		return projectRepository.findByProjectKeyWord(ProjectName);
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> findTasks(Project parentProject) {
		return projectRepository.findTasks(parentProject);
	}

	@Override
	public ProjectStatus findProjectStatus(long projectID) {
		return projectRepository.findProjectStatus(projectID);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> findProjectByStatus(String status) {
		return projectRepository.findProjectByStatus(status);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Project> findProjectByLocation(String loc) {
		
		return projectRepository.findProjectByLocation(loc);
	}

	@Override
	public Project findProjectById(long id) {
		return projectRepository.findProjectById(id);
	}
	
	
}
