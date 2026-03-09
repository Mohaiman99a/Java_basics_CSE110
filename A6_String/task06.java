//Task 6
import java.util.Scanner;
public class Task6{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String a= sc.nextLine();
    int start=0;
    int end=(a.length()-1);
    
    
    //Loop to print all the words except the first one
    for(int i=end; i>=0; i--){
      
      if(a.charAt(i)==' '){
        start=i+1;
        
        for(int j= start; j<=end; j++){
          char b=a.charAt(j);
          System.out.print(b);
        }
        
        System.out.print(" ");
        end= i-1;
      }
    }
    
    
    // Loop to print the first word
    int k=0;
    while( k<=end){
      char b=a.charAt(k);
      System.out.println(b);
      k++;
    }
    
  }
}
