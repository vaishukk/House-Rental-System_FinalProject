/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Asset.AssetDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.MoneyContractor.MoneyContractorEmployeeDirectory;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Kiran
 */
public class EcoSystem extends Organisation{
    private static EcoSystem business;
    private OrganisationDirectory organisationDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private MoneyContractorEmployeeDirectory moneyContractorEmployeeDirectory;
    private AssetDirectory AssetDirectory;
    
    private ArrayList<Network> networkList;

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        enterpriseDirectory = new EnterpriseDirectory();
    }

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
    
     public static void setInstance(EcoSystem system) {
        business = system;
    }
     
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    public static void sendEmailMessage(String emailId, String body) {
    String to = emailId;
    String from = "vkvaishnavikk472@gmail.com";
    String pass = "Panchatpangya";

    Properties properties = System.getProperties();
    String host = "smtp.gmail.com";
    properties.put("mail.smtp.starttls.enable", "true");
    properties.put("mail.smtp.ssl.trust", host);
    properties.put("mail.smtp.user", from);
    properties.put("mail.smtp.port", "587");
    properties.put("mail.smtp.auth", "true");

    Session session = Session.getDefaultInstance(properties);
    try {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject("New User Registration");
        message.setText(body);
        Transport transport = session.getTransport("smtp");
        transport.connect(host, from, pass);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
        System.out.println("Sent message successfully....");
    } catch (MessagingException mex) {
        JOptionPane.showMessageDialog(null, "Invalid Email Address");
    }
}    

    

    

    
    
}
