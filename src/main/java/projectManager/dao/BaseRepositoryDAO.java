package projectManager.dao;

import java.io.Serializable;

import projectManager.core.CustomEntity;

public interface BaseRepositoryDAO<CustomEntity> {

	/* Project , User and Task and Other Entities Setup*/
    public void setupEntityClass(Class clazz) ;
	
    public void insert(CustomEntity object);

       
    public void update( CustomEntity object);

   
    public void insertOrUpdate(CustomEntity object);

   
    public void delete( CustomEntity object);

  
}
