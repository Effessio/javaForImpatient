package ch1;

import java.util.Scanner;

/**
 * @author effessio
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter int");
        int i = in.nextInt();
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));

        float reciprocal = (float) (1.0 / i);
        System.out.println(Float.toHexString(reciprocal));

    }
}
