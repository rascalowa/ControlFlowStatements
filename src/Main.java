public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(3));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(32123));
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}