package com.ddbin.swing.demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("学生管理系统");
		jf.setSize(413, 284);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 创建菜单条组件并添加到顶层容器
		JMenuBar mb = new JMenuBar();
		jf.setJMenuBar(mb);

		// 创建一级横向菜单项
		JMenu jMenu1 = new JMenu("文件");
		JMenu jMenu2 = new JMenu("编辑");
		JMenu jMenu3 = new JMenu("视图");

		// 将一级菜单添加到菜单栏中
		mb.add(jMenu1);
		mb.add(jMenu2);
		mb.add(jMenu3);

		// 创建一级菜单对应的子菜单项
		JMenuItem jmItem1 = new JMenuItem("打开");
		JMenuItem jmItem2 = new JMenuItem("保存");
		JMenuItem jmItem3 = new JMenuItem("打印");
		JMenuItem jmItem4 = new JMenuItem("退出");

		// 将子菜单项添加到一级菜单中
		jMenu1.add(jmItem1);
		jMenu1.add(jmItem2);
		jMenu1.addSeparator(); // 添加菜单项之间的分割线组件
		jMenu1.add(jmItem3);
		jMenu1.addSeparator(); // 添加菜单项之间的分割线组件
		jMenu1.add(jmItem4);

		jf.setVisible(true);

		// 创建一个按钮
		JButton button = new JButton("这是一个测试按钮组件");
		// 创建一个容纳 按钮的面板容器
		JPanel panel = new JPanel();
		panel.add(button);
		// 将面板添加到顶层容器中
		jf.setContentPane(panel);

	}

}
