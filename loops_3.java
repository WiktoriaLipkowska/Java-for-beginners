3. Skapa ett program för kursutvärdering. Programmet ska fortsätta att tjata om betyg ända tills användaren ger kursen högsta betyg: En programkörning kan se ut som nedan.
Betygsätt denna kurs med en siffra mellan 1-5
Vilket betyg ger du denna kurs: 4
Du måste tryckt fel, försök igen
Vilket betyg ger du denna kurs: 2
Du måste tryckt fel, försök igen
Vilket betyg ger du denna kurs: 3
Du måste tryckt fel, försök igen
Vilket betyg ger du denna kurs: 5
Tack! Ditt omdöme om denna kurs har registrerats
@

int answer;
        System.out.println("Betygsätt denna kurs med en siffra mellan 1-5");
        Scanner input = new Scanner(System.in);
        do{System.out.println("Vilket betyg ger du denna kurs: ");
           answer = input.nextInt();
           System.out.println("Du måste tryckt fel, försök igen");
        } 
         while(answer!=5);{
            System.out.print("Tack! Ditt omdöme om denna kurs har registrerats");
            }
            }
