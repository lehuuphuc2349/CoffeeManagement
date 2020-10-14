/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import java.util.Scanner;
import model.Drinks;

/**
 *
 * @author Phucdz
 */
public class DrinksFunction {
	public static void ShowListDrinks() throws Exception {
		Drinks drinks = new Drinks();
		List<Drinks> listDrinks = controller.DrinksDB.GetAllDrinks();
		for(int i = 0; i < listDrinks.size(); i++) {
			System.out.println("1. ID: " + listDrinks.get(i).getID());
			System.out.println("2. Name: " + listDrinks.get(i).getName());
			System.out.println("3. Price: " + listDrinks.get(i).getPrice());
			System.out.println("4. Start Date: " + listDrinks.get(i).getStartDate());
			System.out.println("5. End Date: " + listDrinks.get(i).getEndDate());
			System.out.println("");
		}
	}
	public static void ChooseProdcut() throws Exception {
		Drinks drinks = new Drinks();
		Scanner input = new Scanner(System.in);
		System.out.println("Input ID:");
		int id = input.nextInt();
		List<Drinks> result = controller.DrinksDB.ChooseProduct(id);
		if(result != null) {
			System.out.println("1. Name: " + result.get(id).getName());
			System.out.println("2. Price: " + result.get(id).getPrice()) ;
		} else {
			System.out.println("Fail");
		}
		
	}
}
