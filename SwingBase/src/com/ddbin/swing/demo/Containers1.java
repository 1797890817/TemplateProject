package com.ddbin.swing.demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Containers1 {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
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

	}

}
