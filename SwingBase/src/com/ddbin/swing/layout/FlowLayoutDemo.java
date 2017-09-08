package com.ddbin.swing.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo {
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
		FlowLayout layout = new FlowLayout();
		jFrame.setLayout(layout);

		// �������ť��ӵ������
		contentPane.add(jButton1);
		contentPane.add(jButton2);
		contentPane.add(jButton3);
		contentPane.add(jButton4);
		contentPane.add(jButton5);
		jFrame.pack();

	}

}
