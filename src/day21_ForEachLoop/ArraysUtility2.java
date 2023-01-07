package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[] students ={"Elif","Sinem","Gunay","Cihad","David","James","Aeron","Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 2);  // Elif, Sinem

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 4); //{1.2.3.4.5}

        System.out.println(Arrays.toString(numbers));

        System.out.println("------------------------------------------");

        char [] ch1 = {'A','B','C','D','E','F','G','H','I'};
        //index          0  1   2   3   4   5   6   7   8
        char [] ch2 = Arrays.copyOfRange(ch1, 2, 6+1); // [C, D, E, F, G]

        System.out.println(Arrays.toString(ch2));

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        //index          0  1  2  3  4  5  6  7  8  9
        int[] result = Arrays.copyOfRange(scores, 3,8); // [40, 50, 60, 70, 80]

        System.out.println(Arrays.toString(result));

        int [] result2 = Arrays.copyOfRange(scores, 5,scores.length); // [60, 70, 80, 90, 100]
        System.out.println(Arrays.toString(result2));

    }
}
