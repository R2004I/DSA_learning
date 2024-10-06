package Array.leetcode;

public class maximum_subarray_divisible_K {

    static int maxSubArray(int[] arr, int m){
        int max = 1;
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = i; j<arr.length; j++){
               sum=sum+arr[j];
               if(sum%m==0){
                   max=Math.max(max,j-i+1);
               }
            }

        }
        return max;
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3};
       int k = 3;
       int res = maxSubArray(arr,k);
        System.out.println(res);
    }
}
