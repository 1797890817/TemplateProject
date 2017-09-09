package com.ddbin.swing.panel;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class JScrollPaneDemo {

	static final int WIDTH = 300;
	static final int HEIGTH = 250;

	public static void main(String[] args) {
		JFrame jf = new JFrame("JScrollPaneDemo");
		jf.setSize(WIDTH, HEIGTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		// �����ı������
		JTextArea jTextArea = new JTextArea();
		jTextArea.setText("�����ı������--����һ�����������--������������붥����������!");
		// ����һ�����������
		// JScrollPane jsp = new JScrollPane(jTextArea);
		// һֱ��ʾˮƽ����ֱ�Ĺ�������ע�����˳���ܴ�
		JScrollPane jsp = new JScrollPane(jTextArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		// ������������붥����������
		jf.setContentPane(jsp);
		// ����ȱ�㣺�ı����ݲ���������ʾ�������ı䴰�ڴ�С����ɼ���ԭ������

	}

}
