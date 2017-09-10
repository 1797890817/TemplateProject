package com.ddbin.swing.panel;

import java.awt.FlowLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JInternalFrameDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 150;

	public static void main(String[] args) {
		JFrame jf = new JFrame("测试内部窗口");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(WIDTH, HEIGTH);
		jf.setVisible(true);
		// 创建一个中间容器，添加到顶层容器中，并设为流布局
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout());
		jf.setContentPane(contentPane);

		// 创建一个虚拟桌面容器，并将其添加到中间容器中
		JDesktopPane dp = new JDesktopPane();
		dp.setLayout(new FlowLayout());
		contentPane.add(dp);

		// 创建两个JInternalFrame容器
		JInternalFrame jif1 = new JInternalFrame("内部第一个窗口", true, true, true);
		JInternalFrame jif2 = new JInternalFrame("内部第二个窗口", true, true, true);
		// 设置为流布局
		jif1.setLayout(new FlowLayout());
		jif2.setLayout(new FlowLayout());

		// 创建6个标签
		JLabel label1 = new JLabel("这是我第一个窗口");
		JLabel label2 = new JLabel("这是你第一个窗口");
		JLabel label3 = new JLabel("这同时是他第一个窗口");
		JLabel label4 = new JLabel("这是我第二个窗口");
		JLabel label5 = new JLabel("这是你第二个窗口");
		JLabel label6 = new JLabel("这同时也是他第二个窗口");
		// 将标签加到两个窗口
		jif1.add(label1);
		jif1.add(label2);
		jif1.add(label3);
		jif2.add(label4);
		jif2.add(label5);
		jif2.add(label6);
		// 设置可见性
		jif1.setVisible(true);
		jif2.setVisible(true);

		dp.add(jif1);
		dp.add(jif2);
	}

}
