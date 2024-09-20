package Array;

import java.util.Scanner;

public class subset_array {

    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void sub_set_array(int[] arr){
        int max = (int)Math.pow(2,arr.length);
        for(int i = 0; i<max; i++){
            String set = "";
            int temp = i;
            for(int j = arr.length-1;j>=0;j--){
                int r = temp%2;
                temp=temp/2;

                if(r==0){
                    set = "-\t" + set;
                }
                else{
                    set = arr[j]+"\t"+set;
                }
            }
            System.out.println(set);
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
        sub_set_array(arr);

    }
}
