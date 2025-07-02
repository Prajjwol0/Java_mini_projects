
// 1. Basic Calculator App: Create a console-based calculator app that takes inputs, performs calculatiopns, and displays results.



// Import util.Scanner for input
/* import java.util.Scanner;

public class BasicCalculatorApp {

    // double results;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking first number:
        System.out.println("Enter First number: ");
        int num1 = input.nextInt();
        // Taking second number:
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        // This is to close the line : nextInt paxadi nextLine use garna ko lagi:
        input.nextLine();

        // Taking operator from user:
        System.out.println("Enter Operator:");
        String op = input.nextLine();

        // Checking the operator (If it is: + , - , * , /)

        // Multiply
        if (op.equals("*")) {
            System.out.println("Result: " + (num1 * num2));
        }

        // Divide
        else if (op.equals("/")) {
            if (num2 == 0) {
                System.out.println("You cannot divide a number by zero");
            } else {
                System.out.println("Result: " + (num1 / num2));
            }
        }

        // Add
        else if (op.equals("+")) {
            System.out.println("Result: " + (num1 + num2));
        }

        // Subtract
        else if (op.equals("+")) {
            System.out.println("Result: " + (num1 - num2));
        }

        input.close();
    }
} */

// Now rewriting above code using methods:

import java.util.Scanner;

public class BasicCalculatorApp {


    Scanner input  = new Scanner(System.in);
        
       // Method to Taking an operator from user:
          String giveOperator(){ 
               System.out.print("Enter operator: ");
            String operator=input.nextLine();
            return operator;
        }

        // Method to take First number from user:
        double giveNumbersFirst(){
System.out.println("Enter First Number");
double firstNum=input.nextInt();
return firstNum;
        }

        // Method to take Second number from user:

        double giveNumbersSecond(){
            System.out.println("Enter second Number");
double secondNum=input.nextInt();
return secondNum;

        }

        
// Main method
public static void main(String[] args) {
BasicCalculatorApp calc=new BasicCalculatorApp();

// For operator:
String op=calc.giveOperator();

// For operands:
double num1=calc.giveNumbersFirst();
double num2=calc.giveNumbersSecond();

if(op.equals("*")){
System.out.println("Result: "+(num1*num2) );
}
else if(op.equals("+")){
System.out.println("Result: "+(num1+num2) );
}
else if(op.equals("-")){
System.out.println("Result: "+(num1-num2) );
}
else if(op.equals("/")){
if(num2==0){
    System.out.println("Please Enter valid number");
}else{
    System.out.println("Result: "+(num1/num2) );
}
}

}
        

    }
