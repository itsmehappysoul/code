package com.smartclean.test.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.smartclean.deekshith.services.demo.model.Services;
import com.smartclean.test.model.Operations;
import com.smartclean.test.service.OperationsService;

public class OperationsController {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	@Autowired
	private OperationsService operationservice;
	
	@GetMapping("/render")
	public String getCheckOperations(Model model) {
		List<Operations> list = operationservice.getCheckOperations(int id);
		model.addAttribute("operations", list);
		return "operations";
	}
	
	@PostMapping("/create")
	public String createOperation(Model model) {

		return "createService";
	}

	@GetMapping("/create")
	public String getUniqueIdAfterCreation(Model model) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String createdTime = sdf.format(timestamp);
		String AlphaNumericString = "0123456789" ;
		StringBuilder sb = new StringBuilder(4);
		for (int i = 0; i < 4; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		String UniqueID = sb.toString();
		Operations op = new Operations(UniqueID, timestamp);
		serviceoperationservice.createService(serv);
		model.addAttribute("service", serv);
		return "createService";
	}
	
}
