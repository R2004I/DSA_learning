package Array.pepcoding_Array;

public class container_most_water {

    static int mostWater(int[] arr){
        int water = 0;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int width = j-i;
            int height = Math.min(arr[i],arr[j]);

            int volume = width*height;
            water = Math.max(water,volume);

            if(arr[i]<arr[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
      int r =  mostWater(arr);
        System.out.println(r);
    }
}
