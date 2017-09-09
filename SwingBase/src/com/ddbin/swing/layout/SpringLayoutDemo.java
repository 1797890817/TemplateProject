package com.ddbin.swing.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class SpringLayoutDemo {

	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("SpringLayout���Գ���");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		// ��������panel
		JPanel contentPane = new JPanel();
		jFrame.setContentPane(contentPane);

		// ����һ����ǩ��������ť,�����뵽�����
		JLabel label = new JLabel("���Գ���");
		JButton button1 = new JButton("���Գ���ģ��1");
		JButton button2 = new JButton("���Գ���ģ��2");
		contentPane.add(label);
		contentPane.add(button1);
		contentPane.add(button2);

		// ����һ��SpringLayout���ֹ���������������Ϊ�м������Ĳ��ַ�ʽ
		SpringLayout lay = new SpringLayout();
		contentPane.setLayout(lay);

		// ���ÿ�������������߽�ľ���
		lay.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, contentPane);
		lay.putConstraint(SpringLayout.WEST, label, 85, SpringLayout.WEST, contentPane);
		lay.putConstraint(SpringLayout.EAST, label, 85, SpringLayout.EAST, contentPane);

		lay.putConstraint(SpringLayout.NORTH, button1, 55, SpringLayout.NORTH, contentPane);
		lay.putConstraint(SpringLayout.WEST, button1, 5, SpringLayout.WEST, contentPane);
		lay.putConstraint(SpringLayout.EAST, button1, 25, SpringLayout.EAST, contentPane);

		lay.putConstraint(SpringLayout.NORTH, button2, 105, SpringLayout.NORTH, contentPane);
		lay.putConstraint(SpringLayout.WEST, button2, 5, SpringLayout.WEST, contentPane);
		lay.putConstraint(SpringLayout.EAST, button2, 25, SpringLayout.EAST, contentPane);
	}

}
