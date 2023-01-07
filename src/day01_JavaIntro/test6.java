package day01_JavaIntro;

import java.util.Scanner;

public class test6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        //keep dividing a number by 2 until its 0
        //5/2=2, 2/2=1, 1/2=0

        int day = 0;

        while (inhabitants>0){
            //10/2=5
            //Day 0 [6]

            System.out.println("Day "+ day+" ["+inhabitants+"]");
            inhabitants = inhabitants/2;
//            System.out.println(inhabitants);
            day++;
        }
        System.out.println("----EXTINCT----");
    }
}


