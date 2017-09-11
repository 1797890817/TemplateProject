package com.ddbin.swing.component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JListDemo {

	public static void main(String[] args) {
		JFrame jf = new JFrame("JList Demo");
		jf.setSize(400, 300);
		jf.setLocation(0, 0);
		jf.setVisible(true);

		// ����һ�����
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		jf.setContentPane(contentPane);

		// ����һ���洢����������
		String[] names = { "С��", "С��", "С��", "С��", "СФ", "С��", "С��" };
		JList<String> list = new JList<String>(names);

		// ����һ����ʾѡ�еĵ��ı���
		JTextField tf = new JTextField();

		// �����������ӵ������
		contentPane.add(list, BorderLayout.NORTH);
		contentPane.add(tf, BorderLayout.SOUTH);

		// һֱ�ж��Ƿ���ѡ�е���Ŀ
		while (true) {
			// �趨�ı����ֵ
			String item = list.getSelectedValue();
			System.out.println(item);
			tf.setText(item);

		}

	}

}
