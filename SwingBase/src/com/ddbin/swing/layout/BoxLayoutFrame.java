package com.ddbin.swing.layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BoxLayoutFrame extends JFrame {
	private static final long serialVersionUID = 6560732450431098713L;
	// 定义尺寸
	private static final int WIDTH = 300;
	private static final int HEIGTH = 200;

	// 构造函数
	public BoxLayoutFrame() {
		// 设置标顶层容器的大小和名称
		setTitle("测试箱式布局管理器");
		setSize(WIDTH, HEIGTH);
		// 创建一个中间容器
		Container container = getContentPane();

		// 创建用户名的标签和文本域
		JLabel nameLabel = new JLabel("姓名：");
		JTextField nameInput = new JTextField(10);
		nameInput.setMaximumSize(nameInput.getPreferredSize());
		// 创建一个水平的箱子,将标签和文本域添加进去
		Box hbox1 = Box.createHorizontalBox();
		hbox1.add(nameLabel);
		// 创建一个空白组件用于让左右两个组件之间距离和谐
		hbox1.add(Box.createHorizontalStrut(20));
		hbox1.add(nameInput);

		// 创建密码的标签和文本域
		JLabel passLabel = new JLabel("密码：");
		JTextField passInput = new JTextField(10);
		passInput.setMaximumSize(passInput.getPreferredSize());
		// 创建一个水平的箱子,将标签和文本域添加进去
		Box hbox2 = Box.createHorizontalBox();
		hbox2.add(passLabel);
		// 创建一个空白组件用于让左右两个组件之间距离和谐
		hbox2.add(Box.createHorizontalStrut(20));
		hbox2.add(passInput);

		// 创建两个登录相关的按钮
		JButton loginBtn = new JButton("确定");
		JButton cancelBtn = new JButton("取消");
		Box hbox3 = Box.createHorizontalBox();
		hbox3.add(loginBtn);
		hbox3.add(cancelBtn);

		// 创建一个立式箱子，用来存放两个横式箱子
		Box vbox = Box.createVerticalBox();
		vbox.add(hbox1);
		vbox.add(hbox2);
		vbox.add(Box.createVerticalGlue());// 创建一个横向的胶水组件
		vbox.add(hbox3);

		// 将立式箱子加入到container中
		container.add(vbox, BorderLayout.CENTER);
	}
}
