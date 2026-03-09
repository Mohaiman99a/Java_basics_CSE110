import java.util.Scanner;
public class Task2a{
  
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
       double area = circleArea(5);
       System.out.printf("%.4f\n", area);
       
       sc.close();
  }
  
  public static double circleArea(int m){
    double ar=Math.pow(m,2)* Math.PI;
    return ar;
  }
}










IMPORTANT
import java.util.Scanner;
public class Task2{
  
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    String s1=sc.nextLine();
    double dia= sc.nextDouble();
    double area = findSpace(dia, s1);
    System.out.printf("%.4f", area);    //4 decimal print
    
    sc.close();
  }
  
  public static double findSpace(double p, String s2){
    String s3= "circle";
      
    if(s2.equalsIgnoreCase(s3)){
     double j=p/2;
     return circleArea(j);
    }
    
    return 0; //Bahire ekta return thakbei
  }
  
  public static double circleArea(double m){
    double ar=Math.pow(m,2)* Math.PI;
    return ar;
  }
}
