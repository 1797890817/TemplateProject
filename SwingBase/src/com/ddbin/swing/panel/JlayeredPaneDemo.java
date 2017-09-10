package com.ddbin.swing.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class JlayeredPaneDemo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	static final int WIDTH = 500;
	static final int HEIGTH = 500;
	JLayeredPane lp = new JLayeredPane();
	static JButton b1 = new JButton("确定");
	static JButton b2 = new JButton("取消");

	// 构造函数
	public JlayeredPaneDemo() {
		// 设置顶层窗口的标题
		super("测试窗口");
		super.setContentPane(lp);
		// 给按钮添加监听器
		b1.addActionListener(this);
		b2.addActionListener(this);
		// 添加到层中
		lp.add(b1, new Integer(200));
		lp.add(b2, new Integer(300));
		// 设定出现的位置
		b1.setBounds(100, 100, 100, 100);
		b1.setVisible(true);
		b2.setBounds(50, 50, 100, 100);
		b2.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WIDTH, HEIGTH);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("确定")) {
			// 重新设定组件层数
			lp.setLayer(b1, 300);
			lp.setLayer(b2, 200);
		} else {
			// 重新设定组件层数
			lp.setLayer(b1, 200);
			lp.setLayer(b2, 300);
		}
	}

	public static void main(String[] args) {
		new JlayeredPaneDemo();
	}
}
