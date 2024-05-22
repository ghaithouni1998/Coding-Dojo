
import java.util.HashMap;
import java.util.Set;
public class MapHashmatique {

	public static void main(String[] args) {

		HashMap<String, String> trackList = new HashMap<String, String>();
 
trackList.put("  Hideaway ");
trackList.put("Goodbye and I Love You");
trackList.put(" All of My Life ");
trackList.put("All Those Years Ago ");
String Ghonneya = trackList.get("");

Set<String> keys = trackList.keySet();
for(String key : keys) {
    System.out.println(key);
    System.out.println(trackList.get(key));    
}


	}

}