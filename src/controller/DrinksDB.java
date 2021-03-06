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
import model.Drinks;

/**
 *
 * @author Phucdz
 */
public class DrinksDB {
	public static DrinksDB instance;

	public DrinksDB() {
	}
	

	public static DrinksDB getInstance() {
		if(instance == null) {
			instance = new DrinksDB();
		}
		return instance;
	}
	public static List<Drinks> GetAllDrinks() throws Exception{
		List<Drinks> listDrinks = new ArrayList<>();
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Select * from Drinks";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		ResultSet result = preparedStatement.executeQuery();
		while(result.next()) {
			Drinks drinks = new Drinks(result.getInt(1), result.getString(2), result.getInt(3),result.getDate(4), result.getDate(5));
			listDrinks.add(drinks);
		}
		return listDrinks;
	}
	public static List<Drinks> ChooseProduct(int ID) throws Exception {
		List<Drinks> listResult = new ArrayList<>();
		Connection connection = controller.ConnectDatabase.ConnectMySQLSever();
		String state = "Select Name,Prices from Drinks Where ID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(state);
		preparedStatement.setInt(1, ID);
		ResultSet result = preparedStatement.executeQuery();
		
		if(result.next()) {
			Drinks drinks = new Drinks(result.getString(1), result.getInt(2));
			listResult.add(drinks);
		}
		return listResult;	
	}
}
