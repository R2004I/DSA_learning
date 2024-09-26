package Array.pepcoding_Array;

import java.util.Scanner;

public class ceil_floor {

    static void find_ceil_floor(int num, int[] arr)
    {
        int low = 0;
        int high = arr.length-1;
        int ceil = 0;
        int floor = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(num<arr[mid])
            {
                high = mid - 1;
                ceil = arr[mid];
            }
            else if(num>arr[mid])
            {
                 low = mid+1;
                 floor = arr[mid];
            }
            else {
                 ceil = floor = arr[mid];
                 break;
            }

        }

        System.out.println("Ceil is: "+ceil);
        System.out.println("floor is: "+floor);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int  x= sc.nextInt();
        System.out.println("Enter the number for which you want to get ceil and flor");
        int num = sc.nextInt();
        int[] arr = new int[x];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        find_ceil_floor(num,arr);
    }
}
