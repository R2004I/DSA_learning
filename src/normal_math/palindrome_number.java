package normal_math;

import java.util.Scanner;

public class palindrome_number {

    static void check_palindrome(int num)
    {
        int reverseNumber = 0;
        int originalNumber = num;
        while(num>0){
            int res = num%10;
            reverseNumber = reverseNumber*10+res;
            num = num/10;
           // System.out.println(reverseNumber);
        }
        System.out.println(reverseNumber);
        if(originalNumber==reverseNumber){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = sc.nextInt();
         check_palindrome(x);
    }
}
