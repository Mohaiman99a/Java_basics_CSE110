//Task 2
import java.util.Scanner;
public class Task2{
  public static void main( String[] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.print("The value of N: ");
    int n=sc.nextInt();
    
    int sum=0;
    
    
    for( int i=1; i<=n; i++){
      int temp=0;
      
      
      for(int j=1; j<=i;j++){
        temp=temp+j;
      }
      
      sum=sum-temp;
    }
    
    System.out.println("The value of y: " + sum);
    
  }
}

