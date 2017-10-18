
package input_output2;
import java.util.Scanner;
public class input_output2_1 {
    public static void main(String[] args) {
        System.out.println("Vad heter du?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hej " + name + " , roligt att du kommit hit.");
        
        System.out.println("Vad heter du i efternamn:");
        Scanner s2 = new Scanner(System.in);
        String name2 = s2.nextLine();
  
        System.out.println("Du borde skaffa ett gmail-konto som är " + name+"."+ name2 + "@gmail.com");
  
    }
    
    
}
