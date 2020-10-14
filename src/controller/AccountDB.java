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
		if (instance == null) {
			instance = new AccountDB();
		}
		return instance;
	}

	public static void setInstance() {
		AccountDB.instance = instance;
	}

	public static Boolean Login(String username, String password) throws Exception {
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Select * from Account Where username=? And password=?";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet result = preparedStatement.executeQuery();
		return result.next();
	}

	public Account GetAccount() {
		return account;
	}

	public static List<Account> listAccount() throws Exception {
		List<Account> listAccount = new ArrayList<>();
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Select * from Account";
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(state);
		while (result.next()) {
			Account account = new Account(result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
			listAccount.add(account);
		}
		return listAccount;
	}

	public static Boolean Add(String username, String password, String name) throws Exception {
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Insert into Account(username, password, name) values(?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, name);
		int result = preparedStatement.executeUpdate();
		return result > 0;
	}

	public static Boolean Update(int ID, String password, String name) throws Exception {
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Update Account Set password=?, name=?, id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setString(1, password);
		preparedStatement.setString(2, name);
		preparedStatement.setInt(3, ID);
		int result = preparedStatement.executeUpdate();
		return result > 0;
	}

	public static Boolean Delete(int ID) throws Exception {
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Delete From Account Where ID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setInt(1, ID);
		int result = preparedStatement.executeUpdate();
		return result > 0;
	}

	public static Boolean ChangePassword(int ID, String password) throws Exception {
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Update Account Set password=? where ID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setString(1, password);
		preparedStatement.setInt(2, ID);
		int result = preparedStatement.executeUpdate();
		return result > 0;
	}

	@Override
	public String toString() {
		return super.toString(); //To change body of generated methods, choose Tools | Templates.
	}
	
	
}
