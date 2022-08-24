package string;

import java.util.HashMap;
import java.util.Map;

class GenerateDocument {

    public static boolean generateDocument(String characters, String document) {
        // Using HashMap
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> docMap = new HashMap<>();
        char[] charactersArr = characters.toCharArray();
        for (int i = 0; i < charactersArr.length; i++) {
            if (map.containsKey(charactersArr[i]) && charactersArr[i] != ' ') {
                map.put(charactersArr[i], map.get(charactersArr[i]) + 1);
            } else {
                if (charactersArr[i] == ' ')
                    continue;
                else
                    map.put(charactersArr[i], 1);
            }

        }
        char[] documentArr = document.toCharArray();
        for (int i = 0; i < documentArr.length; i++) {
            if (docMap.containsKey(documentArr[i]) && documentArr[i] != ' ') {
                docMap.put(documentArr[i], docMap.get(documentArr[i]) + 1);
            } else {
                if (documentArr[i] == ' ')
                    continue;
                else
                    docMap.put(documentArr[i], 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : docMap.entrySet()) {
            if (!map.containsKey(entry.getKey()) || map.get(entry.getKey()) < entry.getValue())
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(generateDocument("helloworldO", "hello wOrld"));
    }
}

