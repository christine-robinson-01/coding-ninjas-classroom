package _04_ConditionalsAndLoops._04_MultiplicationTable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        int i = 1;
        while(i <= 10) {
            System.out.println( i * n);
            i++;
        }
    }
}
