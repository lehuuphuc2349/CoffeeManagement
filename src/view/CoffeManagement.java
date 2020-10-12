/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
	}
	static void managerMenu() {
		System.out.println("1. Drinks");
		System.out.println("2. Tables");
		System.out.println("3. Invoice");
		System.out.println("4. Orders");
	}
}
