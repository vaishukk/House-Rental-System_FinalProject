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
public class DealerOrganisation extends Organisation{
    
    public DealerOrganisation(String name) {
        super(name);
    }
    
   // @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        //roles.add(new DealerRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organisation.Type.Dealer;
    }  
    
}