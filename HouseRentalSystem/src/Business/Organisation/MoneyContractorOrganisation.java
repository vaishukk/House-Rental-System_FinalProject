/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class MoneyContractorOrganisation extends Organisation{
    
    public MoneyContractorOrganisation(String name) {
        super(name);
    }
    
    //@Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        //roles.add(new MoneyContractorEmployeeRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organisation.Type.MoneyContractor;
    }  
    
}