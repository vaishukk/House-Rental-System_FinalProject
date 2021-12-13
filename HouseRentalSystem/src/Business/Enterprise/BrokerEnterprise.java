/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.BrokerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class BrokerEnterprise extends Enterprise{
    public BrokerEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Broker);
    }

    @Override
    public ArrayList<Role> getCorrespondingRole() {
        roles = new ArrayList<Role>();
        roles.add(new BrokerRole());
        return roles;
    }
    
}
