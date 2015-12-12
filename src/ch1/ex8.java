package ch1;

import java.util.Scanner;

/**
 * @author effessio
 */
public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter input string");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j < input.length()+1; j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }

}
