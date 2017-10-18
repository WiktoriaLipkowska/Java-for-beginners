

package veckan4.arrays_and_strings;
import java.util.Scanner;
/**
 *
 * @author wiktorialipkowska
 */
public class Veckan4Arrays_and_strings {
    public static void main(String[] args) {
        
        int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int [] d = new int [6]; //YYMMDD
        Boolean error = false; 
        System.out.print("Ange födelsedatum på former YYMMDD ");
        Scanner input = new Scanner(System.in);
        String tmp = input.nextLine();
        tmp = tmp.trim();//take away leading or after spaces
        if (tmp.length()!=6) error =true;
        else{
            for (int i=0; i<tmp.length(); i++){
                if(Character.isDigit(tmp.charAt(i))==false) error=true;
                else d[i] = (int)tmp.charAt(i)-48; //(numerisca syffror) something about programmingtrick to find out if this is the umber 
                
            }
         }
        if (!error){
            int year = d[0]*10+d[1];// year 83 = 8*10+3
            int mon = d[2]*10+d[3];// month  03 = 8*10+3
            int day = d[4]*10+d[5];//day 21 = 8*10+3
            if(year%4==0) days[1]=29;
            if(mon<1 || mon>12) error = true;
            else {
                if (day <1 || day>days[mon-1]) error=true;
            }
            if(!error) System.out.println("Du har angett ett korrekt födelsedatum");
            else System.out.println("Du har angett ett ogiltigt födelsedatum");
        }
        
    }
    
}
