//1B
import java.util.Scanner;
public class taskB{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    int n= sc.nextInt();
   boolean result= isEven(n);
    System.out.println(result);
  }
  
  public static boolean isEven(int m){
    if(m%2==0){
      boolean result= true;
      return result;
    }
    
      else if(m%2!=0){
      boolean result= false;
      return result;
    }
      
    return false;
  }
}
