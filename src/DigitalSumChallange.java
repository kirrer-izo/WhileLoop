public class DigitalSumChallange {

    public static void main(String[] args) {
        System.out.println("Sum of digits is " + sumDigits(1000));
        System.out.println("Sum of digits is " + sumDigits(1234));
        System.out.println("Sum of digits is " + sumDigits(-125));
    }

    public static int sumDigits (int number) {
        // n % 10 to extract the last digit
        // n / 10 to remove the last digit
        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number > 9) {
            int digits = number % 10;
//            System.out.println(digits);
            sum += digits;
            number = number / 10;
        }
        sum += number;
        return sum;

    }
}
