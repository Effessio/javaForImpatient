package ch1;

import java.util.Scanner;

/**
 * @author effessio
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter angle");
        int angle = scanner.nextInt();
        System.out.println(Math.floorMod(angle, 360));
        while (angle < 0) {
            angle += 360;
        }
        System.out.println(angle % 360);
    }
}
