/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.ExaminerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class ExaminerOrganisation extends Organisation{
    
    public ExaminerOrganisation(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ExaminerRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organisation.Type.Examiner;
    }  
    
}
