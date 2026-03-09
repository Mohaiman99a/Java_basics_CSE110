//4
import java.util.Scanner;
public class Task4{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int p=sc.nextInt();
    System.out.println("Divisors of "+ p +":");
    
    for(int start=1; start<=p;start++){
      if(p%start==0){
        System.out.println(start);  
      }
    }
    
  }
}
