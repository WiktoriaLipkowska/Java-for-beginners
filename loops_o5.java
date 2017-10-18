package veckan3loops;
import java.util.Scanner;
import java.util.Random;


public class Veckan3loops_O2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         TODO code application logic here

Ovning 5
        Scanner s = new Scanner(System.in);
        System.out.print("Ange med en siffra vilken multiplikations tabell du vill se, eller tryck 0 för att avsluta ");
        
        int num1 = s.nextInt();
        if (num1==0){
        }
        else {
        for (int i=1; i<11; i++){ 
        System.out.println (i + " x " + num1 + " = " + i*num1);
        }
        }
       
        