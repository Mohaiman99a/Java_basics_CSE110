//Task 3
import java.util.Scanner;
public class Task3{
  public static void main( String[] args){
    Scanner sc= new Scanner(System.in);
    int count=0;
    
    while(true){
      System.out.println("Enter Number: ");
      int n=sc.nextInt();
      
      if(n%2!=0){
        break;
      }
      
      else if(n%2==0){
        
        for( int i=1; i<=n; i++;){
          if(n%i==0){
            count=count+1;
            }
          }
        
        System.out.println(n + " has " + count + " divisors");
        
      }
    }
  }
}
