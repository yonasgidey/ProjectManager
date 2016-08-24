package projectManager.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import projectManager.core.CustomEntity;
import projectManager.model.Project;
import projectManager.model.ProjectStatus;


public interface ProjectRepositoryDAO  extends JpaRepository<Project , Integer> {
	
  
    public Project findByProjectKeyWord(String ProjectName);

   
    public ProjectStatus findProjectStatus( long projectID );

  
    public List<Project> findTasks(Project parentProject);
    
    public List<Project> findByProjectStatus(String status);
    
    public List<Project> findByProjectLocation(String loc);
    
    public void registerProject(CustomEntity project);
    
    public Project findProjectById(long id) ;
    
}
