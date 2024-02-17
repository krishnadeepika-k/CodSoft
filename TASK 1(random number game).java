/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
                                       
       int a,b,flag=0,count=0;
       System.out.println("It will generate a random number within a specified range, such as 1 to 100.\n");           
       while(flag==0)                       
        {   
            Scanner demo= new Scanner(System.in); 
            System.out.print("Enter your guess : ");
            a=demo.nextInt();
            Random rand=new Random();
            b=rand.nextInt(100);
            System.out.println("Random number : "+b);
            if(b==a)
            {
              System.out.println("guess is correct\n\n");
              flag=1;
              count++;
            }
            else if(b<a)
            {
              System.out.println("your guess is too high\n\n");
              count++;
            }
            else if(b>a)
            {
              System.out.println("your guess is too low\n\n");
              count++;
            }
           if(flag==1)
            {
              break;
            }
            
        }
      System.out.println("number of attempt : "+count);
      
   }

}