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
public class Tables {
	private int tableID;
	private String tableName;
	private String tableNote;
	private String tableStatus;

	public Tables() {
	}

	public Tables(int tableID, String tableName, String tableNote, String tableStatus) {
		this.tableID = tableID;
		this.tableName = tableName;
		this.tableNote = tableNote;
		this.tableStatus = tableStatus;
	}

	public int getTableID() {
		return tableID;
	}

	public void setTableID(int tableID) {
		this.tableID = tableID;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableNote() {
		return tableNote;
	}

	public void setTableNote(String tableNote) {
		this.tableNote = tableNote;
	}

	public String getTableStatus() {
		return tableStatus;
	}

	public void setTableStatus(String tableStatus) {
		this.tableStatus = tableStatus;
	}
	
	
}
