package test;
import java.util.Scanner;

public class Test{
  public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    int [] result = new int[4]; // how many ing we can add 
    int [] arr = new int[100]; //max number for input
    int counter = 0, count = 0;
    Boolean error = false;
    int i,temp = 0;
    System.out.println("Enter the integers between 1 and 100: ");
    String tmp = input.nextLine();
        tmp = tmp.trim();//take away leading or after space
            for ( i=0; i<tmp.length(); i++){
                if(Character.isDigit(tmp.charAt(i))==false) error=true;
                else arr[i] = (int)tmp.charAt(i)-48; //(numerisca syffror) something about programmingtrick to find out if this is the umber 
            
         }
    //Initialize num[] array with user input
    for(i=0; i < result.length; i++){
        result[i] = input.nextInt();
        //expected input will end when user enters zero
        if(result[i] == 0){
            break;
        }
    }//end of for loop
    
       for (i =0 ; i < result.length; i++){
           if(result[i] > 10 || result[i] == 10 ){
           count++;
           }
       }
       if(!error)
       System.out.println("Number of the elements more or equal 10 is: "+count + " Number of the elements less than 10 is: "+(4-count));    
       
       else System.out.println("wrong data input");
       
}//end of main
}//end of CountOccurrenceOfNumbers

