package _04_ConditionalsAndLoops._06_Factors;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        boolean isPrime = true;

        int i = 2;
        while(i <= n / 2) {
            if( n % i == 0) {
                isPrime = false;
                System.out.print(i + " ");
            }
            i++;
        }

        if(isPrime) {
            System.out.println("-1");
        }
    }
}
