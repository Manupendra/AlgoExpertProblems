public class Practice {
    static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 5;

        // The ++ operator changes the value
        //  of the variable, but you can also
        //  use the result in an expression:

        System.out.println(x++);  // post-increment
        System.out.println(++y);  // pre-increment

        // assignment statements are also expressions.
        //  However, the code below is bad: it's too likely
        //  to be a typo; probably you wanted ==, the
        //  the equality comparison.
        System.out.println(x = y);
        System.out.println(x += (y-- - (x = 4) ));
    }
}
