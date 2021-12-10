/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Asset.AssetDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.MoneyContractor.MoneyContractorEmployeeDirectory;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.activation.*;
import java.awt.*;

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

    public AssetDirectory getAssetDirectory() {
        return AssetDirectory;
    }

    public void setAssetDirectory(AssetDirectory AssetDirectory) {
        this.AssetDirectory = AssetDirectory;
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
    
    public boolean checkUniqueNetwork(String networkName) {
        for (Network n : business.getNetworkList()) {
            if (n.getName().toLowerCase().equals(networkName.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkIfEnterpriseIsUnique(String entName) {
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getName().toLowerCase().equals(entName.toLowerCase())) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public Boolean checkValidPasswordFormat(String password) {
        Pattern p1;
        p1 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        Matcher m1 = p1.matcher(password);
        boolean b1 = m1.matches();
        if (!b1) {
            JOptionPane.showMessageDialog(null, "Please enter valid password  format!\nPassword must contain at least one digit [0-9].\n"
                    + "Password must contain at least one lowercase Latin character [a-z].\n"
                    + "Password must contain at least one uppercase Latin character [A-Z].\n"
                    + "Password must contain at least one special character like ! @ # & ( ).\n"
                    + "Password must contain a length of at least 8 characters and a maximum of 20 characters.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    
    public boolean checkIfUserIsUnique(String userName) {
        boolean flag = true;
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount u : e.getUserAccountDirectory().getUserAccountList()) {
                    if (u.getUsername().toLowerCase().equals(userName.toLowerCase())) {
                        flag = false;
                    }
                }
                for (Organisation o : e.getOrganisationDirectory().getOrganisationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getUsername().toLowerCase().equals(userName.toLowerCase())) {
                            flag = false;
                        }
                    }
                }
            }
        }
        if ("admin".equals(userName.toLowerCase())) {
            flag = false;
        }
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Sorry! " + userName + " already exists in the system!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    
    public Boolean checkValidEmailFormat(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN
                = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid format of email! Ex: hello@hello.com", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public Boolean checkValidPhoneFormat(String phoneNo) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(phoneNo);
        if (matcher.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid format of phone! Ex: 9876543210", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean isNull(String strNum) {
        if (strNum.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isDouble(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
     public boolean isInt(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
     
     public boolean checkIfEmailIsUnique(String email, String username) {
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organisation o : e.getOrganisationDirectory().getOrganisationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getMailId() != null) {
                            if (u.getMailId().toLowerCase().equals(email.toLowerCase()) && !u.getUsername().equals(username)) {
                                JOptionPane.showMessageDialog(null, "Sorry! This Email Address already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
     
      public boolean checkIfPhoneIsUnique(String phone, String username) {
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organisation o : e.getOrganisationDirectory().getOrganisationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getContactnumber() != null) {
                            if (u.getContactnumber().equals(phone) && !u.getUsername().equals(username)) {
                                JOptionPane.showMessageDialog(null, "Sorry! This Contact Number already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
      
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    
    public static void sendEmailMessage(String emailId, String body) {
    String to = emailId;
    String from = "houserentalsystem123@gmail.com";
    String pass = "houserentalsystem";

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
