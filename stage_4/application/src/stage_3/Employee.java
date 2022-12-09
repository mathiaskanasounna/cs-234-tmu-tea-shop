/**
 *   Name:
 *      - Mathias K.
 *      - Theodoro L.
 *   Date: 11/13/2022
 *   Title: Project Stage 3
 *   Class: CS-234
 *
 * */
package stage_4.application.src.stage_3;

import stage_3.Person;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person {
    private String employeeId;
    private LocalDate hireDate;
    private LocalDate leaveDate;
    private String employeeStatus;
    private  String userName;

    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, String email, String streetAddress, String city, String zipCode, String state, String telephone,
            String employeeId, LocalDate hireDate, LocalDate leaveDate, String employeeStatus, String userName) {
        super(firstName, lastName, email, streetAddress, city, zipCode, state, telephone);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
        this.leaveDate = leaveDate;
        this.employeeStatus = employeeStatus;
        this.userName = userName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(LocalDate leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void showEmployeeInfo(){
        System.out.println("["+employeeId+", "+this.getFirstName()+", "+this.getLastName()+", "+this.employeeStatus+", "+this.getUserName()+" ]");
    }

}
