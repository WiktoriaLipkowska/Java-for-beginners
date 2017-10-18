
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
Ovning 6
        6. Skapa ett program som "ritar" upp en kvadrat med den storlek som användaren önskar. 
       Så här kan en programkörning se ut:
        Ange sidstorlek på kvadraten:5
        [][][][][]
        [][][][][]
        [][][][][]
        [][][][][]
        [][][][][]

        Scanner input = new Scanner(System.in);
        System.out.print("size of cube: ");
        int size = input.nextInt();
                String symbol = "[]";
        
        for (int x = 0; x <= size-1; x++){
        for (int y = 1; y <=size-1; y++){
          System.out.print(symbol);
        }
          System.out.println(symbol);
        }
        }
        }
        
        