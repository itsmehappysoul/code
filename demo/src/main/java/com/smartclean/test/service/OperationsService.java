package com.smartclean.test.service;

import java.util.List;


import com.smartclean.test.model.Operations;

public interface OperationsService {
	List<Operations> getAllOperations();

	void createOperation(Operations operations); //Create Operations
	
	Operations getCheckCurrentOperation(int id, String time_stamp);  //Displays latest Operation's Sl no and Time_stamp
	
	Operations getCheckAllOperations(int id, String time_stamp);  //Displays all Operation's Sl no and Time_stamp

	Operations getCheckOperations(int id);  //Displays all Operations Unique Id
	
	void deleteOperation(Operations operations);  //Deletes all operations

}
