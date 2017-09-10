package com.ddbin.swing.event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionListenerDemo2 {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;
	static JTextField textField = new JTextField(20);

	public static void main(String[] args) {
		JFrame jf = new JFrame("�¼����Գ���2");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(WIDTH, HEIGTH);
		jf.setVisible(true);

		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		jf.setContentPane(contentPane);

		// ���ı����Ĭ�ϵ�����
		textField.setText("����Ĭ�ϵ��ı�����");

		// ������ť
		JButton clearBtn = new JButton("����ı��е�����");
		contentPane.add(textField, BorderLayout.NORTH);
		contentPane.add(clearBtn, BorderLayout.SOUTH);

		// ʹ�������ڲ���ķ�ʽ
		clearBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});// ���¼�Դע��

	}

}
