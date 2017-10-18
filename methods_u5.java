/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package veckan5;

/**
 *
 * @author wiktorialipkowska
 */
import java.util.Scanner;
public class Veckan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();
        
        
        String[] alphabets = word.split("");
        for(String alphabet : alphabets)
        {
        System.out.print("*"+alphabet);
        
        
        }
        System.out.print("*");
        System.out.println("");
        //String foo = "abcdefz";
        String krypterad = "";

        for (char c : word.toCharArray()) {
        krypterad += Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
        }

        System.out.println(word + " krypterat blir " + krypterad);
        }
    
}
