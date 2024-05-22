import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, "+name+". Lovely to see you";
    }
    
    public String dateAnnouncement() {
        
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("How are you?");
        sdf.setTimeZone(TimeZone.getTimeZone("PDT"));
        String formattedDate = sdf.format(currentDate);

        return "It is currently "+formattedDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis")!= -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred")!= -1){
            return "At your service. As you wish, naturally";
        }
        else return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        public String guestGreeting() {
        return "Hello";
    }
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
        
}
