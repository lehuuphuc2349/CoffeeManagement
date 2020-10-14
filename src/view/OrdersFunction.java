/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import java.util.Scanner;
import model.Orders;

/**
 *
 * @author Phucdz
 */
public class OrdersFunction {
	public static void ListOrders() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Invoices ID: ");
		int invoiceID = input.nextInt();
		List<Orders> list = controller.OrdersDB.ListOrders(invoiceID);
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				System.out.println("ID : " + list.get(i).getId());
				System.out.println("DrinksID: " + list.get(i).getDrinksID());
				System.out.println("InvoiceID: " + list.get(i).getInvoiceID());
				System.out.println("Count: " + list.get(i).getCount());
			}
		}
	}
	public static void Insert() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Drink Id:");
		int drinkID = input.nextInt();
		System.out.println("Input Invoice Id:");
		int invoiceID = input.nextInt();
		System.out.println("Input count: ");
		int count = input.nextInt();
		boolean result = controller.OrdersDB.Insert(drinkID, invoiceID, count);
		if(result == true) {
			System.out.println("Success..");
		} else {
			System.out.println("Fail");
		}
	}
}
