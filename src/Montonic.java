public class Montonic {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        int monovalue = 0;
        int flag[] = new int[array.length - 1];
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] > 0)
                flag[i - 1] = 1;
            else if (array[i] - array[i - 1] < 0)
                flag[i - 1] = -1;
            else flag[i - 1] = 0;
        }
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] > 0 && (monovalue >= 0))
                monovalue = flag[i];
            if (flag[i] < 0 && (monovalue <= 0))
                monovalue = flag[i];

        }

        return true;

    }

    public static void main(String[] args) {
        int list[] = new int[]{1, 3, 4, 5, 5, 7};
        System.out.println(isMonotonic(list));

    }
}
