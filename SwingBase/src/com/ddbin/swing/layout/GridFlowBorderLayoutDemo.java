package com.ddbin.swing.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridFlowBorderLayoutDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("���Բ��ֳ���");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPane = new JPanel();
		jFrame.setContentPane(contentPane);

		// ����25����ͨ��ť
		JButton jButton1 = new JButton("����");
		JButton jButton2 = new JButton("����");
		JButton jButton3 = new JButton("˯��");
		JButton jButton4 = new JButton("����");
		JButton jButton5 = new JButton("��ʳ");

		JButton jButton6 = new JButton("�۱�");
		JButton jButton7 = new JButton("�����");
		JButton jButton8 = new JButton("��Ԫ");
		JButton jButton9 = new JButton("ŷԪ");
		JButton jButton10 = new JButton("Ӣ��");

		JButton jButton11 = new JButton("����");
		JButton jButton12 = new JButton("�ڴ�");
		JButton jButton13 = new JButton("Ӳ��");
		JButton jButton14 = new JButton("��ʾ��");
		JButton jButton15 = new JButton("���");

		JButton jButton16 = new JButton("����");
		JButton jButton17 = new JButton("�߲�");
		JButton jButton18 = new JButton("����");
		JButton jButton19 = new JButton("����");
		JButton jButton20 = new JButton("ţ��");

		JButton jButton21 = new JButton("���");
		JButton jButton22 = new JButton("����");
		JButton jButton23 = new JButton("�ɿ���");
		JButton jButton24 = new JButton("����");
		JButton jButton25 = new JButton("ƻ����");

		// ����һ�����ֹ���������
		GridLayout layout = new GridLayout(3, 3);
		jFrame.setLayout(layout);

		// ����5���м��������������ֹ�������ΪBorderLayout
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		p3.setLayout(new FlowLayout()); // ��һ���������Ĳ�һ��
		p4.setLayout(new BorderLayout());
		p5.setLayout(new BorderLayout());
		// ��5���м�������ӵ��ϲ��м�����
		contentPane.add(p1);
		contentPane.add(p2);
		contentPane.add(p3);
		contentPane.add(p4);
		contentPane.add(p5);

		// �������ť��ӵ�p1�����
		p1.add(jButton1, BorderLayout.EAST);
		p1.add(jButton2, BorderLayout.SOUTH);
		p1.add(jButton3, BorderLayout.WEST);
		p1.add(jButton4, BorderLayout.NORTH);
		p1.add(jButton5, BorderLayout.CENTER);

		p2.add(jButton6, BorderLayout.EAST);
		p2.add(jButton7, BorderLayout.SOUTH);
		p2.add(jButton8, BorderLayout.WEST);
		p2.add(jButton9, BorderLayout.NORTH);
		p2.add(jButton10, BorderLayout.CENTER);

		p3.add(jButton11);
		p3.add(jButton12);
		p3.add(jButton13);
		p3.add(jButton14);
		p3.add(jButton15);

		p4.add(jButton16, BorderLayout.EAST);
		p4.add(jButton17, BorderLayout.SOUTH);
		p4.add(jButton18, BorderLayout.WEST);
		p4.add(jButton19, BorderLayout.NORTH);
		p4.add(jButton20, BorderLayout.CENTER);

		p5.add(jButton21, BorderLayout.EAST);
		p5.add(jButton22, BorderLayout.SOUTH);
		p5.add(jButton23, BorderLayout.WEST);
		p5.add(jButton24, BorderLayout.NORTH);
		p5.add(jButton25, BorderLayout.CENTER);
		jFrame.pack();

	}

}
