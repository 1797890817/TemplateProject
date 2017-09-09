package com.ddbin.swing.panel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 150;

	public static void main(String[] args) {

		JFrame jf = new JFrame("面板测试程序");
		jf.setSize(WIDTH, HEIGTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		// 创建主面板容器
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		// 创建5个中间容器
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		// 将jp1-jp5设为流布局
		jp1.setLayout(new FlowLayout());
		jp2.setLayout(new FlowLayout());
		jp3.setLayout(new FlowLayout());
		jp4.setLayout(new FlowLayout());
		jp5.setLayout(new FlowLayout());

		// 创建9个普通按钮组件----思考可否放到容器里
		JButton jb1 = new JButton("小赵");
		JButton jb2 = new JButton("小李");
		JButton jb3 = new JButton("小亮");
		JButton jb4 = new JButton("小王");
		JButton jb5 = new JButton("小敏");
		JButton jb6 = new JButton("小周");
		JButton jb7 = new JButton("小杜");
		JButton jb8 = new JButton("小邹");
		JButton jb9 = new JButton("小刘");

		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp3.add(jb5);
		jp3.add(jb6);
		jp4.add(jb7);
		jp4.add(jb8);
		jp5.add(jb9);

		// 将5个中间面板，按照BorderLayout布局方式放到主面板中
		contentPane.add(jp1, BorderLayout.NORTH);
		contentPane.add(jp2, BorderLayout.SOUTH);
		contentPane.add(jp3, BorderLayout.EAST);
		contentPane.add(jp4, BorderLayout.WEST);
		contentPane.add(jp5, BorderLayout.CENTER);

	}

}
