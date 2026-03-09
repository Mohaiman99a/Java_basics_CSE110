//9
import java.util.Scanner;
public class Task9{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    
    
    String pass_w=sc.nextLine();
    int len=pass_w.length();
    boolean up=false;
    boolean low=false;
    boolean digit=false;
    boolean special=false;
    
    
    
    if(len>=8){
      for(int i=0; i<len; i++){
        char ch=pass_w.charAt(i);
        
        if(ch>='A' && ch<='Z'){
          up=true;
        }
        
        else if(ch>='a' && ch<='z'){
          low=true;
        }
        
        else if(ch>='0' && ch<='9'){
          digit=true;
        }
        
        else{
          special=true;
        }
      }
      

// Double equal
      if(up==true && low==true && digit==true && special==true){
        System.out.println("True");
      }
      
      else{
        System.out.println("False");
      }
   }
       
  }
}
