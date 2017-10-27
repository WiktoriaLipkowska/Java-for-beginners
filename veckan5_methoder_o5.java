/*
 * 5. Skapa funktionen/metoden moms som räknar ut momsen på ett pris. 
Denna funktion/metod ska ha två argument, 
procent och pris där procent har default-värdet 25.
 */


package veckan5_methoder_o5;

import java.util.Scanner;

public class Veckan5_methoder_o5 {

public static void calculate(double price, double VAT){
double netto = (price*(1-VAT))*100.00/100.00;
double moms = (price - netto)*1.00;
System.out.println("Price without VAT is: " + netto);
System.out.println("VAT is: " + moms);
}

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		//VAT_M VAT_MObject = new VAT_M();
        
        System.out.println("Enter price:");
        double price = input.nextDouble();
        double VAT = 0.25;
        calculate(price,VAT);
        
	}

}