package com.imaginnovateTest.Employees.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovateTest.Employees.payload.EmployeeDto;
import com.imaginnovateTest.Employees.service.EmployeeDetailsServiceImpl;



/**
 * @author durga
 *
 */
@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	@Autowired
	private EmployeeDetailsServiceImpl employeeDetailsService;
	
	Logger logger =LoggerFactory.getLogger(EmployeeController.class);
	
	
	
	@PostMapping
	public ResponseEntity<?> addemploye(@Validated @RequestBody EmployeeDto employeedto, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			Map<String, String> validationsMap = new HashMap<String, String>();
			for (FieldError error : bindingResult.getFieldErrors()) {
				validationsMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(validationsMap, HttpStatus.BAD_REQUEST);

		} else {

			EmployeeDto emp = employeeDetailsService.createEmployee(employeedto);
	        logger.debug("error msg here");
			return new ResponseEntity<EmployeeDto>(emp, HttpStatus.CREATED);
		}
	}
	
	
	
	@GetMapping
	public ResponseEntity<List<EmployeeDto>> getallemployee(
			@RequestParam(value = "Pageno", defaultValue = "0", required = false) Integer pageno,
			@RequestParam(value = "pagesize", defaultValue = "4", required = false) Integer pagesize,
			@RequestParam(value = "sotrby", defaultValue = "empid", required = false) String sotrby,
			@RequestParam(value = "sotrdsc", defaultValue = "asc", required = false) String sotrdsc) {
		List<EmployeeDto> employess = employeeDetailsService.getAllEmployee(pageno, pagesize, sotrby, sotrdsc);

		return new ResponseEntity<List<EmployeeDto>>(employess, HttpStatus.OK);

	}
	

	
	@GetMapping("/{id}")
	public ResponseEntity<?> taxDeductionCurrentYear(@PathVariable("id")Long id){
		return new ResponseEntity<Double>(employeeDetailsService.taxdeductionForCurrentYear(id),HttpStatus.OK);
		
	}
	

}
