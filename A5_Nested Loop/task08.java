//Task 8
import java.util.Scanner;
public class Task8{
  public static void main( String[] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.print("Start: ");
    int start=sc.nextInt();
    
    System.out.print("End: ");
    int end=sc.nextInt();
    
    System.out.println("Armstrong numbers: ");
    
    for(int i=start;i<=end;i++){
      int temp=i;
      int count=0;
      
      //while to count no of digits
      while(temp!=0){
        temp=temp/10;
        count++;
      }
      
      temp=i;         //2 bar nite hobe
      int r=0;
      int sum=0;
      
      //while to find sum of each
      while(temp>0){
        r=temp%10;
        double a=Math.pow(r,count);
        sum=sum+ (int) a;
        temp=temp/10;
      }
      
      //Print only armstrong
      if(sum==i){
        System.out.println(sum);
      }
      
    }
  }
}
