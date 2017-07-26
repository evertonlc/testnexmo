//https://www.nexmo.com/blog/2017/05/03/send-sms-messages-with-java-dr/?utm_source=dzone&utm_medium=paid_content&utm_campaign=dailydigest_send-sms-java_25Jul17
package getstarted;

import com.nexmo.client.NexmoClient;
import com.nexmo.client.auth.AuthMethod;
import com.nexmo.client.auth.TokenAuthMethod;
import com.nexmo.client.sms.SmsSubmissionResult;
import com.nexmo.client.sms.messages.TextMessage;

public class SendSMS {

    public static final String API_KEY="***********";
    public static final String API_SECRET="***********";
    public static final String FROM_NUMBER="***********";
    public static final String TO_NUMBER="***********";

    public static void main(String[] args) throws Exception {
        AuthMethod auth = new TokenAuthMethod(API_KEY, API_SECRET);
        NexmoClient client = new NexmoClient(auth);
        TextMessage message = new TextMessage(FROM_NUMBER, TO_NUMBER, "Holla!!!");
        SmsSubmissionResult[] responses = client.getSmsClient().submitMessage(message);
        for (SmsSubmissionResult response : responses) {
            System.out.println(response);
        }
    }
}