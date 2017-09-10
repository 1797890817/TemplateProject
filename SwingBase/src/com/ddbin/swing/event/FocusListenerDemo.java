package com.ddbin.swing.event;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FocusListenerDemo extends JFrame implements FocusListener {

	private static final long serialVersionUID = 1L;
	List info = new List(10);
	JTextField tf = new JTextField("");
	JButton button = new JButton("确认");

	// 构造函数
	public FocusListenerDemo(String title) {
		super(title);
		add(info, BorderLayout.NORTH);
		add(tf, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		tf.addFocusListener(this);

	}

	@Override
	public void focusGained(FocusEvent e) {// 获取到焦点时
		if (e.isTemporary()) {
			info.add("暂时性获得焦点！");
		} else {
			info.add("永久性获得焦点！");
		}
	}

	@Override
	public void focusLost(FocusEvent e) { // 失去焦点
		if (e.isTemporary()) {
			info.add("暂时性失去焦点");
		} else {
			info.add("永久性失去焦点");

		}
	}

	public static void main(String[] args) {
		FocusListenerDemo fld = new FocusListenerDemo("焦点获取测试程序");
		fld.pack();
		fld.setVisible(true);
	}

}
