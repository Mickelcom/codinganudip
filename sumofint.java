 /* WAP to find sum of 10 integers and print the sum with a proper SOP statement.
using for loop */
 
 import java.util.Scanner;
 class Sumofint {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("insert the 10 integers:");

        for (int i = 1; i <= 10; i++)
         {
            System.out.print("Enter integer " + i + "= ");
            
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println("sum of 10 integers is: " + sum);
    }
}
