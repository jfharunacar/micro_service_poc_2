package tr.com.jforce.boa.extclients.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import tr.com.jforce.boa.extclients.dao.model.BaseDbModel;

public interface BaseDbRepository <T extends BaseDbModel> extends org.springframework.data.repository.PagingAndSortingRepository<T,String>,JpaSpecificationExecutor<T>{

}
