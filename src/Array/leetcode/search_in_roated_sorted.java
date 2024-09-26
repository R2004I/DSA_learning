package Array.leetcode;

public class search_in_roated_sorted {

    static int searching(int[] arr, int target)
    {
        int st = 0;
        int end = arr.length-1;
        while(st<=end)
        {
            int mid = (st+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(arr[st]<=arr[mid]){
                if(arr[st]<=target && target<=arr[mid]){
                    end = mid-1;
                }
                else {
                    st = mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[end]){
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int r = 0;
        int res = searching(arr,r);
        System.out.println(res);

    }
}
