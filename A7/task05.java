//5

 import java.util.Arrays;
import java.util.Scanner;

public class Task5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("N = ");
    int n=sc.nextInt();
    int[] arr1=new int[n];
    int length=arr1.length;
        
    for(int i=0; i<length; i++){
      System.out.println("Enter a number: ");
      int element=sc.nextInt();
      arr1[i]=element;
      }
     
    
    //Search
      int search=sc.nextInt();
      boolean flag=false;
      
      for(int j=0; j<length; j++){                                   //Ekta loop
        if(arr1[j]==search){
        System.out.println(search + " is at index " + j);  //Indx ekhane print
        flag=true;
        break;
        }
      }
      
      if(flag==false){
        System.out.println("Element not found");
      }
      
  }
}
