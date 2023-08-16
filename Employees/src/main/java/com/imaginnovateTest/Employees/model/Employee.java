package com.imaginnovateTest.Employees.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * @author durga
 *
 */
@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	
	@Column(nullable = false)
	private String firstname;
	
	@Column(nullable = false)
	private String lastname;
	
	@Column(nullable = false)
	private String email;

	@ElementCollection
	@CollectionTable(name = "employee_phone_numbers", joinColumns = @JoinColumn(name = "employee_id"))
	@Column(name = "phone_number", nullable = false)
	private List<String> phoneNumbers;
	
	@Column(nullable = false)
	private LocalDate doj;
	
	@Column(nullable = false)
	private Double salary;

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private EmployeeTaxDetails employeeTaxDetails;

	public Employee(Long empId, String firstname, String lastname, String email, List<String> phoneNumbers,
			LocalDate doj, Double salary, EmployeeTaxDetails employeeTaxDetails) {
		super();
		this.empId = empId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.doj = doj;
		this.salary = salary;
		this.employeeTaxDetails = employeeTaxDetails;
	}

	public Employee(String firstname, String lastname, String email, List<String> phoneNumbers, LocalDate doj,
			Double salary, EmployeeTaxDetails employeeTaxDetails) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.doj = doj;
		this.salary = salary;
		this.employeeTaxDetails = employeeTaxDetails;
	}

	public Employee() {
		super();
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public EmployeeTaxDetails getEmployeeTaxDetails() {
		return employeeTaxDetails;
	}

	public void setEmployeeTaxDetails(EmployeeTaxDetails employeeTaxDetails) {
		this.employeeTaxDetails = employeeTaxDetails;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", phoneNumbers=" + phoneNumbers + ", doj=" + doj + ", salary=" + salary + ", employeeTaxDetails="
				+ employeeTaxDetails + "]";
	}

}
