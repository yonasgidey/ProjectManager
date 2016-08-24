package projectManager.service;

import java.util.List;

import projectManager.core.CustomEntity;
import projectManager.model.Project;
import projectManager.model.ProjectStatus;

public interface ProjectService {

	public Project findByProjectKeyWord(String ProjectName);

	   
    public ProjectStatus findProjectStatus( long projectID);

  
    public List<Project> findTasks(Project parentProject);
    
    public List<Project> findProjectByStatus(String status);
    
    public List<Project> findProjectByLocation(String loc);
    
	public Project findProjectById(long id) ;
	
	public void registerProject(CustomEntity project);
}
