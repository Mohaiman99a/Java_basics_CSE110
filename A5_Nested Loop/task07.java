//Task 7
import java.util.Scanner;
public class Task7{
  public static void main( String[] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Height= ");
    int h=sc.nextInt();
    
    
    //space print h-nth row
    
    for(int i=1; i<=h;  i++){
      
      for(int j=1; j<=h-i; j++){
        System.out.print(" ");
      }

      for(int k=1; k<=((2*i)-1);k++){
        System.out.print(k);
      }

      System.out.println();
    }
  }
}
