package com.ddbin.swing.panel;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class JScrollPaneDemo {

	static final int WIDTH = 300;
	static final int HEIGTH = 250;

	public static void main(String[] args) {
		JFrame jf = new JFrame("JScrollPaneDemo");
		jf.setSize(WIDTH, HEIGTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		// 创建文本域组件
		JTextArea jTextArea = new JTextArea();
		jTextArea.setText("创建文本域组件--创建一个滚动条面板--将滚动条面板与顶级容器关联!");
		// 创建一个滚动条面板
		// JScrollPane jsp = new JScrollPane(jTextArea);
		// 一直显示水平和竖直的滚动条，注意参数顺序不能错
		JScrollPane jsp = new JScrollPane(jTextArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		// 将滚动条面板与顶级容器关联
		jf.setContentPane(jsp);
		// 发现缺点：文本内容不能立即显示出来。改变窗口大小后则可见，原因不明！

	}

}
