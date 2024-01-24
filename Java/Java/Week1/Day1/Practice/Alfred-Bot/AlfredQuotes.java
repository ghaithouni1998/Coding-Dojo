import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        
        return String.format("placeholder for guest greeting return string", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
    
    
        return String.format("placeholder for date announcement return string", new Date());
    }
    
    
    public String respondBeforeAlexis(String conversation) {
    
        if(conversation.indexOf("Alexis") > -1) {
            return "She's really of no help. What can I get for you?";
        }

        if (conversation.indexOf("Alfred") > -1) {
            return "for snarky response return string?";
        }

        return "Right. And with that I shall retire.";
    }
    
	
}
