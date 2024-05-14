package _04_ConditionalsAndLoops._02_FahrenheitToCelsius;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();
        int E = scanner.nextInt();
        int W = scanner.nextInt();

        scanner.close();

        while( S <= E) {
            System.out.println(S + " " + (int)((S - 32) * (5.0 / 9)));
            S = S + W;
        }
    }
}
