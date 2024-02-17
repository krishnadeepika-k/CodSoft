/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int i,j,k,l;
	    String s;
	    Scanner demo=new Scanner(System.in);
	    System.out.println("Available courses:");
		System.out.println("Course title : C++ programming               Course code : 22CPP201  Available slots:10");
		System.out.println("Course title : C programming                 Course code : 22C201    Available slots:10");
		System.out.println("Course title : Data Structure                Course code : 22DS201   Available slots:10");
		System.out.println("Course title : Java Programming              Course code : 22JP201   Available slots:10");
		System.out.println("Course title : Data Base management system   Course code : 22DM201   Available slots:10\n");
		System.out.println("By choosing the courses from the available options you can register those courses.\n");
		System.out.printf("Name of the student : ");
		demo.next();
		System.out.printf("Student ID : ");
		demo.nextInt();
		System.out.println("For registering the courses give 6 as the input.\nFor deregistering the courses give 7 as the input" );
		k=demo.nextInt();
		if(k==6)
		{
		    System.out.println("If you want to choose 1 course give 1 as the input.Like that you can give input for j till 5 according to your need:");
	        j=demo.nextInt();
	    	switch(j)
		    {
		     case 1:
		        { 
		               i=1;
		               System.out.printf("Enter your course name:");
		               s=demo.next();
		               System.out.println("course "+i+" : "+s);
		               break;
		             
		        }
		     case 2:
		        {
		            	for(i=1;i<=2;i++)
		                {
		                System.out.printf("Enter your course name:");
		                s=demo.next();
		                System.out.println("course "+i+" : "+s);
		                
		                }
		                break;
		        }
		     case 3:
		       {
		                for(i=1;i<=3;i++)
		                {
		                System.out.printf("Enter your course name:");
		                s=demo.next();
		                System.out.println("course "+i+" : "+s);
		                }
		                break;
		       }
		    case 4:
		       {
		                for(i=1;i<=4;i++)
		                {
		                System.out.printf("Enter your course name:");
		                s=demo.next();
		                System.out.println("course "+i+" : "+s);
		                }
		                break;
		       }
		  case 5:
		       {
		            
		                for(i=1;i<=5;i++)
		                {
		                System.out.printf("Enter your course name:");
		                s=demo.next();
		                System.out.println("course "+i+" : "+s);
		                }
		                break;
		       }
		    }  
		    System.out.println("Successfully you have registered courses");   
		}
		else
		{
		    System.out.println("If you want to drop from the courses Enter the number of that courses  ");
		    l=demo.nextInt();
		    switch(l)
		    {
		     case 1:
		        { 
		             i=1;
		             System.out.println("Enter your course name:");
		             s=demo.next();
		             System.out.println(" Removed course No "+i+" : "+s);
		             break;
		        }
		      case 2:
		        {
		            	for(i=1;i<=2;i++)
		                {
		                System.out.printf("Enter your course name:");
		                s=demo.next();
		                System.out.println(" Removed course No "+i+" : "+s);
		                }
		                break;
		        }
		      case 3:
		       {
		                for(i=1;i<=3;i++)
		                {
		                System.out.printf("Enter your course name:");
		                s=demo.next();
		                System.out.println(" Removed course No "+i+" : "+s);
		                }
		                break;
		       }
		     case 4:
		       {
		                for(i=1;i<=4;i++)
		                {
		                System.out.printf("Enter your course name:");
		                s=demo.next();
		                System.out.println(" Removed course No "+i+" : "+s);
		                }
		                break;
		       }
		     case 5:
		       {
		            
		                for(i=1;i<=5;i++)
		                {
		                System.out.printf("Enter your course name:");
		                s=demo.next();
		                System.out.println(" Removed course No "+i+" : "+s);
		                }
		                break;
		       }
		    }
		   System.out.println("Successfully you have droped your courses ");
		}
		
	}
}