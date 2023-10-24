package Transaction;

import java.util.Map;

import Account.Account;
import generic.Generic;

public class Transaction {
	
    //Fetching the details of account stored in map 
	static Map<Long, Account> map = Generic.getAllAccounts();
	
    //method() to deposit amount using account number 
 	public static void deposit(long accNmbr, double deposit) {
 		//checking account number that user has provided exist in map or not 
		if(map.containsKey(accNmbr)) {
			// amount will be deposited to the account mapped with account number that has user provided   
			double bal = map.get(accNmbr).getAccbalance() + deposit;
			map.get(accNmbr).setAccbalance(bal);
		} else {
			System.out.println("Account number does not match. Please try with another one!!!");
		}
	}

 	//method() to transfer amount using account number one account to other 
	public static void transfer(long accNmbr1, long accNmbr2, double amount) {
		//checking account number that user has provided exist in map or not 
		if(map.containsKey(accNmbr1) && map.containsKey(accNmbr2)) {
			//checking account number that user is given, account balance is greater then user amount 
			if(map.get(accNmbr1).getAccbalance() > amount) {
				// amount will be transfered b/w the accounts mapped with account number that has user provided
				double bal1 = map.get(accNmbr1).getAccbalance() - amount;
				double bal2 = map.get(accNmbr2).getAccbalance() + amount;
				
				map.get(accNmbr1).setAccbalance(bal1);
				map.get(accNmbr2).setAccbalance(bal2);
				System.out.println("Amount is succesfully transferred from " + accNmbr1 + " to " + accNmbr2);
			}
		} else {
			System.out.println("Account number does not match. Please try with another one!!!");
		}
	}
     // //method() to view account balance  amount using account number and account holder name
	public static void viewbalance(String name, long accNmbr) {
		//checking account number and account holder name that user has provided exist in map or not 
		if(map.containsKey(accNmbr) && map.get(accNmbr).getAccholdername().equals(name)) {
				System.out.println("Your current account balance is: " + map.get(accNmbr).getAccbalance());
		} else {
			System.out.println("Account number does not match. Please try with another one!!!");
		}
	}

	//method() to withdraw amount using account number 
	public static void withdraw(long accNmbr, double amount) {
		//checking account number that user has provided exist in map or not 
		if(map.containsKey(accNmbr)) {
			//checking account number that user is given, account balance is greater then user amount 
			if(map.get(accNmbr).getAccbalance() > amount) {
				// amount will be withdraw to the account mapped with account number that has user provided 
				double bal = map.get(accNmbr).getAccbalance() - amount;
				map.get(accNmbr).setAccbalance(bal);
			}
		} else {
			System.out.println("Account number does not match. Please try with another one!!!");
		}
	}
}
