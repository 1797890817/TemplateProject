package com.ddbin.swing.panel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 150;

	public static void main(String[] args) {

		JFrame jf = new JFrame("�����Գ���");
		jf.setSize(WIDTH, HEIGTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		// �������������
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		// ����5���м�����
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		// ��jp1-jp5��Ϊ������
		jp1.setLayout(new FlowLayout());
		jp2.setLayout(new FlowLayout());
		jp3.setLayout(new FlowLayout());
		jp4.setLayout(new FlowLayout());
		jp5.setLayout(new FlowLayout());

		// ����9����ͨ��ť���----˼���ɷ�ŵ�������
		JButton jb1 = new JButton("С��");
		JButton jb2 = new JButton("С��");
		JButton jb3 = new JButton("С��");
		JButton jb4 = new JButton("С��");
		JButton jb5 = new JButton("С��");
		JButton jb6 = new JButton("С��");
		JButton jb7 = new JButton("С��");
		JButton jb8 = new JButton("С��");
		JButton jb9 = new JButton("С��");

		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp3.add(jb5);
		jp3.add(jb6);
		jp4.add(jb7);
		jp4.add(jb8);
		jp5.add(jb9);

		// ��5���м���壬����BorderLayout���ַ�ʽ�ŵ��������
		contentPane.add(jp1, BorderLayout.NORTH);
		contentPane.add(jp2, BorderLayout.SOUTH);
		contentPane.add(jp3, BorderLayout.EAST);
		contentPane.add(jp4, BorderLayout.WEST);
		contentPane.add(jp5, BorderLayout.CENTER);

	}

}
