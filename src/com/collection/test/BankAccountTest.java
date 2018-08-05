package com.collection.test;

import com.collection.BankAccountList;
import com.collection.SavingAccount;

public class BankAccountTest {
	
	public static void main(String args[]) {
		
		//Adds the SavingAcc objects to the list and removes and prints the results or changes in the result
		BankAccountList bankAccount= new BankAccountList();

		SavingAccount acc1=new SavingAccount(10000,59,"Sayali",false);
		SavingAccount acc2=new SavingAccount(20000,54,"Siddhi",true);
		SavingAccount acc3=new SavingAccount(15000,55,"Nishad",false);
		SavingAccount acc4=new SavingAccount(14000,58,"Mehek",true);
		SavingAccount acc5=new SavingAccount(16000,52,"Drishti",true);

		bankAccount.addAccount(acc1);
		bankAccount.addAccount(acc2);
		bankAccount.addAccount(acc3);
		bankAccount.addAccount(acc4);
		bankAccount.addAccount(acc5);
		
		bankAccount.bankAccountList.stream().forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------");

		bankAccount.removeAccount(acc3);
		bankAccount.removeAccount(acc5);

		bankAccount.bankAccountList.stream().forEach(System.out::println);


		
	}

}
