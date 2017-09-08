package com.ddbin.swing.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutDemo {
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

		// ����һ�����ֹ��������� //������󻯻�ͬ���Ŵ�
		GridLayout grid = new GridLayout(3, 3); // 3��3��
		jFrame.setLayout(grid);

		// ��ť��ӵ������
		contentPane.add(jButton1);
		contentPane.add(jButton2);
		contentPane.add(jButton3);
		contentPane.add(jButton4);
		contentPane.add(jButton5);

		contentPane.add(jButton6);
		contentPane.add(jButton7);
		contentPane.add(jButton8);
		contentPane.add(jButton9);

		jFrame.pack();
	}
}
