import java.util.*;
/*
 * Joey Carter and Jarrett Nobles
 * Due 10/25/2020
 */
public class GroupBankAccount 
{
	    double savings;
	    double checking;
	    double withdraw;
	    double transfer;
		

	public void test() {
	    System.out.println("Hi.");
	}
	//////////////////////////////////////////////////
	//menu1
	public void menu1() {
	    System.out.println("Welcome to the null bank, we noticed you don't have an account, please select an option.");
	    System.out.println("Please note that if you create a checking or savings account, you need to have a minimum deposit of 100.00 dollars for checking account and 50.00 dollars for saving account.");
	    if(checking<100){
	        System.out.println("1.Open a new Checking Account");
	    }
	    if(savings<50){
	    System.out.println("2.Open a new Savings Account");
	    }
	    System.out.println("3.Exit");
	    if(checking>=100 && savings>=50){
            System.out.println("4.Continue on to banking.");
        }

	}
	//////////////////////////////////////////
	//menu2
	public void menu2() {
	    System.out.println("Please select a menu option.");
	    System.out.println("1.Deposit to Checking Account");
	    System.out.println("2.Withdraw from Checking");
	    System.out.println("3.Checking Balance");
	    System.out.println("4.Savings Balance");
	    System.out.println("5.Tranfer money");
	    System.out.println("6.Exit");
	}
	////////////////////////////////////////
	//menu3
	public void menu3() 
	{
		System.out.println("1.Checking");
		System.out.println("2.Savings");
		System.out.println("3.Return to main menu");
	}
	////////////////////////////////////////////
	//OpenChecking
	public void OpenChecking(double balance) 
	{
	    checking+=balance;
	    System.out.println(checking);
	} 
	/////////////////////////////////////////////
	//OpenSavings
	public void OpenSavings(double balance)
	{
	    savings+=balance;
	    System.out.println(savings);
	}
	////////////////////////////////////////////
	//Deposit savings
	public void DepositSavings(double balance)
	{
	    savings+=balance;
	}
	///////////////////////////////////////////
	//DepositChecking
	public void DepositChecking(double balance)
	{
	    checking+=balance;
	}
	/////////////////////////////////////////////
	//WithDrawSavings
	public void WithdrawSavings(double balance)
	{
	    savings-=balance;
	}
	////////////////////////////////////////////
	//WithdrawChecking
	public void WithdrawChecking(double balance)
	{
	    checking-=balance;
	}
	/////////////////////////////////////////////
	//Transfer to checking
	public void TransferToChecking(double balance) 
	{
		savings-=balance;
		checking+=balance;
	}
	///////////////////////////////////////////////
	//Transfer to savings
	public void TransferToSavings(double balance) 
	{
		checking-=balance;
		savings+=balance;
	}
	////////////////////////////////////////////////
	//return checking
	public double getChecking()
	{
	    return checking;//need it to return checking instead??
	}
	/////////////////////////////////////////////////
	//return savings
	public double getSavings()
	{
	    return savings;//need it to return savings instead??
	}
}



