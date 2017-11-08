/*
 I denna uppgift ska du skapa en klass med namnet Bil.

Till ett Bil-objekt ska du kunna ange en årsmodell med set-metod och 
hämta fram årsmodellen med en get-metod. Bilen ska ha dess två tillstånd 
"Bilen kör" och "Bilen står stilla", som man kan avläsa med metoden status().
Initialt har bilen tillståndet "står stilla" men det ändras om man anropar
metoden start(). Man kan stanna bilen med metoden stop() och då ändras 
givetvis status till "står stilla".
 */
package veckan6_lam_klass;
/**
 *
 * @author wiktorialipkowska
 */

class Bil{
     private String model = "n/a";
     private int year = 0;
     private int n = 0;
     private String nStatus= "";
     
     public void set_arsmodel (String strname){//set model from user input
     if (strname.length()>0)
         model = strname;
     }
     
     public String get_arsmodel(){ //check if model is stringand return the model
     return model;
     }
     
     public void setYear(int nYear ){//set year from user input
     if (nYear>0)
         year = nYear;
             }        
     public int getYear(){//return year to print
     return year;
     }
     
     public void start(){//run start and set variable n=1 to be checked in status()
         int n1 =1;
     n=n1;
     }
     
     public void stop(){//run start and set variable n=0 to be checked in status()
         int n2 =0;
     n=n2;
     }
     
     public String status(){//check var n and show status
         if (n==1) 
             nStatus = "Bilen kör";
         else
             nStatus = "Bilen står stilla";
     return nStatus;
     }
}

public class Veckan6_lam_klass {
    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Bil fiat = new Bil();
        fiat.setYear(2017);
        System.out.println("Har nu skaffat mig en bil av " + fiat.getYear() + " års modell");
        System.out.println(fiat.status());
        System.out.println("Försöker starta bilen");
        fiat.start();
        System.out.println("Måste kolla om du kom igång... " + fiat.status());
        System.out.println("Försöker få stopp på bilen");
        fiat.stop();
        System.out.println("Ska se om jag lyckades stanna den också... " + fiat.status());
       }
}
