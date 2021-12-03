/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

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
    
    
    
}
