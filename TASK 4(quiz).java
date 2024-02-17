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
	    int k,count=0,ctr=0;
	    Scanner demo=new Scanner(System.in);
		System.out.println("Java MCQ Questions:");
		System.out.println("___________________\n");
		System.out.println("1) Number of primitive data types in Java are?");
		System.out.println("a.6  b.7  c.8  d.9");
		System.out.printf("Enter your answer : ");
		k=demo.nextInt();
		if(k==8)
		{
		    System.out.println("Correct answer");
		    System.out.println("--------------\n");
		    count++;
		}
		else
		{
		    System.out.println("Your answer is wrong");
		    System.out.println("Correct answer is c.8");
		    System.out.println("---------------------\n");
		    ctr++;
		}
		System.out.println("2) Total constructor string class have?");
		System.out.println("a.3  b.7  c.13  d.20");
		System.out.printf("Enter your answer : ");
		k=demo.nextInt();
		if(k==13)
		{
		    System.out.println("Correct answer");
		    System.out.println("--------------\n");
		    count++;
		}
		else
		{
		    System.out.println(" Your answer is wrong");
		    System.out.println("Correct answer is a.13");
		    System.out.println("---------------------\n");
		    ctr++;
		}
	    System.out.println("3) Find the output of the following code.\nPublic class Solution\n{\n Public static void main(String[] args)\n {\n  Int x = 5;\n  x * = (3 + 7);\n  System.out.println(x);\n }\n}");
		System.out.println("a.22  b.50  c.52  d.30");
		System.out.printf("Enter your answer : ");
		k=demo.nextInt();
		if(k==50)
		{
		    System.out.println("Correct answer");
		    System.out.println("--------------\n");
		    count++;
		}
		else
		{
		    System.out.println(" Your answer is wrong");
		    System.out.println("Correct answer is b.50");
		    System.out.println("---------------------\n");
		    ctr++;
		}
	    System.out.println("4) Evaluate the following Java expression:\n if x=3, y=5, and z=10:\n++z + y - y + z + x++");
		System.out.println("a.24  b.23  c.20  d.25");
		System.out.printf("Enter your answer : ");
		k=demo.nextInt();
		if(k==25)
		{
		    System.out.println("Correct answer");
		    System.out.println("--------------\n");
		    count++;
		}
		else
		{
		    System.out.println(" Your answer is wrong");
		    System.out.println("Correct answer is d.25");
		    System.out.println("---------------------\n");
		    ctr++;
		}
		System.out.println("5) Evaluate the following Java expression:\npublic class Quiz\n{\n public static void main(String[] args)\n {\n  int a = 10;\n  System.out.println(a*a--);\n }\n}");
		System.out.println("a.98  b.90  c.81  d.100");
		System.out.printf("Enter your answer : ");
		k=demo.nextInt();
		if(k==100)
		{
		    System.out.println("Correct answer");
		    System.out.println("--------------\n\n");
		    count++;
		}
		else
		{
		    System.out.println(" Your answer is wrong");
		    System.out.println("Correct answer is d.100");
		    System.out.println("---------------------\n\n");
		    ctr++;
		}
		System.out.println("    Thankyou for answering the MCQ");
	    System.out.println("    ------------------------------");
            System.out.println("Final Score : "+count*20);
	    System.out.println("Number of questions answered correctly : "+count);
	    System.out.println("Number of questions answered wrongly   : "+ctr);
	}
}
