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

	// ����������ʵ�־ͺã�
	@Override
	public void windowClosing(WindowEvent e) {
		JButton button1 = new JButton("ȷ��");
		JButton button2 = new JButton("ȡ��");
		JLabel label = new JLabel("��ȷ���ر�ϵͳ����");
		// ����һ���Ի���
		JDialog d = new JDialog((JFrame) e.getSource(), "�ر�ϵͳ", true);
		d.setSize(200, 100);
		d.setLocation(0, 0);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout());
		p.add(button1);
		p.add(button2);
		
		d.add(p, BorderLayout.SOUTH);
		d.add(label, BorderLayout.CENTER);
		
		//���ÿɼ���
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
