/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import java.util.Scanner;
import model.Account;

/**
 *
 * @author Phucdz
 */
public class CoffeManagement {
	static void ShowOptions() {
		System.out.println("1. Login");
		System.out.println("2. Manager");
		System.out.println("3. Exit");
	}
	static void loginMenu() {
		System.out.println("1. List Account");
		System.out.println("2. Add Account");
		System.out.println("3. Update Account");
		System.out.println("4. Delete Account");
		System.out.println("5. Change Password");
		System.out.println("6. Exit");
	}
	static void managerMenu() {
		System.out.println("1. Drinks");
		System.out.println("2. Tables");
		System.out.println("3. Invoice");
		System.out.println("4. Orders");
		System.out.println("5. Print Bill");
		System.out.println("6. Exit");
	}
	static void Drinks() {
		System.out.println("1. Show Menu");
		System.out.println("2. Choose Product");
		System.out.println("3. Exit");
	}
	static void Tables() {
		System.out.println("1. Show Tables");
		System.out.println("2. Exit");
	}
	static void Invoices() {
		System.out.println("1. Check Status Table");
		System.out.println("2. Insert");
		System.out.println("3. Update");
		System.out.println("4. Exit");
	}
	static void Orders() {
		System.out.println("1. Show list Orders");
		System.out.println("2. Inser Orders");
		System.out.println("3. Exit");
	}
//	ACCOUNT
	public static void ListAccount() throws Exception {
		List<Account> listAccount = controller.AccountDB.listAccount();
		for(int i = 0; i < listAccount.size(); i++) {
			System.out.println("ID: " + listAccount.get(i).getID());
			System.out.println("Username: " + listAccount.get(i).getUsername());
			System.out.println("Password: " + listAccount.get(i).getPassword());
			System.out.println("Name: " + listAccount.get(i).getName());
			System.out.println("");
		}
	}
	public static void AddAccount() throws Exception {
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		account.inputInfomation();
		boolean status = controller.AccountDB.Add(account.getUsername(), account.getPassword(), account.getName());
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choose = null;
		ShowOptions();
		while(true) {
			choose = input.nextLine();
			switch(choose) {
				case "1": 
					loginMenu();
					choose = input.nextLine();
					switch(choose) {
						case "1":
						case "2":
						case "3":
						case "4":
						case "5":
						case "6":
						default:
						loginMenu();
					}
				case "2":
					
			}
		}
	}
	
}
