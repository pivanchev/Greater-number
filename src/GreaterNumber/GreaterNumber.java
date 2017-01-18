
package GreaterNumber;
import java.util.*;

public class GreaterNumber {

   
   public static void main(String[] args) {
       
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the first number!");
       int num=Integer.parseInt(input.nextLine());
       
       System.out.println("Enter the second number!");
       int num1=Integer.parseInt(input.nextLine());
       
       if (num>num1){
           System.out.println("Greater number : " + num);
           
       }else if(num<num1){
           System.out.println("Greater number : " + num1);
       }else{
           System.out.println("The numbers are equal!");
       }
    
       
       
 
}
}
