package com.smartclean.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.smartclean.test.dao.OperationsDAO;
import com.smartclean.test.model.Operations;

public class OperationsServiceImpl implements OperationsService {
	
	@Autowired
	private OperationsDAO operationsdao;
	
	@Override
	public List<Operations> getAllOperations() {
		return operationsdao.getAllOperations();
	}
	
	@Override
    public void createOperation(Operations operations)   {
	   operationsdao.createOperation(operations);   
   } 
	
	@Override
	public Operations getCheckCurrentOperation(int id) {
		return operationsdao.getCheckCurrentOperation(id);
	}
	
	@Override
	public Operations getCheckAllOperations(iString time_stamp){
		return operationsdao.getCheckAllOperations(time_stamp);
	} 

	@Override
	public Operations getCheckOperations(int id){
		return operationsdao.getCheckOperations(id);
	}  
	
	@Override
	public void deleteOperation(Operations operations) {
		   operationsdao.deleteOperation(operations);   
	   }  


}
