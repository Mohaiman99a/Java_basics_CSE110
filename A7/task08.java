//8

import java.util.Scanner;
import java.util.Arrays;

public class Task8{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Please enter the length of array 1:  ");
    int n1=sc.nextInt();
    int[] arr1=new int[n1];
    
    
    System.out.println("Please enter the elements of the arr1: ");
    for(int i=0; i<arr1.length; i++){
      int element=sc.nextInt();
      arr1[i]=element;
      }
    
    
    
    
    System.out.println("Please enter the length of array 2:  ");
    int n2=sc.nextInt();
    int[] arr2=new int[n2];
    
    
    System.out.println("Please enter the elements of the arr2: ");
    for(int j=0; j<arr2.length; j++){
      int element=sc.nextInt();
      arr2[j]=element;
      }  
    
    
    
    int count=0;
    
    for(int i=0; i<arr2.length; i++){
      for(int j=0; j<arr1.length; j++){   //Duita loop for duita + array arr2 bahire
        if(arr2[i]==arr1[j]){
          count++;
         break;
        }
      }
    }
    
    if(count==n2){
      System.out.println("Array 2 is a subset of Array 1. ");
    }
    
        if(count!=arr2.length){
      System.out.println("Array 2 is not a subset of Array 1. ");
    }
        
  }
}  
  



