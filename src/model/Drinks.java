/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Phucdz
 */
public class Drinks {

	private int ID;
	private String Name;
	private int Price;
	private Date startDate;
	private Date endDate;

	public Drinks(int ID, String Name) {
		this.ID = ID;
		this.Name = Name;
	}

	public Drinks(int ID, String Name, int Price, Date startDate, Date endDate) {
		this.ID = ID;
		this.Name = Name;
		this.Price = Price;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int Price) {
		this.Price = Price;
		
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return Name;
	}
	

}
