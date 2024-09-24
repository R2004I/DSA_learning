package normal_math;

import java.util.Scanner;

public class factorial_tariling_zero {

    static void factorial(int num){
        int fact = 1;
        for(int i = num; i>1; i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }

    static void trailing_zero(int num)
    {
        int count = 0;
        for(int i = 5;i<=num; i=i*5){
           count = count+num/i;
        }
        System.out.print("Number of zeroes: "+count);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = sc.nextInt();
        //factorial(x);
        trailing_zero(x);
    }

}
