package com.ddbin.swing.demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Containers1 {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������������Գ���");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPanel = new JPanel();
		jFrame.setContentPane(contentPanel); // ���õ�����������

		// ����������ť���������ӵ����������
		JButton b1 = new JButton("ȷ��");
		JButton b2 = new JButton("ȡ��");
		contentPanel.add(b1);
		contentPanel.add(b2);

	}

}
