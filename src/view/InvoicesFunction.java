/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Invoices;

/**
 *
 * @author Phucdz
 */
public class InvoicesFunction {

	public static void CheckTableByID() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Table ID:");
		int tableID = input.nextInt();
		int result = controller.InvoicesDB.getUnCheckInvoiceByTableID(tableID);
		if (result != -1) {
			System.out.println("Status Table: " + result);
		} else {
			System.out.println("Fail");
		}
	}

	public static void Insert() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Input acccountID: ");
		int accountID = input.nextInt();
		System.out.println("Input tableID: ");
		int tableID = input.nextInt();
		boolean result = controller.InvoicesDB.Insert(tableID, accountID);
		if (result == true) {
			System.out.println("Success..");
		} else {
			System.out.println("Fail");
		}
	}

	public static void Update() throws Exception {
		Scanner input = new Scanner(System.in);
		int tableID = input.nextInt();
		System.out.println("Input totalPrice: ");
		int totalPrice = input.nextInt();
		boolean result = controller.InvoicesDB.Update(tableID, totalPrice);
		if (result == true) {
			System.out.println("Success..");
		} else {

			System.out.println("Fail");
		}
	}
}
