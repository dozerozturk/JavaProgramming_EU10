package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodPractice4;

public class test_test {

    public static void main(String[] args) {

        String str = "aaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"; // remove duplicate

        str = ReturnMethodPractice4.removeDuplicates(str); // call one class to another

        System.out.println(str);


        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name); // call one class to another

        System.out.println(reversedName);

    }


}
