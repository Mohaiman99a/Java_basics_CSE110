//12
import java.util.Scanner;
public class Task12{
  public static void main(String[] args){
   
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the amount the customer needs to pay: ");
  int cost=sc.nextInt();

  System.out.println("Enter the amount the customer paid: ");
  int paid=sc.nextInt();
  
  int change= paid - cost;
  int extra= cost - paid;
  
  if(change==0){
    System.out.println("The returned amount is 0 taka.");
  }
  else if(cost>paid){
    System.out.println("Please pay " + extra +" taka more.");
  }
  else{
    int hundred= change/100;
    int a1=change%100;
    
    int fifty= a1/50;
    int a2=a1%50;
    
    int twenty= a2/20;
    int a3=a2%20;
    
    int ten= a3/10;
    int a4=a3%10;
    
    int five= a4/5;
    int a5=a4%5;
    
    int two= a5/2;
    int a6=a5%2;
    
    int one= a6/1;
     
    System.out.println("100 taka note: " + hundred);
    System.out.println("50 taka note: " + fifty);
    System.out.println("20 taka note: " + twenty);
    System.out.println("10 taka note: " + ten);
    System.out.println("5 taka coin: " + five);
    System.out.println("2 taka coin: " + two);
    System.out.println("1 taka coin: " + one);
   }
  }
}
