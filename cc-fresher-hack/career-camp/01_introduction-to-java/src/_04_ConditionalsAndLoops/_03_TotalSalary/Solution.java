package _04_ConditionalsAndLoops._03_TotalSalary;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int basic = scanner.nextInt();
        char grade = scanner.next().charAt(0);

        scanner.close();

        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double pf = 0.11 * basic;
        int allow;

        if( grade == 'A' ) {
            allow = 1700;
        } else if( grade == 'B' ) {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double total = basic + hra + da + allow - pf;
        System.out.println(Math.round(total));
    }
}
