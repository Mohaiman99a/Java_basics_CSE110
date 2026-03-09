//3
  import java.util.Scanner;
  public class Task3{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter first number: ");
      int n1=sc.nextInt();
      
      System.out.println("Enter second number: ");
      int n2=sc.nextInt();
      
      System.out.println("Enter operator: ");
      String operator=sc.next();
      
      //Use .equals() method to compare two strings
      if (operator.equals("+")){
        System.out.println(n1+n2);
      }
      
       else if (operator.equals("-")){
        System.out.println(n1-n2);
      }
       
       else if (operator.equals("*")){
        System.out.println(n1*n2);
      }
       
       else if (operator.equals("/")){
        System.out.println(n1/n2);
      }
       
    }
  }

