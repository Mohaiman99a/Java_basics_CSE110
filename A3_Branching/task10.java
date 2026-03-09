//10
import java.util.Scanner;
public class Task10{
  public static void main(String[] args){
   
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter first number:");
  float n1 = sc.nextFloat();
  System.out.println(n1);
  
  System.out.println("Enter second number:");
  float n2=sc.nextFloat();
  System.out.println(n2);
  
  System.out.println("Enter third number:");
  float n3=sc.nextFloat();
  System.out.println(n3);
  
  //Finding Maximum number
  float n_max;
  if(n1>n2){
    n_max=n1;
   }
  else{
    n_max=n2;
   }
  
  if(n3>n_max){
    n_max=n3;
   }
  System.out.println("Maximum number is " +n_max);
  
 
  // Finding minimum number
  float n_min;
  if(n1<n2){
    n_min=n1;
   }
  else{
    n_min=n2;
   }
  
  if(n3<n_min){
    n_min=n3;
   }
  System.out.println("Minimum number is " +n_min);
  }
}
