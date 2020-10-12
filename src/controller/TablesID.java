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
import model.Tables;

/**
 *
 * @author Phucdz
 */
public class TablesID {
	private static TablesID instance;

	public TablesID() {
	}

	public static TablesID getInstance() {
		if(instance == null) {
			instance = new TablesID();
		}
		return instance;
	}

	public static void setInstance(TablesID instance) {
		TablesID.instance = instance;
	}
	public List<Tables> GetAllListTable() throws Exception {
		List<Tables> listTables = new ArrayList<>();
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Select * from Tables";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		ResultSet result = preparedStatement.executeQuery();
		while(result.next()) {
			Tables tables = new Tables(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4) == 0 ? "Empty" : "Booked");
			listTables.add(tables);
		}
		return listTables;
	}
}
