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

        for (int i = weight.length; i > 0; i--) {
            System.out.print(weight[2] + ", ");{
            }
            System.out.print(weight[1] + ", ");{
        }
            System.out.print(weight[0]);{
            }
            break;
        }
        System.out.println();


        for (int i = arr.length; i > 0; i--) {
            System.out.print(arr[2] + ", ");{
            }
            System.out.print(arr[1] + ", ");{
            }
            System.out.print(arr[0]);{
            }
            break;
        }
        System.out.println();


        for (int i = year.length; i > 0; i--) {
            System.out.print(year[7] + ", ");{
            }
            System.out.print(year[6] + ", ");{
            }
            System.out.print(year[5] + ", ");{
            }
            System.out.print(year[4] + ", ");{
            }
            System.out.print(year[3] + ", ");{
            }
            System.out.print(year[2] + ", ");{
            }
            System.out.print(year[1] + ", ");{
            }
            System.out.print(year[0]);{
            }
            break;
        }
        System.out.println();


        //Задание № 4














    }
}