package Array.pepcoding_Array;

import java.util.Arrays;

public class square_sorting {

    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void squareArray(int[] arr){ // time complexity is O[nlonn]
        for(int i = 0; i<arr.length; i++)
        {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
    }

    static int[] squareArrayModified(int[] arr){
        int i = 0;
        int j = arr.length-1;
        int[] res = new int[arr.length];
        int idx = arr.length-1;

        while(i<=j)
        {
            int val1 = arr[i]*arr[i];
            int val2 = arr[j]*arr[j];

            if(val1<val2){
                res[idx]=val2;
                j--;
            }
            else{
                res[idx]=val1;
                i++;
            }
            idx--;
        }
        return res;
    }



    public static void main(String[] args) {
        int[] arr = {-4,0,1,3,10};
       int[] res = squareArrayModified(arr);
        printArray(res);
    }
}
