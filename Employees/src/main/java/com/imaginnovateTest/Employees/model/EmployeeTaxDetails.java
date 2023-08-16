package com.imaginnovateTest.Employees.model;

import java.time.LocalDate;
import java.util.List;

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
@Table(name = "employeetaxdetails")
public class EmployeeTaxDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long EmployeeID;
	@Column(nullable = false)
	private String FirstName;
	@Column(nullable = false)
	private String LastName;
	@Column(nullable = false)
	private String Email;
//	 @ElementCollection
//	 @CollectionTable(name = "employee_phone_numbers", joinColumns = @JoinColumn(name = "employee_id"))
//	 @Column(name = "phone_number",nullable = false)
//	private List<String> phoneNumbers;
	@Column(nullable = false)
	private LocalDate DOJ;
	@Column(nullable = false)
	private Double Salary;
	@Column(nullable = false)
	private Double TotalTexAmount;
	@Column(nullable = false)
	private Double TotalCessAmount;

	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public EmployeeTaxDetails() {
		super();
	}

	public EmployeeTaxDetails(Long employeeID, String firstName, String lastName, String email, LocalDate dOJ,
			Double salary, Double totalTexAmount, Double totalCessAmount, Employee employee) {
		super();
		EmployeeID = employeeID;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		DOJ = dOJ;
		Salary = salary;
		TotalTexAmount = totalTexAmount;
		TotalCessAmount = totalCessAmount;
		this.employee = employee;
	}

	public EmployeeTaxDetails(String firstName, String lastName, String email, LocalDate dOJ, Double salary,
			Double totalTexAmount, Double totalCessAmount, Employee employee) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		DOJ = dOJ;
		Salary = salary;
		TotalTexAmount = totalTexAmount;
		TotalCessAmount = totalCessAmount;
		this.employee = employee;
	}

	public Long getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(Long employeeID) {
		EmployeeID = employeeID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public LocalDate getDOJ() {
		return DOJ;
	}

	public void setDOJ(LocalDate dOJ) {
		DOJ = dOJ;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public Double getTotalTexAmount() {
		return TotalTexAmount;
	}

	public void setTotalTexAmount(Double totalTexAmount) {
		TotalTexAmount = totalTexAmount;
	}

	public Double getTotalCessAmount() {
		return TotalCessAmount;
	}

	public void setTotalCessAmount(Double totalCessAmount) {
		TotalCessAmount = totalCessAmount;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeTaxDetails [EmployeeID=" + EmployeeID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Email=" + Email + ", DOJ=" + DOJ + ", Salary=" + Salary + ", TotalTexAmount=" + TotalTexAmount
				+ ", TotalCessAmount=" + TotalCessAmount + ", employee=" + employee + "]";
	}

}
