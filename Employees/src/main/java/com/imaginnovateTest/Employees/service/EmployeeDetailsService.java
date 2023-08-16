package com.imaginnovateTest.Employees.service;

import java.util.List;

import com.imaginnovateTest.Employees.payload.EmployeeDto;


/**
 * @author durga
 *
 */
public interface EmployeeDetailsService {
	
	public EmployeeDto createEmployee(EmployeeDto dto);

	
	public 	List<EmployeeDto> getAllEmployee(int pageno, int psgesize, String sortby, String sortdrc);
	

	Double taxdeductionForCurrentYear(Long id);
}
