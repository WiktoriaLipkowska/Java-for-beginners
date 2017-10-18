
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
Ovning 4
        Scanner s = new Scanner(System.in);
        System.out.print("Vilken multiplikationstabell vill du se? ");
        int num1 = s.nextInt();
        for (int i=1; i<11; i++) {  
        System.out.println (i + " x " + num1 + " = " + i*num1);
                }
        
        