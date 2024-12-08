import java.util.*;

public class TemperatureConverter {
// Convert Fahrenheit to Celcius
    public static double celciusToFahrenheit(double tempVal) {
        return (tempVal * 9/5) + 32;
    }
    
    // Convert Celcius to Fahrenheit
    public static double fahrenheitToCelcius(double tempVal) {
        return (tempVal - 32) * 5/9;
    }
    
    //Convert temperature 
    public static void convertTemperature(){
        //Create userInput scanner
        Scanner userInput = new Scanner(System.in);
        
        //Store the scale and input value
        int scale;
        double tempVal;
        
        //Prompt user on the type of conversion
        System.out.println("To convert from Celcius to Fahrenheit press 1\nTo convert from Fahrenheit to Celcius press 2");
        scale = userInput.nextInt();
        
        if(scale == 1) {
            // 1 as scale input
           System.out.println("Convert Celsius to Fahrenheit...");
           System.out.println("Enter temperture value" + " (" + "-273.15" + "\u00B0" + "C" + " - " + "100.0" + "\u00B0" + "C" + ")");
           tempVal = userInput.nextDouble();
           
           //Check whether the temperature value entered is in the range -273.15 - 100
           if(tempVal < -273.15 || tempVal > 100){
               System.out.println("Warning: Enter temperature range from -273.15" + "\u00B0" + "C" + " - " + "100.0" + "\u00B0" + "C");
           }  else {
                    System.out.println("The temperature from Celcius to Fahrenheit is " + celciusToFahrenheit(tempVal) + "\u00B0" + "F");
           }
        } 
        else if(scale == 2) {
            // 2 as scale input
            System.out.println("Convert Fahrenheit to Celsius...");
            System.out.println("Enter temperture value" + " (" + "-459.67" + "\u00B0" + "F" + " - " + "212,0" + "\u00B0" + "F" + ")");
            tempVal = userInput.nextDouble();
            
            //Check whether the temperature value entered is in the range -459.67 - 212
            if(tempVal < -459.67 | tempVal > 212){
                System.out.println("Warning: Enter temperature range from -459.67" + "\u00B0" + "F" + " - " + "212.0" + "\u00B0" + "F");
            } else {
                System.out.println("The temperature from Fahrenheit to Celcius is " + fahrenheitToCelcius(tempVal) + "\u00B0" + "C");
            }
        } 
        else {
            //When the scale integer is neither 1 nor 2
            System.out.println("Scale input is invalid");
        }
        userInput.close();
    }
    
    public static void main(String[] args) {
        convertTemperature();
    }
}