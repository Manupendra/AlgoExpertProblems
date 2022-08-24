/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s=new StringBuffer();
        for (int testcase = Integer.parseInt(br.readLine()); testcase >0 ; testcase--) {
            int n = Integer.parseInt(br.readLine());
            String ip[]=br.readLine().split(" ");
            int [] numbers = new int[ip.length];
            long sum = 0;
            for (int i = 0; i < ip.length; i++) {
                numbers[i]=Integer.parseInt(ip[i]);
                sum = sum+ numbers[i];
            }
            if(sum%2==0)
                s.append("1\n");
            else
                s.append("2\n");

        }
        System.out.print(s);
    }
}*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        for (int testcase = Integer.parseInt(br.readLine()); testcase > 0; testcase--) {

            String ip[] = br.readLine().split(" ");
            int arr[] = new int[ip.length];
            for (int i = 0; i < ip.length; i++) {
                arr[i] = Integer.parseInt(ip[i]);
            }
            double sum = 0;
            for (int i = 11; i >= arr[0]+1; i--) {
                sum+=arr[i];
            }
            int max=(int)Math.ceil(sum/arr[1]);
            int min=(int)Math.floor(sum/arr[1]);
            s.append(min+" "+max+"\n");

        }
        System.out.print(s);
    }
}
/*import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;
        import java.util.Collections;

public class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s=new StringBuffer();
        for (int testcase = Integer.parseInt(br.readLine()); testcase >0 ; testcase--) {
            String ip[]=br.readLine().split(" ");
            int [] numbers = new int[ip.length];
            for (int i = 0; i < ip.length; i++) {
                numbers[i] = Integer.parseInt(ip[i]);
            }
            Arrays.sort(numbers);
            if(numbers[0]+numbers[1]==numbers[2])
                s.append("YES\n");
            else
                s.append("NO\n");

        }
        System.out.print(s);
    }
}*/

