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



ovning 7 Gör med hjälp av nästlade loopar en utskrift med 36 nummer som ska se ut så här:
            00 01 02 03 04 05
            10 11 12 13 14 15
            20 21 22 23 24 25
            30 31 32 33 34 35
            40 41 42 43 44 45
            50 51 52 53 54 55

            for (int z=0; z<=5; z++){
        System.out.print("0" + z+" ");
        }
        
        System.out.println("");
        
        for(int x=10; x<=55; x=x+10) {
        for(int y=0; y<=5; y++) {
        System.out.print(y+x+" ");}
    
    System.out.println("");
    }
    }
    }
