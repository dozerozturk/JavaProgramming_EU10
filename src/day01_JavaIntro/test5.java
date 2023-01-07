package day01_JavaIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class test5 {

    public static void main(String[] args) {

//        method1();
//        method2("The sun set quickly and created a shadow");
        method3(50);


    }

    public static void method1(){

        int n= -5;
        for (int i = 1; i < 5; i++) {
            n *=i;

        }
        System.out.print(n);

    }

    public static void method2(String s){

        String a= s.substring(10);

        if (a.length()>s.length()){
            System.out.print(a);
        }else {
            System.out.print(s);
        }



    }

    public static String method3(int num){

        if (num<0){
            return "Less than 0";
        } else if (num <50) {
            return "Less than 50";
        } else if (num <100) {
            return "Less than 100";
        }else {
            return "other";
        }
    }



}
