/*
 * 4. Skapa ett program där användaren kan mata in dagar, timmar, 
minuter och sekunder och få redan på hur många sekunder detta motsvarar. 
Skapa funktionen/metoden "sekunder" som gör omvandlingen.
 */
package veck5o4;

import java.util.Scanner;

/**
 *
 * @author wiktorialipkowska
 */
public class Veck5O4 {

    public static void simpleMessage(int days, int hours, int minutes, int seconds ){
    int total = days*86400 + hours*3600 + minutes*60 + seconds;
    	System.out.println("Total sum of seconds in your data is " + total);
    }

    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        //tuna tunaObject = new tuna();
        
        System.out.println("Enter days:");
        int days = input.nextInt();
        System.out.println("Enter hours: ");
        int hours = input.nextInt();
        System.out.println("Enter minutes: ");
        int minutes = input.nextInt();
        System.out.println("Enter seconds: ");
        int seconds = input.nextInt();
        simpleMessage(days,hours,minutes,seconds);

    }
}
   