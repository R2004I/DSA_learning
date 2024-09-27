package Array.pepcoding_Array;

public class maximum_voting_element {

    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] frequencyArray(int[] arr){
        int[] freq = new int[arr.length];
        for(int i = 0; i<arr.length-1;i++){
            int count =1;
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;

                   }
                }
            if(freq[i]!=-1){
                freq[i]=count;
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,1,1,6,1,1};

    }
}
