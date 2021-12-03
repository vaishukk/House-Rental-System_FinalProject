/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SMS;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author Kiran
 */
public class Sms {
    

    public static final String ACCOUNT_SID = "AC960d94b5925eb5842550d73cc793c944";
    public static final String AUTH_TOKEN = "edd4385ce576897ddb4635044bca2c3d";
    public final String fromNum = "+14023068382";
    public String toNum;
    public String body;

    public Sms(String toNum, String body) {
        this.toNum = toNum;
        this.body = body;
        try {
            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

            List<NameValuePair> params = new ArrayList<>();
            params.add(new BasicNameValuePair("Body", body));
            params.add(new BasicNameValuePair("To", toNum));
            params.add(new BasicNameValuePair("From", fromNum));

            MessageFactory messageFactory = client.getAccount().getMessageFactory();
            Message message = messageFactory.create(params);
            System.out.println(message);
        } catch (TwilioRestException e) {
            System.out.println(e);
        }
    }
    
   
}
