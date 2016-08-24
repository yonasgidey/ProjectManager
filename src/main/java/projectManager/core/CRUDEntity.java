package projectManager.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import projectManager.dao.BaseRepositoryDAO;
import projectManager.model.Project;


@Transactional(propagation = Propagation.REQUIRED)
public class CRUDEntity implements BaseRepositoryDAO<CustomEntity> {

	
	protected Class<Project> clazz;
    Session session;
	Transaction tx;
	
	public CRUDEntity(SessionFactory factory) {
        
		session = factory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public void setupEntityClass(Class clazz) {
		this.clazz = clazz;
	}


	/*public CustomEntity findById( long id) {

		
		    CustomEntity anEntity = (CustomEntity) session.get( clazz, id);			
	            
		return anEntity;
	}*/

	public void insertOrUpdate(CustomEntity object) {
		
		
	}

	public void delete(CustomEntity object) {
		
		
	}

	public void insert(CustomEntity object) {
		
	}

	public void update(CustomEntity object) {
		
		
	}


}
