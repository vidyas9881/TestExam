import java.util.Scanner;

class factorial{  
 public static void main(String args[])
 {  
    Scanner sc= new Scanner(System.in);

  int i,fact=1;  
  int number;  
  number=sc.nextInt();
  System.out.println("Enter a number ::" +number);
  for(i=1;i<=number;i++)
  {    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);  
  sc.close();


 }  
}