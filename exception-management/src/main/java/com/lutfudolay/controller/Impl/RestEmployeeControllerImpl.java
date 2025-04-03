package com.lutfudolay.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.controller.RestEmployeeController;
import com.lutfudolay.dto.DtoEmployee;
import com.lutfudolay.model.RootEntity;
import com.lutfudolay.services.IEmployeeService;

@RestController
@RequestMapping("rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/list/{id}")
	@Override
	public RootEntity<DtoEmployee> finEmployeeById(@PathVariable(value = "id") Long id) {
		
		return ok(employeeService.findEmployeeById(id));
	}

}
