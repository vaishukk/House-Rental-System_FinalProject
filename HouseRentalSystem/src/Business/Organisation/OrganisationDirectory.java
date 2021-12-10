/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Organisation.Organisation.Type;
import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class OrganisationDirectory {
    private final ArrayList<Organisation> organisationList;

    public OrganisationDirectory() {
        organisationList = new ArrayList();
    }

    public ArrayList<Organisation> getOrganisationList() {
        return organisationList;
    }
    
    public Organisation createOrganisation(Type type, String name) {
        Organisation organisation = null;
        if (type.getValue().equals(Type.Broker.getValue())) {
            organisation = new BrokerOrganisation(name);
            organisationList.add(organisation);
        } else if (type.getValue().equals(Type.Constructor.getValue())) {
            organisation = new BuilderOrganisation(name);
            organisationList.add(organisation);
        } else if (type.getValue().equals(Type.Supervisor.getValue())) {
            organisation = new SupervisorOrganisation(name);
            organisationList.add(organisation);
        } else if (type.getValue().equals(Type.CameraMan.getValue())) {
            organisation = new PhotoVideoOrganisation(name);
            organisationList.add(organisation);
        } 
        else if (type.getValue().equals(Type.Repair.getValue())) {
            organisation = new RepairOrganisation(name);
            organisationList.add(organisation);
        } else if (type.getValue().equals(Type.MoversPackers.getValue())) {
            organisation = new MoversPackersOrganisation(name);
            organisationList.add(organisation);
        } else if (type.getValue().equals(Type.MoneyContractor.getValue())) {
            organisation = new MoneyContractorOrganisation(name);
            organisationList.add(organisation);
        }
        else if (type.getValue().equals(Type.Customer.getValue())) {
            organisation = new CustomerOrganisation(name);
            organisationList.add(organisation);
        }
        else if (type.getValue().equals(Type.Merchant.getValue())) {
            organisation = new MerchantOrganisation(name);
            organisationList.add(organisation);
        }
        return organisation;
    }
    
}
