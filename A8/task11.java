import java.util.Scanner;
public class Task11a{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    
     String[] names=  {"Bob", "Alice", "Max", "Marry", "Rosy"};
    int summation=0;
    

// ekta kore element pathabo
    for(int i=0; i< names.length; i++){
     String m= names[i];
     int count= isVowel (m);
     summation=summation + count;
    }
    System.out.println(summation);
    
     sc.close();
  }
  
  public static int isVowel (String s2){
    int count=0;
    
    for(int i=0; i<s2.length(); i++){
      char a=s2.charAt(i);
      
      if (a=='A' || a=='E' || a=='I' || a=='O' || a=='U' || a=='a' || a=='e' || a=='i' || a=='o' ||a=='u'){
        count++;
      }
    }
    return count;
  }
  
  }







import java.util.Scanner;
public class Task11a{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
   String s1= sc.nextLine();
   int count= isVowel(s1);
    System.out.println(count);
    
    
     String[] names=  {"Bob", "Alice", "Max", "Marry", "Rosy"};
    int summation=0;
    
    for(int i=0; i< names.length; i++){
     String m= names[i];
     int count2= isVowel (m);
     summation=summation + count2;
    }
    System.out.println(summation);
    
     sc.close();
  }
  
  public static int isVowel (String s2){
    int count=0;
    
    for(int i=0; i<s2.length(); i++){
      char a=s2.charAt(i);
      
      if (a=='A' || a=='E' || a=='I' || a=='O' || a=='U' || a=='a' || a=='e' || a=='i' || a=='o' ||a=='u'){
        count++;
      }
    }
    return count;
  }
  }

  
