package Array.leetcode;

public class PairSum_in_RoatedArray {

    static int max(int[] arr){
        int max = 0;
        for(int i =0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                max=i;
            }
        }
        return max;
    }

    static boolean isExist(int[] arr, int n)
    {
        int r = max(arr);
        int l = max(arr)+1;

        while (l!= r){
            int sum = arr[l]+arr[r];
            if(sum==n) return true;
            r =(arr.length+ r -1)%arr.length;
        }
        return false;
    }
    public static void main(String[] args) {
      int[] arr = {11, 15, 6, 8, 9, 10};
      int x = 16;
      boolean res = isExist(arr,x);
      int res2 = max(arr);
        System.out.println(res2);
        System.out.println(res);
    }
}
