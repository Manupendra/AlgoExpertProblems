class Complex{
    int real,image;
}


public class Concepts {

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        StringBuffer s = new StringBuffer();
        char temp = 0;
        if(key>26)
            key=key%26;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) + key>122)
                temp = (char)( str.charAt(i) + key - 26);
            else
                temp = (char) (str.charAt(i) + key);
            s.append(temp);
        }
        return s.toString();
    }

    public String runLengthEncoding(String string) {
        // Write your code here.


        return "";
    }



    public static void main(String[] args) {
        Complex x=new Complex();
        int p=0;
        char a=97+25;
        System.out.println(a);
        System.out.println(caesarCypherEncryptor("abc",52));

    }
}
