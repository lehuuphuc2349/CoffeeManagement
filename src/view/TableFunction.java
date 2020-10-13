/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import model.Tables;

/**
 *
 * @author Phucdz
 */
public class TableFunction {
	public static void ShowTables() throws Exception {
		Tables tables = new Tables();
		List<Tables> listTables = controller.TablesDB.GetAllListTable();
		for(int i = 0; i < listTables.size(); i++) {
			System.out.println("Table ID: " + listTables.get(i).getTableID());
			System.out.println("Table Name: " + listTables.get(i).getTableName());
			System.out.println("Table Note: "+ listTables.get(i).getTableNote());
			System.out.println("Table Status: " + listTables.get(i).getTableStatus());
			System.out.println("");
		}
	}
}
