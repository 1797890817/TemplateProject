package com.ddbin.swing.iapp;

import javax.swing.JFrame;

public class MyApp {
	static final int WIDTH = 500;
	static final int HEIGTH = 300;

	public static void main(String[] args) {
		JFrame app = new JFrame("Linux系统管理");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(WIDTH, HEIGTH);
		app.setVisible(true);

	}

}
