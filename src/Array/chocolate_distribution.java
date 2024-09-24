package Array;

import java.util.Arrays;

public class chocolate_distribution {

    static  int find_minimum_difference(int[] arr, int m){
        Arrays.sort(arr);
        int min_diff = 0;
        int i = 0;
        while((i+m)-1<=arr.length)
        {
            if(min_diff<(arr[(i+m)-1]-arr[i]))
              min_diff= arr[(i+m)-1]-arr[i];
            i++;
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
