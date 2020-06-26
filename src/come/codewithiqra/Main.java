package come.codewithiqra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int first[][] = new int[3][3];
        int second[][] = new int[3][3];
        int sum[][]= new int[3][3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter values of first 3 by 3 matrix:");
       for (int i = 0 ; i < 3; i++){

           for (int j = 0; j <3; j++){
               first[i][j] = input.nextInt();
           }
       }
        System.out.println("Enter values of second 3 by 3 matrix: ");
       for (int i =0; i < 3; i++){
           for (int j=0; j < 3; j++){
               second[i][j] = input.nextInt();
           }
       }

       //Addition:
        for (int i =0; i < 3; i++){
            for (int j=0; j < 3; j++){
                sum[i][j]= first[i][j] + second[i][j];
            }
        }

        //Display:
        System.out.println("Sum of two Matrix:");
        for (int i=0; i < 3; i++ ){
            for (int j=0; j < 3; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
