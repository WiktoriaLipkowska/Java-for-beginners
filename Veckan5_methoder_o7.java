/*
 * 7. Skapa en funktion med namnet cube som tar emot ett heltalsvärde som
argument och som returnerar kubiken som ett heltalsvärde.
 */
package veckan5_o7_methoder;

import java.util.Scanner;

/**
 *
 * @author wiktorialipkowska
 */
public class Veckan5_o7_methoder {

    public static void cube(int number){
    int result = (int)Math.pow(number, 3);
     
    System.out.println("The result is: " + result);
    }
   
    public static void main(String[] args) {
    System.out.println("Please give me the number that you want to see cube from:");
    Scanner input = new Scanner(System.in);
    int number1 = input.nextInt();
        cube(number1);
     
    }
    
}
