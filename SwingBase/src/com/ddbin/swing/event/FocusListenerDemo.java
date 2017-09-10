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
	JButton button = new JButton("ȷ��");

	// ���캯��
	public FocusListenerDemo(String title) {
		super(title);
		add(info, BorderLayout.NORTH);
		add(tf, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		tf.addFocusListener(this);

	}

	@Override
	public void focusGained(FocusEvent e) {// ��ȡ������ʱ
		if (e.isTemporary()) {
			info.add("��ʱ�Ի�ý��㣡");
		} else {
			info.add("�����Ի�ý��㣡");
		}
	}

	@Override
	public void focusLost(FocusEvent e) { // ʧȥ����
		if (e.isTemporary()) {
			info.add("��ʱ��ʧȥ����");
		} else {
			info.add("������ʧȥ����");

		}
	}

	public static void main(String[] args) {
		FocusListenerDemo fld = new FocusListenerDemo("�����ȡ���Գ���");
		fld.pack();
		fld.setVisible(true);
	}

}
