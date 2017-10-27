/*
 * 6. Skapa en funktion med namnet half som returnerar hälften
av det värde som skickas till funktionen som argument. 
Skapa funktion en och se till att den kan ta emot värden 
av datatypen double.To change this license header, 
choose License Headers in Project Properties.
 */
package veckan5_o6_methoder;
import java.util.Scanner;
/**
 *
 * @author wiktorialipkowska
 */
public class Veckan5_o6_methoder {

   public static void half(){
    System.out.println("Enter a number :");
        
    Scanner input = new Scanner(System.in);
    double price = input.nextDouble();
    //String total = Double.toString(price);
    double x = price / 2;
    System.out.println(x);
    }
   
    public static void main(String[] args) {
    half();
     
    }
    
    
}

