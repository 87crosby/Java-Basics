import java.util.HashMap;
import java.util.Set;

public class HashMapping{
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Blastoff", "We gonna run thru hell with like 20 hunna choppas");
        trackList.put("Camelot", "Opposition mad if they play, they getting popped quick");
        trackList.put("When I See You", "Now we smokin twenty three-eeee");
        trackList.put("The Wellerman", "Soon may the wellerman come to bring us sugar and tea and rum");

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }

}