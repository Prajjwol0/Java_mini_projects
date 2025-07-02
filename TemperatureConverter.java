
// 2. Temperature Converter: Build an app that converts temperature units (celsius to Fahreneit and vice versa) and uses different data types and control statement

import java.util.Scanner;

public class TemperatureConverter {

    Scanner input = new Scanner(System.in);

    // Method to ask user
    void askUnit() {
        System.out.println("fahrenite or celsius? ");
        String unit = input.nextLine().trim().toLowerCase();

        if(unit.equals("celsius")){
            convertcelsiusToFahrenite();
        }
        else if (unit.equals("fahrenite")){
            convertFahreniteTocelsius();
        }
        else{
            System.out.println("Please Enter valid unit");
        }
    }
    void convertcelsiusToFahrenite(){
        System.out.println("Enter temperature in celsius:");
        double celsius = input.nextDouble();
double fahreneit = celsius*(9/5)+32;
System.out.println("Result:"+fahreneit); 
   }

// °C = (°F - 32) × 5/9
     void convertFahreniteTocelsius(){
        System.out.println("Enter temperature in Fahrenite:");
        double fahreneit = input.nextDouble();
double celsius = (fahreneit-32)*5/9;
  System.out.println("Result:"+celsius);
    }


    public static void main(String[] args) {
        TemperatureConverter convert=new TemperatureConverter();
        convert.askUnit();
        

    }

    
}
