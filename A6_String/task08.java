//Task 8
import java.util.Scanner;
public class Task8{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String s= sc.nextLine();
    int len= s.length();
    boolean low=true;
    String temp= "";

    
       for(int i=0; i<len; i++){
      char a=s.charAt(i);
      
      
      if (low=true){
        if(a>='a' && a<='z'){
          System.out.print(a);
        }
        
        else if(a>='A' && a<='Z'){
          char b=(char)(a+32);
          System.out.print(b);
        }
        
        else{
          System.out.print(a);
        }
        low=false;
      }
      
      
      
       if (low=false){
        if(a>='A' && a<='Z'){
          System.out.print(a);
        }
        
        else if(a>='a' && a<='z'){
          char b=(char)(a-32);
          System.out.print(b);
        }
        
        else{
          System.out.print(a);
        }
        low=true;
      } 
       }
  }
}
