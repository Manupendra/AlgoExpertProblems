import java.util.HashMap;
import java.util.LinkedHashMap;

public class Encoding {
     static String runLengthEncoding(String string) {
        // Write your code here.
        HashMap<Character,Integer> hMap = new LinkedHashMap<Character,Integer>();
        StringBuffer o = new StringBuffer();
        char[] strArray = string.toCharArray();
        int[] count = new int[strArray.length];
        char[] seq = new char[strArray.length];
        seq[0] = strArray[0];
        int seqN = 0;
        count[0] = 1;

         for (int i = 1; i < strArray.length; i++) {
            if(strArray[i]==strArray[i-1]){
                //increase the count if matched with previous
                count[seqN]++;
            }else{
                //add the in seq
                seqN+=1;
                seq[seqN] = strArray[i];
                count[seqN] = 1;
            }

            /*if (hMap.containsKey(c)) {
                // If char is present in charCountMap,
                // incrementing it's count by 1
                hMap.put(c, hMap.get(c) + 1);
            }
            else {
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                hMap.put(c, 1);
            }*/
            //System.out.println(hMap);
        }

         //System.out.println(" ");
        //System.out.println(hMap);
         for (int i = 0; i < seqN; i++) {
             //if(count[i]%9)
         }
         //System.out.println(hMap);
        /*hMap.entrySet().forEach(entry->{
            if(entry.getValue()%9!=0){
                //remainder is non-zero
                if(entry.getValue()/9!=0){
                    for (int i = 0; i < entry.getValue()/9; i++) {
                        o.append("9"+entry.getKey());
                    }
                }
                long n = entry.getValue()%9;
                o.append(n+""+entry.getKey());
            }
        });*/



        return o.toString();
    }
    public static void main(String[] args) {
        System.out.println(runLengthEncoding("aAaAaaaaaAaaaAAAABbbbBBBB"));
    }
}
