/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Kiran
 */
public class WorkRequest {
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date request_Date;
    private Date resolve_Date;
    private String quote;
    
    public WorkRequest() {
        request_Date = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequest_Date() {
        return request_Date;
    }

    public void setRequest_Date(Date request_Date) {
        this.request_Date = request_Date;
    }

    public Date getResolve_Date() {
        return resolve_Date;
    }

    public void setResolve_Date(Date resolve_Date) {
        this.resolve_Date = resolve_Date;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
    
    
    
}
