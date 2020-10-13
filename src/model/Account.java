/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Phucdz
 */
public class Account {

	private int ID;
	private String username;
	private String password;
	private String name;

	public Account() {
	}

	public Account(int ID, String username, String password, String name) {
		this.ID = ID;
		this.username = username;
		this.password = password;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void inputInfomation(){
		Scanner input = new Scanner(System.in);
		System.out.println("Input username: ");
		username = input.nextLine();
		System.out.println("INput password: ");
		password = input.nextLine();
		System.out.println("Input Name: ");
		name = input.nextLine();
	}
	public void Login() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input username: ");
		username = input.nextLine();
		System.out.println("Input password");
		password = input.nextLine();
	}
	public void InputID() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input ID:");
		ID = input.nextInt();
	}
}
