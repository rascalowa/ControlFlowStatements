public class Main {
    public static void main(String[] args) {
        int sumOfNumbersDivisibleBy3And5 = 0;
        int divisibleBy3And5Counter = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                System.out.println("Match - " + loopNumber);
                sumOfNumbersDivisibleBy3And5 += loopNumber;
                divisibleBy3And5Counter++;

                if (divisibleBy3And5Counter == 5) {
                    System.out.println("Found 5 matches - exit the loop");
                    break;
                }
            }

        }

        System.out.println("Sum of matches: " + sumOfNumbersDivisibleBy3And5);
    }
}