package string;

import java.util.*;

public class AnagramsGroup {
    public static List<List<String>> groupAnagrams(List<String> words) {
        //HashMap
        Map<String, List<String>> anagrams = new HashMap<String, List<String>>();

        for (String word : words) {
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String sortedWord = new String(charArr);

            if (anagrams.containsKey(sortedWord)) {
                anagrams.get(sortedWord).add(word);
            } else {
                anagrams.put(sortedWord, new ArrayList<String>(Arrays.asList(word)));
            }
        }
        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        List<String> words =
                new ArrayList<String>(
                        Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
        System.out.println(groupAnagrams(words));
    }


}
