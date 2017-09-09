package com.ddbin.swing.layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BoxLayoutFrame extends JFrame {
	private static final long serialVersionUID = 6560732450431098713L;
	// ����ߴ�
	private static final int WIDTH = 300;
	private static final int HEIGTH = 200;

	// ���캯��
	public BoxLayoutFrame() {
		// ���ñ궥�������Ĵ�С������
		setTitle("������ʽ���ֹ�����");
		setSize(WIDTH, HEIGTH);
		// ����һ���м�����
		Container container = getContentPane();

		// �����û����ı�ǩ���ı���
		JLabel nameLabel = new JLabel("������");
		JTextField nameInput = new JTextField(10);
		nameInput.setMaximumSize(nameInput.getPreferredSize());
		// ����һ��ˮƽ������,����ǩ���ı�����ӽ�ȥ
		Box hbox1 = Box.createHorizontalBox();
		hbox1.add(nameLabel);
		// ����һ���հ���������������������֮������г
		hbox1.add(Box.createHorizontalStrut(20));
		hbox1.add(nameInput);

		// ��������ı�ǩ���ı���
		JLabel passLabel = new JLabel("���룺");
		JTextField passInput = new JTextField(10);
		passInput.setMaximumSize(passInput.getPreferredSize());
		// ����һ��ˮƽ������,����ǩ���ı�����ӽ�ȥ
		Box hbox2 = Box.createHorizontalBox();
		hbox2.add(passLabel);
		// ����һ���հ���������������������֮������г
		hbox2.add(Box.createHorizontalStrut(20));
		hbox2.add(passInput);

		// ����������¼��صİ�ť
		JButton loginBtn = new JButton("ȷ��");
		JButton cancelBtn = new JButton("ȡ��");
		Box hbox3 = Box.createHorizontalBox();
		hbox3.add(loginBtn);
		hbox3.add(cancelBtn);

		// ����һ����ʽ���ӣ��������������ʽ����
		Box vbox = Box.createVerticalBox();
		vbox.add(hbox1);
		vbox.add(hbox2);
		vbox.add(Box.createVerticalGlue());// ����һ������Ľ�ˮ���
		vbox.add(hbox3);

		// ����ʽ���Ӽ��뵽container��
		container.add(vbox, BorderLayout.CENTER);
	}
}
