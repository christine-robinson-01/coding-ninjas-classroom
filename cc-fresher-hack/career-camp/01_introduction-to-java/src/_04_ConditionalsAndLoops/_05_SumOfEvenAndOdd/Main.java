package _04_ConditionalsAndLoops._05_SumOfEvenAndOdd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        int oddSum = 0;
        int evenSum = 0;

        while( n > 0 ) {
            int digit = n % 10;

            if(digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            n /= 10;
        }

        System.out.println(evenSum + " " + oddSum);
    }
}
