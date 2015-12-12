package ch1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;


/**
 * @author effessio
 */
public class ex13 {
    public static Random generator = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> lot = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            input.add(i);
        }
        for (int i = 0; i < 6; i++) {
            int t = generator.nextInt(input.size());
            lot.add(input.remove(t));
        }
        lot.sort(Comparator.<Integer>naturalOrder());
        System.out.println(lot);
    }
}
