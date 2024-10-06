package Array.leetcode;

public class maximum_product_subArray {

    static int maxSubArray(int[] arr){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            int mul = 1;
            for(int j = i; j<arr.length; j++){
                mul = mul *arr[j];
                    max=Math.max(max,mul);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int res = maxSubArray(arr);
        System.out.println(res);
    }
}
