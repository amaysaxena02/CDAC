package com.company;

import com.company.accounts.Account;
import com.company.hr.Employee;

class CompanyTest {
	public static void main(String[] args) {
		Account a = new Account();
		Employee e = new Employee();

		a.displayAccountDetails();

		System.out.println();

		e.displayEmployeeDetails();
	}
}