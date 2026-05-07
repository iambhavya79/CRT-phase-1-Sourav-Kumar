// wap java program that take an interger as 
// a input from the user that take print 
// all athe number to n that is divisble by 2 jdfhdj
import java.util.Scanner;

public class divisibleby2  
 {public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
      for(int i=1;i<=n;i++)  

      if(i%2==0)
      {
         System.out.println(i);
      }
   }
}
