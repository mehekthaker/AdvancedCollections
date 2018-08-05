package com.collection;

import java.util.Set;
import java.util.TreeSet;

//Creates a TreeSet of Bank Account and contains add/remove methods for accounts
public class BankAccountList {


		public Set<Object> bankAccountList = new TreeSet<>();

		public void addAccount(SavingAccount account)
		{
			bankAccountList.add(account);
		}

		public void removeAccount(SavingAccount account)
		{
			bankAccountList.remove(account);
		}

	
}
