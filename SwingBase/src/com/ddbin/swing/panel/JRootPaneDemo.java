package com.ddbin.swing.panel;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;

public class JRootPaneDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	static final int WIDTH = 600;
	static final int HEIGTH = 300;

	// 构造函数
	public JRootPaneDemo() {
		super("测试窗口");

		JRootPane rp = new JRootPane();
		super.setContentPane(rp);

		JMenuBar menuBar1 = new JMenuBar();
		rp.setJMenuBar(menuBar1);
		// 创建菜单栏子项
		JMenu menu1 = new JMenu("文件");
		JMenu menu2 = new JMenu("功能");
		JMenu menu3 = new JMenu("视图");
		JMenu menu4 = new JMenu("帮助");

		// 将一级菜单加入到菜单栏
		menuBar1.add(menu1);
		menuBar1.add(menu2);
		menuBar1.add(menu3);
		menuBar1.add(menu4);
		// 创建一级菜单的子项
		JMenuItem menuItem1 = new JMenuItem("打开");
		JMenuItem menuItem2 = new JMenuItem("保存");
		JMenuItem menuItem3 = new JMenuItem("打印");
		JMenuItem menuItem4 = new JMenuItem("退出");
		//
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menu1.addSeparator(); // 添加分隔符
		menu1.add(menuItem3);
		menu1.addSeparator();
		menu1.add(menuItem4);

		// 创建功能子菜单项
		JMenuItem menuItem5 = new JMenuItem("下载JDK");
		JMenuItem menuItem6 = new JMenuItem("安装JDK");
		JMenuItem menuItem7 = new JMenuItem("配置JDK");
		JMenuItem menuItem8 = new JMenuItem("测试JDK");
		// 加入到功能菜单
		menu2.add(menuItem5);
		menu2.add(menuItem6);
		menu2.add(menuItem7);
		menu2.add(menuItem8);

		JMenuItem menuItem9 = new JMenuItem("关于");
		menu4.add(menuItem9);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		new JRootPaneDemo();
	}

}
