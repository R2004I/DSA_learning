package Array.leetcode;

public class Buy_Sell_stocks {

    static int maxProfit(int[] arr){
        int max = 0;
        if(arr.length==0){
            return 0;
        }
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = i+1;j<arr.length; j++){
                int profit = arr[j]-arr[i];
                if(profit<0){
                    return 0;
                }
                 max = Math.max(max,profit);
            }
        }
        return max;
    }


    public static void main(String[] args) {

    }
}
