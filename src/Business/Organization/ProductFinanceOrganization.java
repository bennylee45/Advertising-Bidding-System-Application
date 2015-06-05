/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ProductFinancerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anna
 */
public class ProductFinanceOrganization extends Organization {

    public ProductFinanceOrganization(){
        super(Organization.Type.ProductFinance.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProductFinancerRole());
        return roles;      
    
    }
    
}
