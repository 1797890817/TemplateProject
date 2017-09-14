package com.ddbin.swing.component2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaDemo implements ActionListener {

	JTextArea textArea = null;
	JButton button1, button2, button3;

	// 构造函数
	public JTextAreaDemo() {

		JFrame jFrame = new JFrame("测试文本域");
		Container contentPane = jFrame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		// 创建一个文本域对象，长度为10个字符，宽度为15字符
		textArea = new JTextArea(10, 15);
		// 创建一个滚动面板,将文本域组件放在里面，以便可以滚动观察
		JScrollPane scrollPane = new JScrollPane(textArea);

		// 创建一个容纳3个按钮的pane
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 3));

		// 创建3个按钮
		button1 = new JButton("复制");
		button2 = new JButton("粘贴");
		button3 = new JButton("剪切");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		// 将两个面板加到主面板里
		contentPane.add(scrollPane, BorderLayout.CENTER);
		contentPane.add(panel, BorderLayout.SOUTH);

		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new JTextAreaDemo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "复制":
			textArea.copy(); // 单击复制按钮则执行复制功能
			break;
		case "粘贴":
			textArea.paste();// 单击复制按钮则执行粘贴功能
			break;
		case "剪切":
			textArea.cut(); // 单击复制按钮则执行复制功能
			break;
		default:
			break;
		}
	}

}
