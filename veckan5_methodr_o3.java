/*
 * 3. Förbättra funktionen i förr uppgiften så att den även 
har ett argument för enkla eller dubbla linje. 
Som default är den inställd på enkla linjer men ges värde 
2 till argumentet så erhålls dubbla d.v.s. något i denna stil 
=============================
 */

package veckan5;


public class Veckan5 {
    static void print(String Symbol,int n){
        //n=10;
        //Symbol="a";
String result = "";
for (int i = 0; i < n; i += 1) {
    result += Symbol;
        System.out.print(Symbol);
    }
    }
    static void print2(String Symbol,int n){
        //n=10;
        //Symbol="a";
String result = "";
for (int i = 0; i < n; i += 1) {
    result += Symbol;
        System.out.print(Symbol);
    }
    }
public static void main(String[] args) {
        // TODO code application logic here
        print("-",20);  
        System.out.println("");
        print2 ("-",20);
}

}
    