package veckan3loops;
import java.util.Scanner;
import java.util.Random;


public class Veckan3loops_O2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
int svar;
          Random rand = new Random();
            int randomNum = rand.nextInt(10) + 1;
            int randomNum2 = rand.nextInt(10) + 1;        
        Scanner input = new Scanner(System.in);
        System.out.println("*****************");
        System.out.println("* MATTE-TRÄNING *");
        System.out.println("*****************");
        System.out.println("Ange 0 för att avsluta");
        
        do {
            int randomNum3 =rand.nextInt(10)+1;
            int randomNum4 =rand.nextInt(10)+1;
            
            System.out.println("Ditt tärningskast blev " + (randomNum+randomNum3) + " + " + randomNum2 + " =");
            svar = input.nextInt();
            
            if(svar == 0){
            System.out.println();
        }
       
            else if (svar == (randomNum + randomNum3 +randomNum2)){
            System.out.println("Rat");}
            
            else if (svar != (randomNum) +(randomNum2) || svar!=0)
                    {System.out.println("Fel, försök igen.");
        }
        }
        
        while (svar != 0); 
   {System.out.println("Hej då!");}
        
       
        
        }}
        
