package com.ddbin.swing.event;

import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowListenerDemo extends JFrame {

	private static final long serialVersionUID = 1L;

	// ���캯��
	public WindowListenerDemo() {
		super("�����¼����Գ���");

		// ��Ӵ��ڼ�����
		// WindowListener wh = new WindowHandler(); //ʹ��ʵ�ֽ�ڵķ�ʽ
		WindowListener wh = new WindowHandler2(); // ʹ���������ķ�ʽ
		addWindowListener(wh);

	}

	public static void main(String[] args) {
		WindowListenerDemo wld = new WindowListenerDemo();
		wld.setSize(300, 200);
		wld.setVisible(true);

	}

}
