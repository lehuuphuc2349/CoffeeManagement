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
import java.util.ArrayList;
import java.util.List;
import model.Account;

/**
 *
 * @author Phucdz
 */
public class AccountDB {
	private static AccountDB instance;
	Account account = new Account();

	public AccountDB() {
	}
	
	public static AccountDB getInstance() {
		if(instance == null) {
			instance = new AccountDB();
		}
		return instance;
	}
	public static void setInstance() {
		AccountDB.instance = instance;
	}
	public Boolean Login(String username, String password) throws Exception{
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Select * from Account Where username=? And password=?";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet result = preparedStatement.executeQuery();
		if(result.next()) {
			return true;
		} else return false;
	} 
	public Account GetAccount() {
		return account;
	}
	
	public List<Account> listAccount() throws Exception {
		List<Account> listAccount = new ArrayList<>();
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Select * from Account";
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(state);
		while(result.next()) {
			Account account = new Account(result.getInt(1) , result.getString(2) , result.getString(3) , result.getString(4));
			listAccount.add(account);
		}
		return listAccount;
	}
	
}
