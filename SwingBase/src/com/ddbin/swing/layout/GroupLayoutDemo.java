package com.ddbin.swing.layout;

import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GroupLayoutDemo extends JFrame {

	private static final long serialVersionUID = 1L;

	// 构造函数
	public GroupLayoutDemo() throws HeadlessException {
		// 创建一个中间容器和一个GroupLayout布局
		Container c = new Container();
		GroupLayout layout = new GroupLayout(c);
		// 创建两个按钮一个文本框组件
		JButton b1 = new JButton("按钮1");
		JButton b2 = new JButton("按钮2");
		JTextField text = new JTextField("文本");

		// 创建一个hsg组，将两个按钮添加到组里面--串行组
		GroupLayout.SequentialGroup hsg = layout.createSequentialGroup();
		hsg.addComponent(b1);
		hsg.addComponent(b2);

		// 平行组
		GroupLayout.ParallelGroup hpg = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
		hpg.addComponent(text).addGroup(hsg);
		layout.setHorizontalGroup(hpg);// 沿水平线确定hpg组中两个按钮的位置

		GroupLayout.ParallelGroup vpg = layout.createParallelGroup();
		vpg.addComponent(b1);
		vpg.addComponent(b2);

		// 添加文本域的同时，添加另一个组
		GroupLayout.SequentialGroup vsg = layout.createSequentialGroup();
		vsg.addComponent(text).addGroup(vpg);

		layout.setVerticalGroup(vsg);
		this.setLayout(layout);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();

	}

	// 不能正常运行
	public static void main(String[] args) {
		GroupLayoutDemo gld = new GroupLayoutDemo();
		gld.setVisible(true);
		
	}

}
