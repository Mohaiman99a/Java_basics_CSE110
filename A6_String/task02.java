//Task 2
import java.util.Scanner;
public class Task2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    
    String s1=sc.nextLine();
    int len=s1.length(); 
    int indx=len-1;
    String temp="";
    
    
    for(int i=indx; i>=0; i--){
      char c1=s1.charAt(i);
      temp=temp+ c1;
    }
    
    if(s1.equals(temp)){
      System.out.println("true");
    }
       
       else{
         System.out.println("false");
       }
       
       
       }
}

