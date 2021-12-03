/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author Kiran
 */
public class Role {
    
        public enum RoleType{
        Admin("Admin"),
        Buyer("Buyer"),//Customer
        Seller("Seller"),//Merchant
        Inspector("Inspector"),//Supervisor
        Agent("Agent"),//Broker
        Builder("Builder"),
        PropertyManager("Property Manager"),//AssetManager
        Electrician("Electrician"),
        Miscellaneous("Miscellaneous"),
        MoversPackers("Movers & Packers"),
        Photographer("Photographer"),
        GovermentEmployee("Goverment Employee"),//MaintenanceEmployee
        QAadmin("Quality Assuarance Admin"),
        BrokerAdmin("Broker Admin"),//BrokerAdmin
        ServiceProviderAdmin("Service Provider Admin"),//Maintenance Provider Admin
        PropertyAdmin("Property Admin");//Asset Admin
        
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
        
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
