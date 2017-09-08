package com.ddbin.swing.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("测试布局程序");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPane = new JPanel();
		jFrame.setContentPane(contentPane);

		// 创建25个普通按钮
		JButton jButton1 = new JButton("生活");
		JButton jButton2 = new JButton("工作");
		JButton jButton3 = new JButton("睡觉");
		JButton jButton4 = new JButton("购物");
		JButton jButton5 = new JButton("饮食");

		JButton jButton6 = new JButton("港币");
		JButton jButton7 = new JButton("人民币");
		JButton jButton8 = new JButton("美元");
		JButton jButton9 = new JButton("欧元");

		// 创建一个布局管理器对象 //窗口最大化会同步放大
		GridLayout grid = new GridLayout(3, 3); // 3行3列
		jFrame.setLayout(grid);

		// 按钮添加到面板中
		contentPane.add(jButton1);
		contentPane.add(jButton2);
		contentPane.add(jButton3);
		contentPane.add(jButton4);
		contentPane.add(jButton5);

		contentPane.add(jButton6);
		contentPane.add(jButton7);
		contentPane.add(jButton8);
		contentPane.add(jButton9);

		jFrame.pack();
	}
}
