//Task 5

import java.util.Scanner;
public class Task5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int count_v=0;
    int count_c=0;
    
    String treasure= sc.nextLine();
    int len=treasure.length();
    int indx=len-1;

    for (int i=0; i<=indx; i++){
      char ch=treasure.charAt(i);
      
      if( ch== 'A' || ch== 'E' || ch== 'I' || ch== 'O' || ch== 'U'){
        count_v++;
      }
      
       else if( ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
        count_v++;
      }
       
       else if(ch>= 'A' && ch<= 'Z'){
         count_c++;
       }
       
       else if(ch>= 'a' && ch<= 'z'){
         count_c++;
       }
       
    }
    
    if(count_v!=0 && count_c!=0){
      if(count_v%3==0 && count_c%5==0){
        System.out.println("Aaarr! Me Plunder!!");
      }
      else{
      System.out.println("Blimey! No Plunder!!");
    }
    }
    
    else{
      System.out.println("Blimey! No Plunder!!");
    }
    
  }
}
