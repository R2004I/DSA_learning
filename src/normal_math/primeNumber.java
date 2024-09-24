package normal_math;

import java.util.Arrays;
import java.util.Scanner;

public class primeNumber {

    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static boolean[] is_prime(int num){

        boolean[] primeArray = new boolean[num+1];
        Arrays.fill(primeArray, true);
        primeArray[0]=false;
        primeArray[1] = false;

        for(int i = 2; i*i<=num; i++){
            for(int j = 2*i; j<=num; j+=i){
                primeArray[j] = false;
            }
        }
        return primeArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your range");
        int x = sc.nextInt();
        boolean[] resultArray = is_prime(x);
        for(int i = 0; i<x; i++)
        {
            System.out.println(i+" :"+resultArray[i]);
        }
    }
}
