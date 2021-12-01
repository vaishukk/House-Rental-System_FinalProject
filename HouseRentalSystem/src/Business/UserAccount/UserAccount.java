/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
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
    private String Phone;
    private String Street;
    private String Zipcode;
    private String Email;
    private String City;
    private String State;
    private String Charge;
    private String NationId;
    private String IdDoc;
    private boolean isApproved;
    //private Enterprise userEnterpriseList;
    private Organisation userOrganisationList;
    
}
