package com.ddbin.swing.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridFlowBorderLayoutDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("测试布局程序");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPane = new JPanel();
		jFrame.setContentPane(contentPane);

		// 创建25个普通按钮
		JButton jButton1 = new JButton("生活");
		JButton jButton2 = new JButton("工作");
		JButton jButton3 = new JButton("睡觉");
		JButton jButton4 = new JButton("购物");
		JButton jButton5 = new JButton("饮食");

		JButton jButton6 = new JButton("港币");
		JButton jButton7 = new JButton("人民币");
		JButton jButton8 = new JButton("美元");
		JButton jButton9 = new JButton("欧元");
		JButton jButton10 = new JButton("英镑");

		JButton jButton11 = new JButton("主板");
		JButton jButton12 = new JButton("内存");
		JButton jButton13 = new JButton("硬盘");
		JButton jButton14 = new JButton("显示器");
		JButton jButton15 = new JButton("鼠标");

		JButton jButton16 = new JButton("大米");
		JButton jButton17 = new JButton("蔬菜");
		JButton jButton18 = new JButton("稻子");
		JButton jButton19 = new JButton("猪肉");
		JButton jButton20 = new JButton("牛肉");

		JButton jButton21 = new JButton("面包");
		JButton jButton22 = new JButton("蛋糕");
		JButton jButton23 = new JButton("巧克力");
		JButton jButton24 = new JButton("奶酪");
		JButton jButton25 = new JButton("苹果派");

		// 创建一个布局管理器对象
		GridLayout layout = new GridLayout(3, 3);
		jFrame.setLayout(layout);

		// 创建5个中间容器，并将布局管理器设为BorderLayout
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		p3.setLayout(new FlowLayout()); // 这一个和其他的不一样
		p4.setLayout(new BorderLayout());
		p5.setLayout(new BorderLayout());
		// 将5个中间容器添加到上层中间容器
		contentPane.add(p1);
		contentPane.add(p2);
		contentPane.add(p3);
		contentPane.add(p4);
		contentPane.add(p5);

		// 将五个按钮添加到p1面板中
		p1.add(jButton1, BorderLayout.EAST);
		p1.add(jButton2, BorderLayout.SOUTH);
		p1.add(jButton3, BorderLayout.WEST);
		p1.add(jButton4, BorderLayout.NORTH);
		p1.add(jButton5, BorderLayout.CENTER);

		p2.add(jButton6, BorderLayout.EAST);
		p2.add(jButton7, BorderLayout.SOUTH);
		p2.add(jButton8, BorderLayout.WEST);
		p2.add(jButton9, BorderLayout.NORTH);
		p2.add(jButton10, BorderLayout.CENTER);

		p3.add(jButton11);
		p3.add(jButton12);
		p3.add(jButton13);
		p3.add(jButton14);
		p3.add(jButton15);

		p4.add(jButton16, BorderLayout.EAST);
		p4.add(jButton17, BorderLayout.SOUTH);
		p4.add(jButton18, BorderLayout.WEST);
		p4.add(jButton19, BorderLayout.NORTH);
		p4.add(jButton20, BorderLayout.CENTER);

		p5.add(jButton21, BorderLayout.EAST);
		p5.add(jButton22, BorderLayout.SOUTH);
		p5.add(jButton23, BorderLayout.WEST);
		p5.add(jButton24, BorderLayout.NORTH);
		p5.add(jButton25, BorderLayout.CENTER);
		jFrame.pack();

	}

}
