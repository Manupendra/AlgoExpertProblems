import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static long getTime(String s) {
        // Write your code here
        String[] alp={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        long time=Math.abs((s.charAt(0)-'A')%26);
        for(int j=1;j<s.length();j++){
            long p=Math.abs((s.charAt(j)-s.charAt(j-1)))%26;
            long pd=Math.abs(26-p);
            if(p<pd)
                time+=p;
            else
                time+=pd;
        }
        return time;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(getTime("AZGB"));
    }
}
