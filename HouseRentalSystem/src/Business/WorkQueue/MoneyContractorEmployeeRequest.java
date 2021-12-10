/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Asset.Asset;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;

/**
 *
 * @author sanik
 */
public class MoneyContractorEmployeeRequest extends WorkRequest{
    
    private Network network;
    private Enterprise enterprise;
    private Organisation.Type orgType;
    private String requestID;
    private UserAccount merchant;
    private UserAccount customer;
    private UserAccount moneycontractoremp;
    private Asset asset;
    private String examinerNote;
    private String customerNote;
    private String status;
    private String requestedDate;
    private double discount;
    int min = 100;
    int max = 999;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organisation.Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Organisation.Type orgType) {
        this.orgType = orgType;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID() {
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        this.requestID = "Request" + randomNum;
    }

    public UserAccount getMerchant() {
        return merchant;
    }

    public void setMerchant(UserAccount merchant) {
        this.merchant = merchant;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public UserAccount getMoneycontractoremp() {
        return moneycontractoremp;
    }

    public void setMoneycontractoremp(UserAccount moneycontractoremp) {
        this.moneycontractoremp = moneycontractoremp;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public String getExaminerNote() {
        return examinerNote;
    }

    public void setExaminerNote(String examinerNote) {
        this.examinerNote = examinerNote;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    @Override
    public String toString() {
        return requestID;
    }
    
}
