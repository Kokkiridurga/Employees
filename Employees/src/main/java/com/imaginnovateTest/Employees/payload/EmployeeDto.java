package com.imaginnovateTest.Employees.payload;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/**
 * @author durga
 *
 */
public class EmployeeDto {

	private Long empId;

	@NotNull(message = "firstname is mandatory")
	private String firstname;

	@NotNull(message = "lastname is mandatory")
	private String lastname;

	@Email(message = "Email is mandatory", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	@NotNull(message = "Email is mandatory")
	private String email;

	@NotEmpty(message = "atleast one Phone no. is mandatory")
	private List<String> phoneNumbers;

	@NotNull(message = "Date of joining is mandatory")
	private LocalDate doj;

	private Double salary;

	public EmployeeDto(Long empId, @NotNull(message = " required firstname ") String firstname,
			@NotNull(message = " required lastname") String lastname,
			@Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") @NotNull(message = " required Email") String email,
			@NotEmpty(message = "required atleast one Phone no") @Pattern(regexp = "^[0-9\\-]+$") List<String> phoneNumbers,
			@NotNull(message = " required Date of joining ") LocalDate doj, Double salary) {
		super();
		this.empId = empId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.doj = doj;
		this.salary = salary;
	}

	public EmployeeDto(@NotNull(message = " required firstname ") String firstname,
			@NotNull(message = " required lastname") String lastname,
			@Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") @NotNull(message = " required Email") String email,
			@NotEmpty(message = "required atleast one Phone no") @Pattern(regexp = "^[0-9\\-]+$") List<String> phoneNumbers,
			@NotNull(message = " required Date of joining ") LocalDate doj, Double salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.doj = doj;
		this.salary = salary;
	}

	public EmployeeDto() {
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

	@Override
	public String toString() {
		return "EmployeeDto [empId=" + empId + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", phoneNumbers=" + phoneNumbers + ", doj=" + doj + ", salary=" + salary + "]";
	}

}
