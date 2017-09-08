package com.ddbin.swing.demo;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Containers1 {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) throws Exception {
		JFrame jFrame = new JFrame("添加内容面板测试程序");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPanel = new JPanel();
		jFrame.setContentPane(contentPanel); // 设置到顶层容器中

		// 创建两个按钮组件，并添加到内容面板中
		JButton b1 = new JButton("确定");
		JButton b2 = new JButton("取消");
		contentPanel.add(b1);
		contentPanel.add(b2);

		// 创建按钮的提示文本
		b1.setToolTipText("这是一个确定按钮");
		b2.setToolTipText("这是一个取消按钮");

		// 绘制b1按钮的边框
		b1.setBorder(BorderFactory.createLineBorder(Color.RED));

		// 创建标签
		JLabel label1 = new JLabel("这是一个测试标签");
		JLabel label2 = new JLabel("标签是一个不可UI编辑的空间");
		// 将标签加入到中间件
		contentPanel.add(label1);
		contentPanel.add(label2);

		Thread.sleep(3000L);	//3秒后修改内容，体验变化！
		// 使用标签内置的方法修改标签的文本
		label1.setText("AAAAA");
		label2.setText("BBBBB");

	}

}
