/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Kiran
 */
public class UserAccount {
    private String username;
    private String password;
    private String name;
    private String status;
    public Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private String contactnumber;
    private String address;
    private String zip;
    private String mailId;
    private String City;
    private String State;
    private String cost;
    private String NationId;
    private String IdDoc;
    private boolean isApproved;
    private Enterprise userEnterpriseList;
    private Organisation userOrganisationList;
    
    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getNationId() {
        return NationId;
    }

    public void setNationId(String NationId) {
        this.NationId = NationId;
    }

    public String getIdDoc() {
        return IdDoc;
    }

    public void setIdDoc(String IdDoc) {
        this.IdDoc = IdDoc;
    }

    public boolean isIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public Enterprise getUserEnterpriseList() {
        return userEnterpriseList;
    }

    public void setUserEnterpriseList(Enterprise userEnterpriseList) {
        this.userEnterpriseList = userEnterpriseList;
    }

    public Organisation getUserOrganisationList() {
        return userOrganisationList;
    }

    public void setUserOrganisationList(Organisation userOrganisationList) {
        this.userOrganisationList = userOrganisationList;
    }
    
    
    
    public Object getUserAccountDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
