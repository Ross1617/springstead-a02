/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 18
 *  Copyright 2021 Ross Springstead
 */

/*
    import scanner
    ask the user to enter a c or f and keep prompting them until they enter f or c
    if they enter f then ask the user to input a number in Celsius
        then call the function that uses the number they entered and converts into F
    else ask them to enter a number in Fahrenheit
        then call the function that uses the number they entered and converts it into Celsius
    take the number that was converted and print it out

 */
import java.util.Scanner;
public class Solution18 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
    private String scale ;
    private int temperature;
    private int value;
    private int switchFtoC(int temperature){
        return ((temperature - 32 ) * 5 / 9);
    }
    private int switchCtoF(int temperature){
        return ((temperature * 9 / 5 ) + 32);
    }
    private String finalOutput;
    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        int holder = 0;
        while( holder == 0){
            sol.scale = sol.readInput("Enter F or C (F converts C->F and C converts F->C)");
            if( sol.scale.equals("c")){
                sol.value = 1;
                break;
            }
            else if (sol.scale.equals("C")){
                sol.value = 1;
                break;
            }
            else if (sol.scale.equals("F")){
                sol.value = 2;
                break;
            }
            else if(sol.scale.equals("f")){
                sol.value = 2;
                break;
            }

        }
        if (sol.value == 1){
            sol.temperature = Integer.valueOf(sol.readInput("Please enter the temperature in Fahrenheit:"));
            sol.finalOutput = "The temperature in Celsius is " + sol.switchFtoC(sol.temperature);
        }
        else{
            sol.temperature = Integer.valueOf(sol.readInput("Please enter the temperature in Celsius:"));
            sol.finalOutput = "The temperature in Fahrenheit is " + sol.switchCtoF(sol.temperature);
        }
        System.out.printf(sol.finalOutput);



    }
}
