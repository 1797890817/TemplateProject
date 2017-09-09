package com.ddbin.swing.layout;

import javax.swing.JFrame;

public class TestBoxLayout {

	public static void main(String[] args) {
		BoxLayoutFrame frame = new BoxLayoutFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);// 不允许改变窗口大小

	}

}
