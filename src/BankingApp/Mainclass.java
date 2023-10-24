package BankingApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Transaction.InputData;

public class Mainclass {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Redirecting to welcome method for further execution
		Mainclass.welcome();
	}
	
	public static void welcome() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//options
		System.out.println("Hello to this Banking application!!!");
		
//		using flag Statement to Break out of the while loop
		boolean flag = true;
		while(flag) {
//			Here we have provided few options to the user to choose related to transaction management
			System.out.println("Select any (out of below 4 options) : ");
			System.out.println("1. Create an account");
			System.out.println("2. Deposite a amount");
			System.out.println("3. Withdrawal of amount");
			System.out.println("4. View account balance");
			System.out.println("5. Transfer from one account to another");
			System.out.println("6. Exit the application");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int option = Integer.parseInt(br.readLine());
			
			if(option != 6)
//				Redirecting the user to desired input section
				InputData.input(option);
			else flag = false;
		}
	}
}
