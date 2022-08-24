import java.util.Collections;
import java.util.*;

public class Subsequences {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        Collections.sort(array);
        Collections.sort(sequence);
        int seq_indx=0;
        for(int i=0;i<array.size();i++){
            if(seq_indx<sequence.size()){
                if(array.get(i)==sequence.get(seq_indx))
                    seq_indx++;
            }

        }
        if(seq_indx==sequence.size())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        /*List<Integer> array=Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> s=Arrays.asList(1, 6, -1, 10);
        isValidSubsequence(array,s);*/

    }
}
