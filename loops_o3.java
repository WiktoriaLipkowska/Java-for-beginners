
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
        
        Ovning 3
        int answer;
        System.out.println("Betygsätt denna kurs med en siffra mellan 1-5");
        Scanner input = new Scanner(System.in);
        do{System.out.println("Vilket betyg ger du denna kurs: ");
           answer = input.nextInt();
           System.out.println("Du måste tryckt fel, försök igen");
        } 
         while(answer!=5);{
            System.out.print("Tack! Ditt omdöme om denna kurs har registrerats");
            }
            }
        
        