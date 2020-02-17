package tr.com.jforce.boa.extclients.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import tr.com.jforce.boa.extclients.dao.model.Transaction;


@Repository
public interface TransactionRepository extends BaseDbRepository<Transaction> {

	List<Transaction> findByCustomerNumberOrderByTransactionDateAsc(String customerNumber);
}
