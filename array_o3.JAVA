
@Skapa ett program som låter användaren ange ett ord. Sedan skrivs ordet baklänges på *skärmen.

package veck4_o3_arr;

import java.util.Scanner;


public class Veck4_o3_arr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    String word = (" "); 
    System.out.print ("type a word:");
    word = input.nextLine();
    for (String part : word.split(" ")){
    System.out.println(new StringBuilder(part).reverse().toString());
    System.out.print(" ");}
    
    }
    
}
