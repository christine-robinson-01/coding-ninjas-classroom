package _02_GettingStartedWithJava._01_AverageMarks;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();

        scanner.close();

        int average = (m1 + m2 + m3) / 3;

        System.out.println(name.charAt(0));
        System.out.println(average);
    }
}
