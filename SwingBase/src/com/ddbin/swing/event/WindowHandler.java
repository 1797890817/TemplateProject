package com.ddbin.swing.event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowHandler implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {

	}

	// 其他方法空实现就好，
	@Override
	public void windowClosing(WindowEvent e) {
		JButton button1 = new JButton("确定");
		JButton button2 = new JButton("取消");
		JLabel label = new JLabel("您确定关闭系统了吗？");
		// 创建一个对话框
		JDialog d = new JDialog((JFrame) e.getSource(), "关闭系统", true);
		d.setSize(200, 100);
		d.setLocation(0, 0);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout());
		p.add(button1);
		p.add(button2);
		
		d.add(p, BorderLayout.SOUTH);
		d.add(label, BorderLayout.CENTER);
		
		//设置可见性
		d.setVisible(true);
		p.setVisible(true);
		button1.setVisible(true);
		button2.setVisible(true);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

}
