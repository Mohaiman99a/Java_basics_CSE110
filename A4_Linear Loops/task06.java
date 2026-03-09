//6
import java.util.Scanner;
public class Task5{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Input number of terms: ");
    int n=sc.nextInt();
    int sum=0;
    
    for(int a=1; a<=2 * n; a++){
      if(a%2!=0){
        System.out.println(a);
        sum=sum +a;
      }
      
    }
    System.out.println("The Sum of odd Natural Numbers up to " + n +" terms is: " + sum);
  }
}

