import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Задание № 1

        int[] weight = new int[]{-1, 2, 3};

        double[] arr = {-1.57, 7.654, 9.986};

        int[] year = {21, 45, 12, 98, 121, 37, 99, 1001};


        //Задание № 2

        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.print(weight[i]);
            } else {
                System.out.print(weight[i] + ", ");
            }
        }
        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
                System.out.print("\n");


        for (int i = 0; i < year.length; i++) {
            if (i == year.length - 1) {
                System.out.print(year[i]);
            } else {
                System.out.print(year[i] + ", ");
            }
        }

                System.out.print("\n");


        //Задание № 3

        for (int i = weight.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weight[i] + ", ");
            } else {
                System.out.print(weight[i]);
            }
        }

        System.out.println();


        for (int i = arr.length - 1; i >= 0; i--) {
                if (i != 0) {
                System.out.print(arr[i] + ", ");
                } else {
                System.out.print(arr[i]);
            }
        }

        System.out.println();


            for (int i = year.length - 1; i >= 0; i--) {
                if (i != 0) {
                    System.out.print(year[i] + ", ");
                } else {
                    System.out.print(year[i]);
                }
            }


        System.out.println();



        //Задание № 4

        for (int i = 0; i < weight.length; i++) {

            if ((weight[i] % 2) != 0) {
                System.out.print(weight[i] + 1);
            } else
                System.out.print(weight[i]);
            if ( i != weight.length - 1){
                System.out.print(", " );
            }
        }



    }
}