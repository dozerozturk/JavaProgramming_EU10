package day01_JavaIntro;

public class HW_Shape {
    /*         1.                       2.                       3.                     4.
     * * * * * * *               *                        1                     1
     * * * * * * *               * *                      1 2                   2 2
     * * * * * * *     ===>      * * *            ==>     1 2 3           ==>   3 3 3
     * * * * * * *               * * * *                  1 2 3 4               4 4 4 4
     * * * * * * *               * * * * *                1 2 3 4 5             5 5 5 5 5
     * * * * * * *               * * * * * *              1 2 3 4 5 6           6 6 6 6 6 6
     * * * * * * *               * * * * * * *            1 2 3 4 5 6 7         7 7 7 7 7 7 7
     */

    public static void main(String[] args) {
        // 1. SHAPE
//        for (int i = 1; i<=7; i++){
//            for (int j = 1; j<=7; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // 2. SHAPE
//        for (int i = 1; i<=7; i++){
//            for (int j = 1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // 3. SHAPE
        for (int i = 1; i<=7; i++){
            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
//        // 4. SHAPE
//        for (int i = 1; i<=7; i++){
//            for (int j = 1; j<=i; j++) {
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }

//        * * * * * * *
//          * * * * * *
//            * * * * *
//              * * * *
//                * * *
//                  * *
//                    *
//
//
//        for (int i = 1; i <= 7; i++) {
//            for (int k = 1; k < i; k++) {
//                System.out.print("  ");
//            }
//            for (int k = 7; k >= i; k--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


    }

}
