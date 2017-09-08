package com.ddbin.swing.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("���Բ��ֳ���");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPane = new JPanel();
		jFrame.setContentPane(contentPane);

		// ������ť
		JButton jButton1 = new JButton("����");
		JButton jButton2 = new JButton("����");
		JButton jButton3 = new JButton("˯��");
		JButton jButton4 = new JButton("����");
		JButton jButton5 = new JButton("��ʳ");

		// ����һ�����ֹ���������
		BorderLayout layout = new BorderLayout();
		jFrame.setLayout(layout);

		// �������ť���ն�����������ӵ������
		contentPane.add(jButton1, BorderLayout.EAST);
		contentPane.add(jButton2, BorderLayout.SOUTH);
		contentPane.add(jButton3, BorderLayout.WEST);
		contentPane.add(jButton4, BorderLayout.NORTH);
		contentPane.add(jButton5, BorderLayout.CENTER);

	}

}
