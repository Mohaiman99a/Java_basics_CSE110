//11a
import java.util.Scanner;
public class Task11a{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number: ");
    int a=sc.nextInt();
    int counter=1;
    
    int i=1;
    while(i<=a){
      if(a%i==0){
        counter=counter+1;
      }
        i=i+1;
    }
    
    if(counter==2){
      System.out.println(a + " is a prime number");
    }
    else if (counter!=2){
      System.out.println(a + " is not a prime number");
    }
    
  }
}




//11b
import java.util.Scanner;
public class Task11a{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number: ");
    int a=sc.nextInt();
    
    int i=1;
    int sum=0;
    
    while(i<a){
      if(a%i==0){
        sum=sum+i;
      }
      i++;
    }
    
    if(sum==a){
      System.out.println(a + " is a perfect number");
    }
    else{
      System.out.println(a + " is not a perfect number");
    }
  }
}
