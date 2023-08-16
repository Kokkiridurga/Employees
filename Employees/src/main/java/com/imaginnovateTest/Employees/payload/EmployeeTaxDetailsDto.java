package com.imaginnovateTest.Employees.payload;
import java.time.LocalDate;

/**
 * @author durga
 *
 */
public class EmployeeTaxDetailsDto {
	
    private Long employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate DOJ;
    private Double salary;
    private Double totalTexAmount;
    private Double totalCessAmount;

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDOJ() {
        return DOJ;
    }

    public void setDOJ(LocalDate DOJ) {
        this.DOJ = DOJ;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getTotalTexAmount() {
        return totalTexAmount;
    }

    public void setTotalTexAmount(Double totalTexAmount) {
        this.totalTexAmount = totalTexAmount;
    }

    public Double getTotalCessAmount() {
        return totalCessAmount;
    }

    public void setTotalCessAmount(Double totalCessAmount) {
        this.totalCessAmount = totalCessAmount;
    }

    @Override
    public String toString() {
        return "EmployeeTaxDetailsDTO{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", DOJ=" + DOJ +
                ", salary=" + salary +
                ", totalTexAmount=" + totalTexAmount +
                ", totalCessAmount=" + totalCessAmount +
                '}';
    }
}
