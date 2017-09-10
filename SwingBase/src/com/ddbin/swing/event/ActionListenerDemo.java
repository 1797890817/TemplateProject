package com.ddbin.swing.event;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionListenerDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;
	static JTextField textField = new JTextField(20);

	public static void main(String[] args) {
		JFrame jf = new JFrame("事件测试程序");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(WIDTH, HEIGTH);
		jf.setVisible(true);

		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		jf.setContentPane(contentPane);

		// 给文本添加默认的内容
		textField.setText("这是默认的文本内容");

		// 创建按钮
		JButton clearBtn = new JButton("清空文本中的内容");
		contentPane.add(textField, BorderLayout.NORTH);
		contentPane.add(clearBtn, BorderLayout.SOUTH);

		// 创建一个事件监听器
		ActionListener ac = new ActionHandler();
		clearBtn.addActionListener(ac);// 向事件源注册

	}

}
