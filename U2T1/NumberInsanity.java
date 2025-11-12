package U2T1;

import java.util.Scanner;

public class NumberInsanity {

   public NumberInsanity() { }

   public void go() {
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int num = myScanner.nextInt();
       String msg = result(num); // call helper method and store result 
       System.out.println(msg);
   }

   // helper method that returns string containing message to be printed
   private String result(int num) {
       // complete the code for this method;
       // make no other changes to the program
       boolean div5 = (num % 5 == 0);
       boolean div7 = (num % 7 == 0);
       String result = "";
       if (num <= 0) {
        result = "That isn't positive!";
       }
       else {
        if (num % 2 == 0) {
            if (num >= 100) {
                result = "Big even number!";
            }
            else if (num >= 50) {
                result = "Medium even number!";
            }
            else {
                result = "Small even number!";
            }
        }
        else {
            if (div5 || div7) {
                if (div5 && div7) {
                    result = "Divisible by 5 and 7!";
                }
                else if (div5) {
                    result = "Divisible by 5";
                }
                else if (div7)
                    result = "Divisible by 7!";
                }
            else {
                result = "Not divisible by 5 or 7";
            }
            }
        }
        return result;
    }
}