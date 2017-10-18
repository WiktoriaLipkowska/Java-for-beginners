4. Skapa ett program som genererar multiplikationstabeller. T.ex. som i exemplet nedan
Vilken multiplikationstabell
vill du se? 7
1 x 7 = 7
2 x 7 = 14
3 x 7 = 21
4 x 7 = 28
5 x 7 = 35
6 x 7 = 42
7 x 7 = 49
8 x 7 = 56
9 x 7 = 63
10 x 7 = 70

Förbättra programmet i uppgift 4 så att man hela tiden kan begära ytterligare tabell. T.ex. så här:
Ange med en siffra vilken
multiplikationstabell du vill se, eller tryck 0
för att avsluta
@

package loops;
import java.util.Scanner;
import java.util.Random;


public class loops {

    Scanner s = new Scanner(System.in);
        System.out.print("Ange med en siffra vilken multiplikations tabell du vill se, eller tryck 0 för att avsluta ");
        
        int num1 = s.nextInt();
        if (num1==0){
        }
        else {
        for (int i=1; i<11; i++){ 
        System.out.println (i + " x " + num1 + " = " + i*num1);
        }
        }