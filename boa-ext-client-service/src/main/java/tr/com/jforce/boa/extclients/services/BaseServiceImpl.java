package tr.com.jforce.boa.extclients.services;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import tr.com.jforce.boa.extclients.dao.model.BaseDbModel;

@Transactional
public class BaseServiceImpl<E extends tr.com.jforce.boa.extclients.dao.BaseDbRepository<T>, T extends BaseDbModel>
		implements IDBOperations<T> {

	@PersistenceContext
	protected EntityManager entityManager;

	@Autowired
	protected E dao;
 

	@Override
	public T insert(T t) {

		entityManager.persist(t);
		return t;
	}

	@Override
	public T update(T t) {

		entityManager.merge(t);
		return t;
	}

	@Override
	public void delete(T t) {
		entityManager.remove(t);

	}

	@Override
	public T getById(String id) {
		Optional<T> obj = dao.findById(id);
		if (obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

}
