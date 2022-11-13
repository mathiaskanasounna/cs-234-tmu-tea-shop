/**
 *   Name:
 *      - Mathias K.
 *      - Theodoro L.
 *   Date: 11/13/2022
 *   Title: Project Stage 3
 *   Class: CS-234
 *
 * */
package stage_3;

public class Manager extends Employee{
    private String managerId;

    public String getManagerId() {
        return managerId;
    }

    public Manager() {
    }
    public Manager(Employee employee){
        this.setEmployeeId(employee.getEmployeeId());
        this.setHireDate(employee.getHireDate());
        this.setLeaveDate(employee.getLeaveDate());
        this.setEmployeeStatus(employee.getEmployeeStatus());
        this.setUserName(employee.getUserName());
        this.setFirstName(employee.getFirstName());
        this.setLastName(employee.getLastName());
        this.setEmail(employee.getEmail());
        this.setStreetAddress(employee.getStreetAddress());
        this.setCity(employee.getCity());
        this.setZipCode(employee.getZipCode());
        this.setState(employee.getState());
        this.setTelephone(employee.getTelephone());
    }
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public void showManagerInfo() {
    }
}
