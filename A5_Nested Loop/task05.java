//Task 5
import java.util.Scanner;
public class Task5{
  public static void main( String[] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Column= ");
    int col=sc.nextInt();
    
    System.out.println("Row= ");
    int row=sc.nextInt();
    
    for(int i=1; i<=row; i++){
      
      for(int j=1; j<=col; j++){
        System.out.print(j);
        System.out.print(" ");
      }
      
      System.out.println();
   }
    
 }
}
