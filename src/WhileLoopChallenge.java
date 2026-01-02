public class WhileLoopChallenge {

    public static void main(String[] args) {
//        int i = 4;
//        while (i <= 20) {
//            i++;
//            if (!isEvenNumber(i)) {
//                continue;
//            }
//            System.out.println("Found even number " + i);
//
//        }

        int evenCount = 0;
        int oddCount = 0;
        int i = 4;

        while (i <= 20) {
            if (evenCount == 5) {
                break;
            }
            i++;
            if (isEvenNumber(i)) {
                System.out.println("Even Number " + i);
                evenCount ++;
            }

            if (isEvenNumber(i)) {
                oddCount++;
            }
        }

        System.out.println("Total number of even numbers is " + evenCount);
        System.out.println("Total number of odd numbers is " + oddCount);
    }

    public static boolean isEvenNumber (int number) {
        return (number % 2 == 0);
    }
}
