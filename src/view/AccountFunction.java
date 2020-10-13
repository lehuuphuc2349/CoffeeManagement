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
public class AccountFunction {
	public static void Login() throws Exception {
		Account account = new Account();
		account.Login();
		boolean result = controller.AccountDB.Login(account.getUsername(), account.getPassword());
		if(result == true) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
	}
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
	public static void UpdateAccount() throws Exception {
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		int id = account.getID();
		String password = account.getPassword();
		String name = account.getName();
		System.out.println("Input ID:");
		id = input.nextInt();
		System.out.println("Input Password:");
		password = input.nextLine();
		System.out.println("Input Name: ");
		name = input.nextLine();
		boolean result = controller.AccountDB.Update(id, password, name);
		if(result == true) {
			System.out.println("Success..");
		} else {
			System.out.println("Fail");
		}
	}
	public static void AddAccount() throws Exception {
		Account account = new Account();
		account.inputInfomation();
		boolean result = controller.AccountDB.Add(account.getUsername(), account.getPassword(), account.getName());
		if(result == true) {
			System.out.println("Success..");
		} else {
			System.out.println("Fail");
		}
	}
	public static void DeleteAccount() throws Exception {
		Account account = new Account();
		account.InputID();
		boolean result = controller.AccountDB.Delete(account.getID());
		if(result == true) {
			System.out.println("Success..");
		} else {
			System.out.println("Fail");
		}
	}
	public static void ChangePassword() throws Exception {
		Account account = new Account();
		int id = account.getID();
		String password = account.getPassword();
		Scanner input = new Scanner(System.in);
		System.out.println("Input ID: ");
		id = input.nextInt();
		System.out.println("Input Password: ");
		password = input.nextLine();
		boolean result = controller.AccountDB.ChangePassword(id, password);
		if(result == true) {
			System.out.println("Success..");
		} else {
			System.out.println("Fail");
		}
	}
}
