import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        for (int i = 10; i > 1; i--) {
            if(N%i==0){
                s.append(i);
                break;
            }

        }
        System.out.print(s);
    }
}
