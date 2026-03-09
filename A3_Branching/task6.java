//6
  import java.util.Scanner;
  public class Task6{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter number: ");
      int num1=sc.nextInt();
      
      if(num1>0 && num1%2==0){
        System.out.println("Number is positive and even");
      }
      
      else if(num1>0 && num1%2!=0){
        System.out.println("Number is positive and odd");
      }
      
      else if(num1<0){
        System.out.println("Number is negative");
      }
      
      else if(num1==0){
        System.out.println("Number is zero");
      }
      
    }
  }
