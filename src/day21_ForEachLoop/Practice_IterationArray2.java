package day21_ForEachLoop;

public class Practice_IterationArray2 {
    public static void main(String[] args) {

        String [] fruits = {"Orange", "Banana", "Apple", "Strawberry", "Lemon", "Grape"};
//        indexes:              0         1         2           3           4       5

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
            
        }

        System.out.println("--------------------------------------");

        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }



    }
}
