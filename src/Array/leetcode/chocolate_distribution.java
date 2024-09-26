package Array.leetcode;

import java.util.Arrays;

public class chocolate_distribution {

    static  int find_minimum_difference(int[] arr, int m){
        if(arr.length==0 || m==0){
            return 0;
        }
        Arrays.sort(arr);
        if(arr.length-1<m)
        {
            return -1;
        }
        int min_diff = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            int next = i+m-1;
            if(next>= arr.length){
                break;
            }
            int diff = arr[next]-arr[i];
            min_diff = Math.min(min_diff,diff);
        }
        return min_diff;
    }

    public static void main(String[] args) {
        int[] arr = {7,3,2,4,9,12,56};
        int m = 3;
       int res = find_minimum_difference(arr,m);
        System.out.println(res);
    }
}
