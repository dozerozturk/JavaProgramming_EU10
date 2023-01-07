package day20_Arrays;

import java.util.Arrays; //type import java.util.Arrays

public class Practice_ArraysUtility {
    public static void main(String[] args) {

        //toString(): converts array object to string, returns String
        String[] names= {"John", "Smith", "Shay", "Breanna", "Josh"};
        System.out.println(Arrays.toString(names)); //[5, 1, 3, 4, 2, 0]

        //sort(): sorts the array in ascending order
        int[] numbers = {5,1,3,4,2,0};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //[0, 1, 2, 3, 4, 5]

        //equal(): compares two array objects if they have same elements in same order,returns boolean
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'b', 'a', 'c'};

        System.out.println(arr1 == arr2); //false
        System.out.println(Arrays.equals(arr1, arr2)); //false

        Arrays.sort(arr1); //{'a', 'b', 'c'}
        Arrays.sort(arr2); //{'a', 'b', 'c'}
        System.out.println(Arrays.equals(arr1,arr2)); //true


        //copyOf(array, newLength): copies the specified array elements and sets new length, returns new array
        int[] scores = {45, 55, 65, 75, 85};
        int[] scores2 = Arrays.copyOf(scores,8);
        System.out.println(Arrays.toString(scores2)); //[45, 55, 65, 75, 85, 0, 0, 0]


        //copyOfRange(array,begIndex,endIndex): copies the specified range of the array, returns new array
        char[] elements = {'A', 'B', 'C', 'D', 'E','F'};
//        index             0    1    2    3    4   5

        char[] someElements = Arrays.copyOfRange(elements, 1,4);

        System.out.println(Arrays.toString(someElements));





    }
}
/*
Arrays Class: presented in "java.util" package

    methods:
        toString()
        sort()
        equals()
        copyOf()
        copyOfRange()

 */