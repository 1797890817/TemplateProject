package com.ddbin.swing.demo;

import javax.swing.JFrame;

public class SwingDemo {
	static final int WIDTH = 300; // ���崰�ڵĿ��ֵ
	static final int HEIGTH = 200; // ���崰�ڵĸ߶�ֵ

	public static void main(String[] args) {
		// ����������
		JFrame jFrame = new JFrame("Hello Swing!");
		// �O�ô��ڵĴ�С
		jFrame.setSize(WIDTH, HEIGTH);
		// ���ùر��˳�
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڵĿɼ���
		jFrame.setVisible(true);

	}

}
