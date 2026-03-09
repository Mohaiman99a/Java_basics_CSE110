import java.util.Scanner;
public class Task3{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    String[] email_list = {"abc@gmail.com", "!@cv.bd",  "123cse@bracu.ac.bd"};
    boolean flag1=false;
    boolean flag2=false;
    boolean flag3=false;
    boolean flag4=false;
    int count=0;
    
    for(int i=0; i<email_list.length; i++){
      String p=email_list[i];
      
      for(int j=0; j<p.length(); j++){
        char a=p.charAt(j);
        
        if(a=='@'){
          flag1=true;
          int b=j+1;
          int c=j-1;
          
          if(p.charAt(b)>'a' && p.charAt(b)<'z' && p.charAt(c)>'a' && p.charAt(c)<'z' ){
            flag2=true;
          }
        }
        
        else if(a=='.'){
          int c=j+1;
          flag3=true;
          
          if(p.charAt(c)>'a' && p.charAt(c)<'z'){
            flag4=true;
          }
        }
        
      }
    }
    
    if(flag1==true && flag2==true && flag3==true && flag4==true){
      count++;
      System.out.println(count);
      
    }
    sc.close();
  }
}

