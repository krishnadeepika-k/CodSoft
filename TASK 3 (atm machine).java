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
		int pin=1234;
		int balance=100000;
		int addamount=0;
		int takeamount=0;
		String name;
		Scanner demo=new Scanner(System.in);
		System.out.printf("Enter your pin number:");
		int password=demo.nextInt();
		if(password==pin)
		{
		    System.out.print("Enter your name:");
		    name=demo.next();
		    System.out.println("Welcome "+name);
		   
		    
		        System.out.println("press 1 to check your balance");
		        System.out.println("press 2 to add amount");
		        System.out.println("press 3 to take amount");
		        System.out.println("press 4 to take recipt");
		        System.out.println("press 5 to EXIT");
		    while(true)
		    {
		        int opt=demo.nextInt();
		        switch(opt)
		        {
		            case 1:
		                {
		                    System.out.println("Your balance is "+balance);
		                    break;
		                }
		            case 2:
		                {
		                    System.out.printf("How much amount did you want to Add to your amount :");
		                    addamount=demo.nextInt();
		                    System.out.println("Successfully credited");
		                    balance=addamount+balance;
		                    System.out.println("Your balance is "+balance);
		                    break;
		                }
		            case 3:
		                {
		                    System.out.printf("How much amout did you want to take :");
		                    takeamount=demo.nextInt();
		                    if(takeamount>balance)
		                    {
		                        System.out.println("Your balance is insufficient");
		                        System.out.println("Try less than your available balance");
		                    }
		                    else
		                    {
		                        System.out.println("Successfully taken");
		                        balance=balance-takeamount;
		                        System.out.println("Your balance is "+balance);
		                    }
		                    break;
		                }
		             case 4:
		                 {
		                     System.out.println("Welcome to mini ATM");
		                     System.out.println("Available balance is "+balance);
		                     System.out.println("Deposited amount : "+addamount);
		                     System.out.println("Taken amount : "+takeamount);
		                     System.out.println("Thanks for coming");
		                     break;
		                 }
		             
		       }
		       if(opt==5)
		       {
		          System.out.println("Thankyou");
		          break;
		       }
		       
		    }
		}
		else
		{
		    System.out.println("Wrong pin number");
		}
		
	}
}