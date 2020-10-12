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
import model.Menu;

/**
 *
 * @author Phucdz
 */
public class MenuDB {

	private static MenuDB instance;

	public MenuDB() {
	}

	public static MenuDB getInstance() {
		if (instance == null) {
			instance = new MenuDB();
		}
		return instance;
	}

	public static void setInstance(MenuDB instance) {
		MenuDB.instance = instance;
	}

	public List<Menu> GetListMenuByTableID(int tableID) throws Exception {
		List<Menu> listMenu = new ArrayList<>();
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Select drinks.name, orders.count, drinks.price, orders.count*drinks.price as totalPrice From orders,invoice,drinks Where orders.invoiceID = invoice.ID And orders.drinksID = drinks.ID And Invoice.Status=0 And Invoice.tablesID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setInt(1, tableID);
		ResultSet result = preparedStatement.executeQuery();
		while (result.next()) {
			Menu menu = new Menu(result.getString(1), result.getInt(2), result.getInt(3), result.getInt(4));
			listMenu.add(menu);
		}
		return listMenu;
	}
}
