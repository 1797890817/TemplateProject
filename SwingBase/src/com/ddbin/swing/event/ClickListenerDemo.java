package com.ddbin.swing.event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClickListenerDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	JButton button;

	// 构造函数
	public ClickListenerDemo(String str) {
		super(str);
		
		button = new JButton("确认");
		add(button);
		// 添加监听器对象
		ActionListener ah = new ActionHandler();
		button.addActionListener(ah);

	}

	public static void main(String[] args) {
		ClickListenerDemo cld = new ClickListenerDemo("单击事件测试程序");
		cld.pack();
		cld.setVisible(true);
	}

	class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			button.setText("取消");
			button.setBackground(Color.GREEN);
		}
	}
}
