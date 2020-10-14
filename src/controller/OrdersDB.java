/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Orders;

/**
 *
 * @author Phucdz
 */
public class OrdersDB {

	private static OrdersDB instance;

	public OrdersDB() {
	}

	public static OrdersDB getInstanceB() {
		if (instance == null) {
			instance = new OrdersDB();
		}
		return instance;
	}

	public static List<Orders> ListOrders(int invoiceID) throws Exception {
		List<Orders> listOrders = new ArrayList<>();
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Select * from orders where invoiceID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setInt(1, invoiceID);
		ResultSet result = preparedStatement.executeQuery();
		while (result.next()) {
			Orders orders = new Orders(result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4));
			listOrders.add(orders);
		}
		return listOrders;

}

	public static sBoolean Insert(int drinkID, int invoiceID, int count) throws Exception {
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Insert into orders(drinkID, invoiceID, count) values(?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setInt(1, drinkID);
		preparedStatement.setInt(2, invoiceID);
		preparedStatement.setInt(3, count);
		int result = preparedStatement.executeUpdate();
		return result > 0;
	}

}
