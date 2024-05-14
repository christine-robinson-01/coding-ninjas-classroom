package _04_ConditionalsAndLoops._07_FindPowerOfNumber;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = scanner.nextInt();

        scanner.close();

        int result = 1;

        while(n > 0) {
            result *= x;
            n--;
        }

        System.out.println(result);
    }
}
