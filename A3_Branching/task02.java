//2
import java.util.Scanner;
public class Task2{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter marks: ");
  int marks= sc.nextInt();
    System.out.println(marks);
  
    if(marks>=90 && marks<=100){
      System.out.println("Your grade is A");
    }
    
    else if(marks>=85 && marks<=89){
      System.out.println("Your grade is A-");
    }
  
    else if(marks>=70 && marks<=84){
      System.out.println("Your grade is B");
    }
    
    else if(marks>=57 && marks<=69){
      System.out.println("Your grade is C");
    }
    
    else if(marks>=50 && marks<=56){
      System.out.println("Your grade is D");
    }
    
    else if(marks<50){
      System.out.println("Your grade is F");
    }
    
  }
}
