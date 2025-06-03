package base;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import javax.mail.BodyPart;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
public class EmailTest 
{
	
	public String ReadEmail() throws IOException, MailosaurException
	{
		// Available in the API tab of a server
	    String apiKey = "CmNpbTBlCEpJRtpwduhNALuxkCREzETK";
	    String serverId = "5hqufdbf";
	    String serverDomain = "5hqufdbf.mailosaur.net";
	    String  emailid = "milk-clothing@";

	    MailosaurClient mailosaur = new MailosaurClient(apiKey);

	    MessageSearchParams params = new MessageSearchParams();
	    params.withServer(serverId);
	    params.withTimeout(60000); // Wait longer for email to arrive
	    
	    SearchCriteria criteria = new SearchCriteria();
	    String email= emailid + serverDomain;
	    criteria.withSentTo(email);
	    
	    
	    
	 // Fetch the email
	    Message message = mailosaur.messages().get(params, criteria);
	  
	 // Extract HTML content
        String htmlBody = message.html().body();
        
     // Parse HTML with JSoup
        Document doc = Jsoup.parse(htmlBody);
        String text = doc.text();  // Converts HTML to plain text
        
        System.out.println(text);
        // Parse HTML with JSoup
        System.out.println("Extracted Email Text: " + text);
        
     // Use regex to find OTP
        Pattern pattern = Pattern.compile("OTP[:\\s]*([0-9]{6})");
        Matcher matcher = pattern.matcher(text);
        

        if (matcher.find()) 
        {
            String OTP = matcher.group(1);
            System.out.println("Extracted OTP: " + OTP);
            return OTP;
        } 
        else 
        {
            throw new RuntimeException("OTP not found in the email body!");
        }
	}

}
