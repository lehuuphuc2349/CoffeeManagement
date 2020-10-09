/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author Phucdz
 */
public class Invoices {

	private int id;
	private int accountID;
	private int tablesID;
	private int totalPrice;
	private Timestamp invoiceDate;
	private int status;

	public Invoices() {
	}

	public Invoices(int id, int accountID, int tablesID, int totalPrice, Timestamp invoiceDate, int status) {
		this.id = id;
		this.accountID = accountID;
		this.tablesID = tablesID;
		this.totalPrice = totalPrice;
		this.invoiceDate = invoiceDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public int getTablesID() {
		return tablesID;
	}

	public void setTablesID(int tablesID) {
		this.tablesID = tablesID;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Timestamp getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	




}
