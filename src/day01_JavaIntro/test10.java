package day01_JavaIntro;

import java.util.ArrayList;

public class test10 {

        public static void main(String[] args) {

            ArrayList<Integer> nums = new ArrayList<>();

            nums.add(4); //0
            nums.remove(nums.size()-1); //0
            nums.add(2); //0
            nums.add(10); //0
            nums.add(0,6); //0
            nums.remove(1); //0
            nums.add(-7); //0
            nums.add(2,2);

            System.out.println(nums);


        }
}
