package com.ddbin.swing.demo;

import javax.swing.JFrame;

public class SwingDemo {
	static final int WIDTH = 300; // 定义窗口的宽度值
	static final int HEIGTH = 200; // 定义窗口的高度值

	public static void main(String[] args) {
		// 创建主窗口
		JFrame jFrame = new JFrame("Hello Swing!");
		// 設置窗口的大小
		jFrame.setSize(WIDTH, HEIGTH);
		// 设置关闭退出
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口的可见性
		jFrame.setVisible(true);

	}

}
