package Array;

import java.util.Scanner;

public class subarray {

   static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void subArray(int[] arr){
       for(int i = 0; i<arr.length; i++){
           for(int j = i; j<arr.length; j++){
               for(int k = i; k<j; k++){
                   System.out.print(arr[k]+"\t");
               }
               System.out.println();
           }
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int  x= sc.nextInt();
        int[] arr = new int[x];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        subArray(arr);
    }
}
