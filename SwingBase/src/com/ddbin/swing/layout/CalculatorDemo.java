package com.ddbin.swing.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorDemo {

	static final int WIDTH = 500;
	static final int HEIGTH = 500;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPane = new JPanel();
		JPanel btnsPane = new JPanel();
		jFrame.setContentPane(contentPane);
		// ������ʾ������ı���
		JPanel textPane = new JPanel();
		JTextField inputInfo = new JTextField(20);
		inputInfo.setToolTipText("�������Ϣ���������������ʾ");
		inputInfo.setFocusable(false);	//���۽����������û��ڴ��ֶ����룬�����ǳ������
		textPane.setLayout(new FlowLayout());
		textPane.add(inputInfo);

		// ����9����ͨ��ť
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jbAdd = new JButton("+");
		JButton jb4 = new JButton("4");

		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jbSub = new JButton("-");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jbMul = new JButton("*");
		JButton jb0 = new JButton("0");
		JButton jbP = new JButton(".");
		JButton jbPCT = new JButton("%");
		JButton jbDiv = new JButton("/");
		JButton jbBS = new JButton(" ");
		JButton jbEq = new JButton("=");
		JButton jbCE = new JButton("CE");
		JButton jbClear = new JButton("<=");

		// ��ť��ӵ������
		btnsPane.add(jb1);
		btnsPane.add(jb2);
		btnsPane.add(jb3);
		btnsPane.add(jbAdd);
		btnsPane.add(jbClear);
		btnsPane.add(jb4);

		btnsPane.add(jb5);
		btnsPane.add(jb6);
		btnsPane.add(jbSub);
		btnsPane.add(jbCE);
		btnsPane.add(jb7);
		btnsPane.add(jb8);
		btnsPane.add(jb9);
		btnsPane.add(jbMul);
		btnsPane.add(jbBS);
		btnsPane.add(jb0);
		btnsPane.add(jbP);
		btnsPane.add(jbPCT);

		btnsPane.add(jbDiv);
		btnsPane.add(jbEq);

		// ����һ�����ֹ��������� //������󻯻�ͬ���Ŵ�
		GridLayout grid = new GridLayout(4, 6); // 4��6��
		btnsPane.setLayout(grid);
		
		//���������ŵ���ʽ������
		Box vbox = Box.createVerticalBox();
		vbox.add(textPane);
		vbox.add(btnsPane);

		//����ʽ����������뵽�������
		contentPane.add(vbox, BorderLayout.CENTER);
		jFrame.pack();

	}

}
