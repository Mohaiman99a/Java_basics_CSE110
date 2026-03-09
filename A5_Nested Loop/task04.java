//Task 4
import java.util.Scanner;
public class Task4{
  public static void main( String[] args){
    Scanner sc= new Scanner(System.in);
    
    int testCase=sc.nextInt();
    
    for(int i=1; i<=testCase; i++){
     
      int sum=0;
      int a=sc.nextInt();
      int b=sc.nextInt();
      
      if(a%2==0){
        a=a+1;
      }
      
      for(int j=1; j<=b; j=j+1){
        sum=sum+a;
        a=a+2;
      }
      
      System.out.println(sum);
    }
  }
}
