import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueWords {
    public static void main(String[] args) {
        String str = "Guitar is instrument and Piano is instrument";
        String[] strArray = str.split("\\s+");
        Map<String, String> hMap = new HashMap<String, String>();
        for(int i = 0; i < strArray.length ; i++ ) {
            if(!hMap.containsKey(strArray[i])) {
                hMap.put(strArray[i],"");
            }
        }
        System.out.println(hMap);
        HashSet<String> hashSet = new HashSet<String>();
        for (int i = 0; i < strArray.length; i++) {
            if(!hashSet.contains(strArray[i]));
            hashSet.add(strArray[i]);
        }
        System.out.println(hashSet);
    }
}
