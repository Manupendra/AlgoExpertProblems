package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Using HashTable
        Map<String, Integer> winnerCountMap = new HashMap<>();
        int noOfMatches = competitions.size();
        for (int i = 0; i < noOfMatches; i++) {
            if (results.get(i) == 1) {//HomeTeam wons
                if (winnerCountMap.containsKey(competitions.get(i).get(0))) {
                    winnerCountMap.put(competitions.get(i).get(0), winnerCountMap.get(competitions.get(i).get(0)) + 1);
                } else {
                    winnerCountMap.put(competitions.get(i).get(0), 1);
                }
            } else {//AwayTeam wons
                if (winnerCountMap.containsKey(competitions.get(i).get(1))) {
                    winnerCountMap.put(competitions.get(i).get(1), winnerCountMap.get(competitions.get(i).get(1)) + 1);
                } else {
                    winnerCountMap.put(competitions.get(i).get(1), 1);
                }
            }
        }
        int maxCount = Integer.MIN_VALUE;
        StringBuffer winnerTeam = new StringBuffer();
        for (Map.Entry<String, Integer> entry : winnerCountMap.entrySet()) {
            if (maxCount < entry.getValue()){
                maxCount = entry.getValue();
                winnerTeam.delete(0,winnerTeam.length());
                winnerTeam.append(entry.getKey());
            }
        }
        return winnerTeam.toString();
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
        System.out.println(tournamentWinner(competitions,results));
    }
}
