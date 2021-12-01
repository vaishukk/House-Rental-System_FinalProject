/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;

/**
 *
 * @author Kiran
 */
public class EcoSystem extends Organisation{
    private static EcoSystem business;
    private OrganisationDirectory organisationDirectory;

    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }

    public void setOrganisationDirectory(OrganisationDirectory organisationDirectory) {
        this.organisationDirectory = organisationDirectory;
    }
    
    
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    

    
    
}
