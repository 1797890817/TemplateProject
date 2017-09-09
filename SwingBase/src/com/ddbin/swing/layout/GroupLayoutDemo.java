package com.ddbin.swing.layout;

import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GroupLayoutDemo extends JFrame {

	private static final long serialVersionUID = 1L;

	// ���캯��
	public GroupLayoutDemo() throws HeadlessException {
		// ����һ���м�������һ��GroupLayout����
		Container c = new Container();
		GroupLayout layout = new GroupLayout(c);
		// ����������ťһ���ı������
		JButton b1 = new JButton("��ť1");
		JButton b2 = new JButton("��ť2");
		JTextField text = new JTextField("�ı�");

		// ����һ��hsg�飬��������ť��ӵ�������--������
		GroupLayout.SequentialGroup hsg = layout.createSequentialGroup();
		hsg.addComponent(b1);
		hsg.addComponent(b2);

		// ƽ����
		GroupLayout.ParallelGroup hpg = layout.createParallelGroup(GroupLayout.Alignment.CENTER);
		hpg.addComponent(text).addGroup(hsg);
		layout.setHorizontalGroup(hpg);// ��ˮƽ��ȷ��hpg����������ť��λ��

		GroupLayout.ParallelGroup vpg = layout.createParallelGroup();
		vpg.addComponent(b1);
		vpg.addComponent(b2);

		// ����ı����ͬʱ�������һ����
		GroupLayout.SequentialGroup vsg = layout.createSequentialGroup();
		vsg.addComponent(text).addGroup(vpg);

		layout.setVerticalGroup(vsg);
		this.setLayout(layout);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();

	}

	// ������������
	public static void main(String[] args) {
		GroupLayoutDemo gld = new GroupLayoutDemo();
		gld.setVisible(true);
		
	}

}
