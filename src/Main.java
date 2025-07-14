public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        int j = 1;
        boolean isReady = false;

        while (isReady) {
            if (j >= 3) {
                break;
            }
            System.out.println(j);
            j++;
        }

        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while (isReady);

        int number = 0;
        while (number < 50) {
            number += 5;

            if (number % 25 == 0) {
                continue;
            }

            System.out.print(number + "_");
        }
    }
}