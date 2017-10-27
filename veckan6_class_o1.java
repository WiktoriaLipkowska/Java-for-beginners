/*
 1. Skapa klassen Katt. I denna klass ska det vara möjligt att ange kattens
namn och ålder med setmetod och få fram dessa med get-metod. Du ska också 
lägg till en mjau-metod som gör att katten säger "mjau" (fast i text).
 */
package veckan6_o3_sortering;

import java.util.Random;

/**
 *
 * @author wiktorialipkowska
 */
class Katt{
     private String name = "n/a";
     private int age = 0;
     public void set_name (String strname){
     if (strname.length()>0)
         name = strname;
     }
     public String get_name(){
     return name;
     }
     public void set_age (int nAge ){
     if (nAge>0)
         age = nAge;
             }        
     public int get_age(){
     return age;
     }
     
     public void mjau(){
         Random rand = new Random();
         int response = rand.nextInt(2)+1;
         if (response==1 || age>2) 
             System.out.println(name + " sager: 'mjau'");
         else
             System.out.println(name + " kunna inte saga: 'mjau'");
     }}
public class Veckan6_o3_sortering {

    /**class 
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Katt tik = new Katt();
        tik.set_name("Marusia");
        tik.set_age(3);
        tik.mjau();
        Katt [] katten = new Katt[5];
        for(int i=0; i<5; i++)
            katten[i]= new Katt();
            katten[0].set_name("Lola");
            katten[1].set_name("Lila");
            katten[2].set_name("Lala");
            katten[3].set_name("Lulu");
            katten[4].set_name("Lula");
            for (int j=0; j<5; j++)
                katten[j].set_age(1);
            for(int i=0; i<5;i++)
                katten[i].mjau();
    }     
    }