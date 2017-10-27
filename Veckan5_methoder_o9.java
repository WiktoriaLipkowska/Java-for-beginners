/*
 9. Skapa en funktion som beräknar kostnaden för en hotellgäst.
Funktionen har argumenten days och price, där price har ett 
default-värde på 600kr (d.v.s. om inget pris anges så beräknas 
hotellkostande utifrån rumspriset 600).
 */
package veckan5_o9_methoder;

import java.util.Scanner;

/**
 *
 * @author wiktorialipkowska
 */
public class Veckan5_o9_methoder {
    public static void hotel(int days, double price ){
        System.out.println("How many night?");
        Scanner input = new Scanner(System.in);
        int numberNights = input.nextInt();
        
        System.out.println("Use default price for one night stay? Y? N?");
        Scanner input2 = new Scanner(System.in);
        String priceDefault = input2.nextLine();
        
        if (!"N".equals(priceDefault) && !"n".equals(priceDefault)){
        double result = numberNights*600;
        System.out.println("Cost of your stay is: " + result);}
        
        else {
        System.out.println("Please provide a price for one night.");
        Scanner input3 = new Scanner(System.in);
        double priceToPay = input3.nextDouble();
        double result2 = numberNights*priceToPay;
        System.out.println("Cost of your stay is: " + result2);}
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        hotel(1,1);
        
        
        
    }
    
}