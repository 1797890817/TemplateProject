package com.ddbin.swing.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class SpringLayoutDemo {

	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("SpringLayout测试程序");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		// 创建主体panel
		JPanel contentPane = new JPanel();
		jFrame.setContentPane(contentPane);

		// 创建一个标签，两个按钮,并加入到主面板
		JLabel label = new JLabel("测试程序");
		JButton button1 = new JButton("测试程序模块1");
		JButton button2 = new JButton("测试程序模块2");
		contentPane.add(label);
		contentPane.add(button1);
		contentPane.add(button2);

		// 创建一个SpringLayout布局管理器，并将其设为中间容器的布局方式
		SpringLayout lay = new SpringLayout();
		contentPane.setLayout(lay);

		// 针对每个组件设置其与边界的距离
		lay.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, contentPane);
		lay.putConstraint(SpringLayout.WEST, label, 85, SpringLayout.WEST, contentPane);
		lay.putConstraint(SpringLayout.EAST, label, 85, SpringLayout.EAST, contentPane);

		lay.putConstraint(SpringLayout.NORTH, button1, 55, SpringLayout.NORTH, contentPane);
		lay.putConstraint(SpringLayout.WEST, button1, 5, SpringLayout.WEST, contentPane);
		lay.putConstraint(SpringLayout.EAST, button1, 25, SpringLayout.EAST, contentPane);

		lay.putConstraint(SpringLayout.NORTH, button2, 105, SpringLayout.NORTH, contentPane);
		lay.putConstraint(SpringLayout.WEST, button2, 5, SpringLayout.WEST, contentPane);
		lay.putConstraint(SpringLayout.EAST, button2, 25, SpringLayout.EAST, contentPane);
	}

}
