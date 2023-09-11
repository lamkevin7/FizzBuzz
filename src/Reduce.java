public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int steps = 0;
        while (i != 0) {
            boolean isEven = i % 2 == 0;
            if (isEven) {
                i = i / 2;
                steps += 1;

            } else {
                i = i - 1;
                steps += 1;

            }
        }
        System.out.println(steps);
    }
}
