package Array.pepcoding_Array;

import java.util.Scanner;

public class last_first_index {


    static  void first_and_last(int[] arr, int num){
        int low = 0;
        int high = arr.length-1;
        int lastIdx = 0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(num<arr[mid]){
                high = mid-1;
            }
            else if(num>arr[mid]){
                low = mid+1;
            }
            else{
                lastIdx=mid;
                low=mid+1;
            }
        }
        System.out.println("last index of "+num+" is: "+lastIdx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int  x= sc.nextInt();
        System.out.println("Enter the number for which you want to search first and last index");
        int num = sc.nextInt();
        int[] arr = new int[x];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        first_and_last(arr,num);
    }
}
