package com.ddbin.swing.component2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaDemo implements ActionListener {

	JTextArea textArea = null;
	JButton button1, button2, button3;

	// ���캯��
	public JTextAreaDemo() {

		JFrame jFrame = new JFrame("�����ı���");
		Container contentPane = jFrame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		// ����һ���ı�����󣬳���Ϊ10���ַ������Ϊ15�ַ�
		textArea = new JTextArea(10, 15);
		// ����һ���������,���ı�������������棬�Ա���Թ����۲�
		JScrollPane scrollPane = new JScrollPane(textArea);

		// ����һ������3����ť��pane
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 3));

		// ����3����ť
		button1 = new JButton("����");
		button2 = new JButton("ճ��");
		button3 = new JButton("����");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		// ���������ӵ��������
		contentPane.add(scrollPane, BorderLayout.CENTER);
		contentPane.add(panel, BorderLayout.SOUTH);

		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new JTextAreaDemo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "����":
			textArea.copy(); // �������ư�ť��ִ�и��ƹ���
			break;
		case "ճ��":
			textArea.paste();// �������ư�ť��ִ��ճ������
			break;
		case "����":
			textArea.cut(); // �������ư�ť��ִ�и��ƹ���
			break;
		default:
			break;
		}
	}

}
