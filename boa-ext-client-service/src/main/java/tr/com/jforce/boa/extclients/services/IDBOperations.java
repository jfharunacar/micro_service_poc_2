package tr.com.jforce.boa.extclients.services;

import tr.com.jforce.boa.extclients.dao.model.BaseDbModel;

public interface IDBOperations<T extends BaseDbModel> {

	 
	public T getById( String id );

 
	public T insert( T t );
	
	
 
	 
	public T update(T t );

	
	public void delete( T t );
 
 
	

	
}
