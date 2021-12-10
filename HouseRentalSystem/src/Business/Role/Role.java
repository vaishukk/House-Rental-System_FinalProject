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
import javax.swing.JPanel;

/**
 *
 * @author Kiran
 */
public abstract class Role {
    
        public enum RoleType{
        Admin("Admin"),
        Customer("Customer"),//Customer
        Merchant("Merchant"),//Merchant
        Supervisor("Supervisor"),//Supervisor
        Broker("Broker"),//Broker
        Constructor("Constructor"),
        AssetManager("Asset Manager"),//AssetManager
        Repair("Repair"),
        Miscellaneous("Miscellaneous"),
        MoversPackers("Movers & Packers"),
        CameraMan("CameraMan"),
        MoneyContractorEmployee(" Money Contractor Employee"),//MaintenanceEmployee
        QCadmin("Quality Control Admin"),
        BrokerAdmin("Broker Admin"),//BrokerAdmin
        MaintenanceProviderAdmin("Maintenance Provider Admin"),//Maintenance Provider Admin
        AssetAdmin("Asset Admin");//Asset Admin
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
        
        
    }
     
   public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organisation organisation, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);
         
        
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
