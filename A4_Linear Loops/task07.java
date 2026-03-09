//7
import java.util.Scanner;
public class Task7{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int sum=0;
    int n=1;
    
    
    while(true){
      if(n<=10){
        System.out.println("Enter Number: ");
        n=sc.nextInt();
        sum=sum+n;
        System.out.println("Sum = " + sum);
        n++;
      }
    }
  }
}
