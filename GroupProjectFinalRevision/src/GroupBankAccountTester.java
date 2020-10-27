import java.util.*;
/*
 * Jarrett Nobles and Joey Carter
 * Bank Account Tester Code
 * Due 10/25/2020
 */
public class GroupBankAccountTester 
{

	public static void main(String[] args) 
	{
		GroupBankAccount myBankAccount = new GroupBankAccount();
	    myBankAccount.test();
	    Scanner input= new Scanner(System.in);
	    //declaring the variables
	    double checking;
	    double savings;
	    double withdraw;
	    double balance;
	    double transfer;
	    myBankAccount.menu1();
	    int Userchoice=input.nextInt();
	    while(Userchoice<=0 || Userchoice>=4){
	        System.out.println("Input invalid, please enter another input");
	        myBankAccount.menu1();
	        Userchoice=input.nextInt();
	    }//end while loop
	    while(Userchoice>0 && Userchoice<5){
	        if(Userchoice==1){
	            System.out.println("Please enter the amount you would like to open your checking with");
	            balance=input.nextDouble();
	            while(balance<100){
	                System.out.println("Opening amount is too low, must input at least 100.00 dollars(or 100)");
	                System.out.println("Please enter the amount you would like to open your checking with(taking into account 100 dollar minimum");
	                balance=input.nextDouble();
	            }
	            myBankAccount.OpenChecking(balance);
	            checking=myBankAccount.getChecking();
	            System.out.println(checking);
	            myBankAccount.menu1();
	            System.out.println("Please select another choice");
	            Userchoice=input.nextInt();
	        }
	        if(Userchoice==2){
	            System.out.println("Please enter the amount you would like to open your savings account with");
	            balance=input.nextDouble();
	            while(balance<50){
	                System.out.println("Opening amount is too low, must input at least 50.00 dollars(or 50)");
	                System.out.println("Please enter the amount you would like to open your checking with(taking into account 50 dollar minimum");
	                balance=input.nextDouble();
	            }
	            myBankAccount.OpenSavings(balance);
	            savings=myBankAccount.getSavings();
	            System.out.println(savings);
	            myBankAccount.menu1();
	            System.out.println("Please select another choice");
	            Userchoice=input.nextInt();
	        }
	        if(Userchoice==3){
	            System.out.println("Exit selected, Thank you for considering Null banking, have a great day!");
	            Userchoice=0;
	        }
	        if(Userchoice==4) 
	        {
	        	System.out.println("Continue banking selected, now taking you to another menu");
	        }
	    }//end while loop
	    ///////////////////////////////////////////
	    //menu2 functions
	    myBankAccount.menu2();
	    Userchoice=input.nextInt();
	    while (Userchoice > 0)
	    {
	    	///////////////////////////////////////////////////////////////////
	    	//deposit into checking account functions
	    	 if(Userchoice == 1) 
	    	{
	    		System.out.println("Deposit money into checking account");
				System.out.println("Enter the deposit amount");
				balance=input.nextDouble();
				myBankAccount.DepositChecking(balance);
				System.out.println("Money Deposited");
				System.out.println("Your new balance is: $"+myBankAccount.getChecking());
	    	}
	    	/////////////////////////////////////////////////////////////////////
	    	//withdraw from checking account
	    	else if(Userchoice == 2) 
	    	{
	    		//statements if user enters a withdrawal amount greater than their balance
		    	System.out.println("Please select an option to withdraw from");
		    	myBankAccount.menu3();
		    	Userchoice=input.nextInt();
		    	//////////////////////////////////////////////////////////
		    	//withdraw from checking
		    	if (Userchoice==1)
		    	{
		    		//statements so the user cant enter an amount greater than their balance to withdraw
		    		System.out.println("Withdraw from checking");
		    		System.out.println("Enter the withdrawal amount: ");
		    		withdraw=input.nextDouble();
		    	
		    		if (withdraw>myBankAccount.getChecking())
		    		{
			    		System.out.println("Insufficient funds");
			    		System.out.println("Please enter a valid amount");
			    		withdraw=input.nextDouble();
			    		myBankAccount.WithdrawChecking(withdraw);
			    		System.out.println("Your remaining balance is: $"+myBankAccount.getChecking());
		    		}
		    		else 
		    		{
		    			myBankAccount.WithdrawChecking(withdraw);
		    			System.out.println("Your remaining balance is: $"+myBankAccount.getChecking());
		    			
		    		}
		    	}
		    	//////////////////////////////////////////////////
		    	//withdraw from savings account
		    	else if(Userchoice==2) 
		    	{
		    		 System.out.println("Withdraw from savings");
                     System.out.println("Enter the withdrawal amount: ");
                     withdraw=input.nextDouble();
                     //statements so the user cant withdraw more than they have in their savings account
                     if(withdraw >myBankAccount.getSavings()) 
                     {
                    	 System.out.println("Insufficient funds");
                    	 System.out.println("Please enter a valid amount");
                    	 withdraw=input.nextDouble();
                    	 System.out.println("Your remaining balance is: $"+myBankAccount.getSavings());
                     }
                     else 
                     {
                    	 myBankAccount.WithdrawSavings(withdraw);
                    	 System.out.println("Your remaining balance is: $"+myBankAccount.getSavings());
                     }
		    	}
		    	else if(Userchoice==3) 
		    	{
		    		System.out.println("Exit");
                   
		    	}
	    	}	
	    	/////////////////////////////////////////////////////////////
	    	//checking balance of checking account
	    	else if (Userchoice == 3) 
	    	{
	    		System.out.println("Checking account balance.");
				System.out.println("Current balance in your checking account: $"+myBankAccount.getChecking());
	    	}
	    	////////////////////////////////////////////////////////////
	    	//checking balance of savings account
	    	else if (Userchoice == 4) 
	    	{
	    		System.out.println("Savings account balance.");
				System.out.println("Current balance in your savings account: $"+myBankAccount.getSavings());
	    	}
	    	////////////////////////////////////////////////////////////
	    	//transfer money option
	    	else if (Userchoice == 5) 
	    	{
	    		System.out.println("Transfer money");
	    		System.out.println("Which account would you like to transfer money from?");
	    		myBankAccount.menu3();
	    		Userchoice=input.nextInt();
	    		//checking to savings
	    		if (Userchoice == 1) 
	    		{
	    			System.out.println("Transfer from checking to savings");
	    			System.out.println("Please enter the amount you would like to transfer: ");
	    			transfer=input.nextDouble();
	    			myBankAccount.TransferToSavings(transfer);
	    			System.out.println(myBankAccount.getChecking());
	    		}
	    		//savings to checking
	    		else if(Userchoice == 2) 
	    		{
	    			System.out.println("Transfer from savings to checking");
	    			System.out.println("Please enter the amount you would like to transfer");
	    			transfer=input.nextDouble();
	    			myBankAccount.TransferToChecking(transfer);
	    			System.out.println(myBankAccount.getChecking());
	    		}
	    		//exit transfer menu
	    		else 
	    		{
	    			System.out.println("Exit");
	    			myBankAccount.menu2();
	    			
	    		}
	    	}
	    	 //////////////////////////////////////////////////////
	    	 //if user selects an option greater than 6
	    	else if (Userchoice>6) 
	    	{
	    		System.out.println("Please enter the proper menu selection");
	    		myBankAccount.menu2();
	    		Userchoice=input.nextInt();
	    	}
	    	 ////////////////////////////////////////////////////////
	    	 //exit function
	    	else 
	    	{
	    		System.out.println("Thank you have a nice day!");
	    		break;
	    		
	    	}
	    	 ////////////////////////////////////////////////////////
	    	 //this line of code prompts the user for another menu option after completing one
	    	System.out.println("       ");
	    	 System.out.println("       ");
	    	 System.out.println("Please Enter another menu option");
	    	 myBankAccount.menu2();
	    	 Userchoice=input.nextInt();
	    	
	    }//end while loop
	}	    	    
}
