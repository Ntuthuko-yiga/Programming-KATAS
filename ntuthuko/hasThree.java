package ntuthuko;

import java.util.Scanner;

public class hasThree {
    public static void main(String[] args) {
    Three();

    }

    static void Three () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = in.nextInt();

        if (num1 == 3 || num2 == 3 ) {
         int  ans =  num1 + num2;
            System.out.println("Your answer is: "+ ans);
        }
        else {
            System.out.println("Enter a number with 3");
        }
    }
}
