//13
import java.util.Scanner;
public class Task13{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Input the 1st number: ");
  int s1 = sc.nextInt();
  System.out.println("Input the 2nd number: ");
  int s2 = sc.nextInt();
  System.out.println("Input the 3rd number: ");
  int s3 = sc.nextInt();
  
  if(s1==s2 && s2==s3){
    System.out.println("All numbers are equal");
  }
  
  else if(s1==s2 || s2==s3 || s1==s3){
    System.out.println("Neither all are equal or different");
  }
  
  else{
    System.out.println("All numbers are different");
   }
  }
}
