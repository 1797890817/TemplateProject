package com.ddbin.swing.demo;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ButtonDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) throws Exception {
		JFrame jFrame = new JFrame("������������Գ���");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPanel = new JPanel();
		jFrame.setContentPane(contentPanel); // ���õ�����������

		// ������ѡ��ť
		JLabel action = new JLabel("��ѡ��");
		contentPanel.add(action);
		JRadioButton radioButton1 = new JRadioButton("����");
		JRadioButton radioButton2 = new JRadioButton("����");
		JRadioButton radioButton3 = new JRadioButton("����");
		// ������ť��
		ButtonGroup bg = new ButtonGroup();
		// ����ѡ��ť�ŵ���ť����
		bg.add(radioButton1);
		bg.add(radioButton2);
		bg.add(radioButton3);
		// ����ѡ��ť�ӵ������
		contentPanel.add(radioButton1);
		contentPanel.add(radioButton2);
		contentPanel.add(radioButton3);

		// ʹ�ø�ѡ��
		JLabel hobby = new JLabel("��Ȥ��");
		contentPanel.add(hobby);
		JCheckBox checkBox1 = new JCheckBox("��ë��");
		JCheckBox checkBox2 = new JCheckBox("����");
		JCheckBox checkBox3 = new JCheckBox("������");
		JCheckBox checkBox4 = new JCheckBox("��ѧ��");
		JCheckBox checkBox5 = new JCheckBox("��Ӱ");
		JCheckBox checkBox6 = new JCheckBox("¼��");
		// ����ѡ��������뵽�����
		contentPanel.add(checkBox1);
		contentPanel.add(checkBox2);
		contentPanel.add(checkBox3);
		contentPanel.add(checkBox4);
		contentPanel.add(checkBox5);
		contentPanel.add(checkBox6);

	}

}
