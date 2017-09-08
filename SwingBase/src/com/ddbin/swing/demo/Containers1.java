package com.ddbin.swing.demo;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Containers1 {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) throws Exception {
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

		// ������ť����ʾ�ı�
		b1.setToolTipText("����һ��ȷ����ť");
		b2.setToolTipText("����һ��ȡ����ť");

		// ����b1��ť�ı߿�
		b1.setBorder(BorderFactory.createLineBorder(Color.RED));

		// ������ǩ
		JLabel label1 = new JLabel("����һ�����Ա�ǩ");
		JLabel label2 = new JLabel("��ǩ��һ������UI�༭�Ŀռ�");
		// ����ǩ���뵽�м��
		contentPanel.add(label1);
		contentPanel.add(label2);

		Thread.sleep(3000L);	//3����޸����ݣ�����仯��
		// ʹ�ñ�ǩ���õķ����޸ı�ǩ���ı�
		label1.setText("AAAAA");
		label2.setText("BBBBB");

	}

}
