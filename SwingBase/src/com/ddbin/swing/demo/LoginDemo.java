package com.ddbin.swing.demo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 这是一个登录类，继承容器类
 */
public class LoginDemo extends JPanel {

	private static final long serialVersionUID = 1L;

	static final int WIDTH = 300; // 顶层框架的宽度
	static final int HIGTH = 150; // 顶层框架的高度

	JFrame loginFrame;

	// 按照网格布局方式，排列组件
	public void add(Component c, GridBagConstraints constraints, int x, int y, int w, int h) {
		constraints.gridx = x; // 指定位于第几列
		constraints.gridy = y; // 指定位于第几行
		constraints.gridwidth = w; // 控件需要占几列
		constraints.gridheight = h; // 控件需要占几行
		add(c, constraints);
	}

	// 构造函数
	public LoginDemo() {
		loginFrame = new JFrame("欢迎来到Java世界！");
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridBagLayout lay = new GridBagLayout(); // 网格布局管理器对象！
		setLayout(lay);
		loginFrame.add(this, BorderLayout.WEST);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int heigth = screenSize.height;

		int x = (width - WIDTH) / 2;
		int y = (heigth - HEIGHT) / 2;

		loginFrame.setLocation(x, y);
		JButton ok = new JButton("登录");
		JButton cancel = new JButton("取消");

		JLabel title = new JLabel("欢迎进入Java世界");
		JLabel name = new JLabel("用户名：");
		JLabel password = new JLabel("密码：");

		final JTextField nameInput = new JTextField(15);
		final JTextField passwordInput = new JTextField(15);

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 3;
		constraints.weighty = 4;
		add(title, constraints, 0, 0, 4, 1);
		add(name, constraints, 0, 1, 1, 1);
		add(password, constraints, 0, 2, 1, 1);

		add(nameInput, constraints, 2, 1, 1, 1);
		add(passwordInput, constraints, 2, 2, 1, 1);

		add(ok, constraints, 0, 3, 1, 1);
		add(cancel, constraints, 2, 3, 1, 1);

		loginFrame.setResizable(true);	// 是否可以改变窗口的大小
		loginFrame.setVisible(true); 	// 设置窗口的可见性
	}

	public static void main(String[] args) {
		LoginDemo loginDemo = new LoginDemo();
	}

}
