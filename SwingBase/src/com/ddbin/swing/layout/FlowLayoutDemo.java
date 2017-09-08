package com.ddbin.swing.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("测试布局程序");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPane = new JPanel();
		jFrame.setContentPane(contentPane);

		// 创建按钮
		JButton jButton1 = new JButton("生活");
		JButton jButton2 = new JButton("工作");
		JButton jButton3 = new JButton("睡觉");
		JButton jButton4 = new JButton("购物");
		JButton jButton5 = new JButton("饮食");

		// 创建一个布局管理器对象
		FlowLayout layout = new FlowLayout();
		jFrame.setLayout(layout);

		// 将五个按钮添加到面板中
		contentPane.add(jButton1);
		contentPane.add(jButton2);
		contentPane.add(jButton3);
		contentPane.add(jButton4);
		contentPane.add(jButton5);
		jFrame.pack();

	}

}
