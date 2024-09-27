package Array.pepcoding_Array;

import java.util.Arrays;
import java.util.Scanner;

public class range_addition {


    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static int[] rangeAddition(int[][] arr, int n)
    {
        int[] result = new int[n];
        Arrays.fill(result,0);
        for(int i = 0; i<arr.length; i++){
            int fi = arr[i][0];
            int li = arr[i][1];
            int incr = arr[i][2];
            for(int j = fi; j<=li; j++){
                result[j]=result[j]+incr;
            }
        }
        return result;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n =  sc.nextInt();
        System.out.println("Enter the number of query");
        int q = sc.nextInt();
        int[][] arr = new int[q][3];
        for(int i = 0; i<q; i++){
            for(int j = 0; j<3; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[] result = rangeAddition(arr,n);
        printArray(result);
    }
}
