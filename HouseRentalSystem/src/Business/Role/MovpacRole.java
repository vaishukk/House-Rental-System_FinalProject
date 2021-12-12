/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UI.MoversNPackers.PackersandMoversWorkAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author sanik
 */
public class MovpacRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise,Network network, EcoSystem business) {
        return new PackersandMoversWorkAreaPanel(userProcessContainer,account,organisation,enterprise,network,business);
    }
 @Override
    public String toString(){
        return (Role.RoleType.MoversPackers.getValue());
    }
    
}
