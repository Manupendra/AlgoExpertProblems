package string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    static int firstNonRepeatingCharacter(String string) {
        // Using HashMap.
        Map<Character, Integer> frequenciesMap = new HashMap<>();
        char[] charArr = string.toCharArray();
        for (int index = 0; index < charArr.length; index++) {
            char c = charArr[index];
            frequenciesMap.put(c, frequenciesMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if (frequenciesMap.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("abcdcaf"));
    }
}
