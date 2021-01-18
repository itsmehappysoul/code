package com.smartclean.test.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartclean.test.model.Operations;


@Repository
@Transactional
public class OperationsDAOImpl implements OperationsDAO {
	
	@Autowired
	private EntityManager entitymanger;
	
	@Override
	public List<Operations> getAllOperations() {
		 Session currentsession = entitymanger.unwrap(Session.class);
		 Query<Operations> query = currentsession.createQuery("from Operations", Operations.class);
		 List<Operations> operations = query.getResultList();
		return operations;
	}

	@Override
	public void createOperation(Operations operations) {
		Session currentsession = entitymanger.unwrap(Session.class);
		currentsession.save(operations);
	}
	
	@Override
	public Operations getCheckCurrentOperation(int id) {
		Session currentsession = entitymanger.unwrap(Session.class);
		return currentsession.get(Operations.class, id);
	}
	
	@Override
	public Operations getCheckAllOperations(String time_stamp) {
		Session currentsession = entitymanger.unwrap(Session.class);
		return currentsession.get(Operations.class,time_stamp);
	}
	
	@Override
	public Operations getCheckOperations(int id){
		Session currentsession = entitymanger.unwrap(Session.class);
		return currentsession.get(Operations.class, id);
	}
	
	
	@Override
	public void deleteOperation(Operations operations) {
		Session currentsession = entitymanger.unwrap(Session.class);
		Operations op = currentsession.get(Operations);
		currentsession.delete(op);
	}

}
