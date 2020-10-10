/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
	
}
