/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
        int i,a;
        float s1,s2,s3,s4,s5,avg,sum;
        Scanner demo=new Scanner(System.in);
        System.out.println("                                      STUDENT GRADE CALCULATOR");
        System.out.println("                                      ------------------------");
        System.out.print("\nEnter the number of students : ");
        a=demo.nextInt();
        for(i=0;i<a;i++)
        {
           System.out.print("Enter Student Name : ");
           String str=demo.next();                        
           System.out.print("Enter your mark in s1 : ");
           s1=demo.nextFloat();
           System.out.print("Enter your mark in s2 : ");
           s2=demo.nextFloat();
           System.out.print("Enter your mark in s3 : ");
           s3=demo.nextFloat();
           System.out.print("Enter your mark in s4 : ");
           s4=demo.nextFloat();
           System.out.print("Enter your mark in s5 : ");
           s5=demo.nextFloat();
           sum=s1+s2+s3+s4+s5;
           System.out.print("Total marks : "+sum);
           System.out.print("\n");
           avg=sum/5;
           System.out.print("avg : "+avg);
           System.out.print("\n");
           System.out.print(str+" : ");
           if(avg>=90)
          {
              System.out.print("A+ grade");
          }
          else if(avg>=80)
          {
             System.out.print(" A grade");
          }
           else if(avg>=70)
          {
              System.out.print("B grade");
          } 
          else if(avg>=60)
          {
              System.out.print("C grade");
          }
          else if(avg>=50)
          {
              System.out.print("D grade");
          }
          else
          {
              System.out.print("F grade");
          }
          System.out.print("\n\n");
        }
    
    }
   
}  

	
