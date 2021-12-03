/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Asset;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Kiran
 */
public class Asset {
    private String homeImg;
    private String assetID;
    private String assetName;
    private String street;
    private String city;
    private String state;
    private String pincode;
    private String status;
    private double price;
    private int bhk;
    private double bathroom;
    private UserAccount merchant;
    private UserAccount customer;
    private double longitude;
    private double latitude;
    
    ArrayList<ImageIcon> imagelist = new ArrayList<>();
    ArrayList<UserAccount> RegisteredCustomer = new ArrayList<UserAccount>();
    ArrayList<UserAccount> CustomerList = new ArrayList<UserAccount>();

    public String getHomeImg() {
        return homeImg;
    }

    public void setHomeImg(String homeImg) {
        this.homeImg = homeImg;
    }

    public String getAssetID() {
        return assetID;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBhk() {
        return bhk;
    }

    public void setBhk(int bhk) {
        this.bhk = bhk;
    }

    public double getBathroom() {
        return bathroom;
    }

    public void setBathroom(double bathroom) {
        this.bathroom = bathroom;
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

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public ArrayList<ImageIcon> getImagelist() {
        return imagelist;
    }

    public void setImagelist(ArrayList<ImageIcon> imagelist) {
        this.imagelist = imagelist;
    }

    public ArrayList<UserAccount> getRegisteredCustomer() {
        return RegisteredCustomer;
    }

    public void setRegisteredCustomer(ArrayList<UserAccount> RegisteredCustomer) {
        this.RegisteredCustomer = RegisteredCustomer;
    }

    public ArrayList<UserAccount> getCustomerList() {
        return CustomerList;
    }

    public void setCustomerList(ArrayList<UserAccount> CustomerList) {
        this.CustomerList = CustomerList;
    }
    
    
    
    @Override
    public String toString() {
        return assetName;
    }
    
}
