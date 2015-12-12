package ch1;

import java.util.Scanner;

/**
 * @author effessio
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int first = scanner.nextInt();
        System.out.println("enter second number");
        int second = scanner.nextInt();
        System.out.println("enter third number");
        int third = scanner.nextInt();

        int max;
        if (first > second) {
            if (first > third) {
                max = first;
            } else {
                max = third;
            }
        } else {
            if (second > third) {
                max = second;
            } else {
                max = third;
            }
        }
        System.out.println("max = " + max);

        max = Math.max(Math.max(first, second), third);
        System.out.println("max = " + max);



    }
}
