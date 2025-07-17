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

        String numberAsString = "" + number;
        int sum = 0;

        if (numberAsString.length() == 1) {
            return number;
        }

        int currentNumber = number;


        for(int i = 0; i < numberAsString.length(); i++) {
            int lastDigit = currentNumber % 10;
            sum += lastDigit;

            currentNumber = currentNumber / 10;
        }

        return sum;
    }
}