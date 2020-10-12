/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Phucdz
 */
public class InvoicesDB {
	private static InvoicesDB instance;

	public InvoicesDB() {
	}
	public static InvoicesDB getInvoicesDB() {
		if(instance == null) {
			instance = new InvoicesDB();
		}
		return instance;
	}
	public int getUnCheckInvoiceByTableID(int tableId) throws Exception{
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Select * from Invoice Where tablesID=? And Status=0";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setInt(1, tableId);
		ResultSet result = preparedStatement.executeQuery();
		if(result.next()) {
			return result.getInt(1);
		}
		return -1;
	}
	public Boolean Insert(int tableID, int accountID) throws Exception {
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Insert into Invoice(accountID, tablesID, status) Values('"+ accountID +		"'+'" + tableID + "',0)";
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate(state);
		if(result > 0) {
			return true;
		} else return false;
	}
	public void Update(int tableID, int totalPrice) throws Exception {
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Update invoice Set status=1, totalPrice=? Where ID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setInt(1, totalPrice);
		preparedStatement.setInt(2, tableID);
		preparedStatement.executeUpdate();
	}
	
}
