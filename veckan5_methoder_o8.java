/*
 8. Skapa funktion biggest som tar emot tre heltalsvärden 
som argument och returnerar det största av dem.
 */
package veckan5_o8_methoder;
/**
 *
 * @author wiktorialipkowska
 */
public class Veckan5_o8_methoder {

    public static double max(double n, double b, double a) {
    
    double biggest;
    biggest = Math.max( a, b );
    biggest = Math.max( biggest, n );
    System.out.println(biggest);
        return biggest;
    }
        
    
    public static void main(String[] args) {
        max(1,2,3);
     
    }
    
}
