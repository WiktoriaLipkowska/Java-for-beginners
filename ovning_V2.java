
package ovning.veckan.pkg2;
import java.util.Scanner;
public class OvningVeckan2 {

     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ange ett år mellan 1950-2050: "); 
        int year = input.nextInt();
        if (year<1950 || year>2050){
            System.out.println("Du verkar ha svårt att följa instruktioner");
        }
        else if((year % 4)==0){
            System.out.println("Olympiska spel");
        }
        else if ((year % 4)==2) {
                System.out.println("Fotbolls-VM");
        }
        else {System.out.println("Ingenting särskilt detta år");}
        
        
        
     }
    }  