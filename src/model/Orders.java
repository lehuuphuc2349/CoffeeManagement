/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Phucdz
 */
public class Orders {
	private int id;
	private int drinksID;
	private int invoiceID;
	private int count;

	public Orders() {
	}

	public Orders(int id, int drinksID, int invoiceID, int count) {
		this.id = id;
		this.drinksID = drinksID;
		this.invoiceID = invoiceID;
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDrinksID() {
		return drinksID;
	}

	public void setDrinksID(int drinksID) {
		this.drinksID = drinksID;
	}

	public int getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
