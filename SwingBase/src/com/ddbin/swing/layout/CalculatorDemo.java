package com.ddbin.swing.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorDemo {

	static final int WIDTH = 500;
	static final int HEIGTH = 500;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("计算器");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPane = new JPanel();
		JPanel btnsPane = new JPanel();
		jFrame.setContentPane(contentPane);
		// 创建显示输入的文本框
		JPanel textPane = new JPanel();
		JTextField inputInfo = new JTextField(20);
		inputInfo.setToolTipText("输入的信息及结果会在这里显示");
		inputInfo.setFocusable(false);	//不聚焦，不允许用户在此字段输入，仅仅是程序更改
		textPane.setLayout(new FlowLayout());
		textPane.add(inputInfo);

		// 创建9个普通按钮
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jbAdd = new JButton("+");
		JButton jb4 = new JButton("4");

		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jbSub = new JButton("-");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jbMul = new JButton("*");
		JButton jb0 = new JButton("0");
		JButton jbP = new JButton(".");
		JButton jbPCT = new JButton("%");
		JButton jbDiv = new JButton("/");
		JButton jbBS = new JButton(" ");
		JButton jbEq = new JButton("=");
		JButton jbCE = new JButton("CE");
		JButton jbClear = new JButton("<=");

		// 按钮添加到面板中
		btnsPane.add(jb1);
		btnsPane.add(jb2);
		btnsPane.add(jb3);
		btnsPane.add(jbAdd);
		btnsPane.add(jbClear);
		btnsPane.add(jb4);

		btnsPane.add(jb5);
		btnsPane.add(jb6);
		btnsPane.add(jbSub);
		btnsPane.add(jbCE);
		btnsPane.add(jb7);
		btnsPane.add(jb8);
		btnsPane.add(jb9);
		btnsPane.add(jbMul);
		btnsPane.add(jbBS);
		btnsPane.add(jb0);
		btnsPane.add(jbP);
		btnsPane.add(jbPCT);

		btnsPane.add(jbDiv);
		btnsPane.add(jbEq);

		// 创建一个布局管理器对象 //窗口最大化会同步放大
		GridLayout grid = new GridLayout(4, 6); // 4行6列
		btnsPane.setLayout(grid);
		
		//将两个面板放到立式箱子里
		Box vbox = Box.createVerticalBox();
		vbox.add(textPane);
		vbox.add(btnsPane);

		//将立式箱子组件加入到主面板里
		contentPane.add(vbox, BorderLayout.CENTER);
		jFrame.pack();

	}

}
