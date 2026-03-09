//Task 4
import java.util.Arrays;
import java.util.Scanner;

public class Task4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    //Original array
    System.out.println("N = ");
    int n=sc.nextInt();
    int[] arr1=new int[n];
    
    for(int i=0; i<arr1.length; i++){
      int element=sc.nextInt();
      arr1[i]=element; 
    }
    
    
    System.out.println("Original array:  ");
     for(int k=0; k<arr1.length; k++){
      System.out.print(arr1[k]+" ");
    }
     System.out.println("");
     
     
     
     
     //Modifying
     int[] arr2=new int[n];
     
      for(int i=0; i<arr1.length; i++){
        if(arr1[i]>0){
          arr2[i]=1;
        }
        
        else{
          arr2[i]=0;
        }
        
    }

     System.out.println("After modifying: ");
     for(int k=0; k<arr1.length; k++){
      System.out.print(arr2[k]+" ");
    }

    
  }
}
