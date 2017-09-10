package com.ddbin.swing.panel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class JSplitPaneDemo {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("测试程序");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		// 创建4个按钮
		JButton jB1 = new JButton("确定");
		JButton jB2 = new JButton("取消");
		JButton jB3 = new JButton("优秀");
		JButton jB4 = new JButton("良好");
		// 创建2个中间容器并设置为流布局
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp2.setLayout(new FlowLayout());
		// 将按钮放到对应的面板中
		jp1.add(jB1);
		jp1.add(jB2);
		jp2.add(jB3);
		jp2.add(jB4);

		// 创建分割面板
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOneTouchExpandable(true);// 让分隔线显示出箭头
		splitPane.setContinuousLayout(true);// 当用户操作分隔线箭头时，系统重绘图形
		splitPane.setPreferredSize(new Dimension(50, 100));
		splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);// 设置为水平分隔线
		splitPane.setLeftComponent(jp1);// 将jp1放到分隔线左边
		splitPane.setRightComponent(jp2);
		splitPane.setDividerSize(3);// 设置分隔线大小为3个单位
		splitPane.setDividerLocation(50);// 设置分隔线的位置位于中间

		// 与顶层容器关联
		jFrame.setContentPane(splitPane);
		jFrame.pack();

	}

}
