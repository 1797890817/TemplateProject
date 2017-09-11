package com.ddbin.swing.component;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboxBoxDemo {

	public static void main(String[] args) {
		JFrame jf = new JFrame("�����б��");

		Container contentPane = jf.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));

		// ����һ�������������������б�
		String[] s = { "÷��", "ĵ��", "õ��", "�¼�", "����", "�ջ�", "ӣ��" };
		// ����һ��Vector�������������б�
		Vector<String> v = new Vector<String>();
		// ��Vector�����Ԫ��
		v.add("�վ�");
		v.add("������");
		v.add("ϰ���");
		v.add("����...");
		v.add("������");
		v.add("Τ��÷�ܷ�");

		// �������鴴�������б��
		JComboBox<String> comboBox1 = new JComboBox<String>(s);
		// �������б�������Ԫ��
		comboBox1.addItem("ӳɽ��");
		comboBox1.setBorder(BorderFactory.createTitledBorder("��ϲ�����ֻ���"));

		// ����Vector���������б�
		JComboBox<String> comboBox2 = new JComboBox<>(v);
		comboBox2.setBorder(BorderFactory.createTitledBorder("����õ������أ�"));

		// �����������б����ӵ��������
		contentPane.add(comboBox1);
		contentPane.add(comboBox2);

		jf.pack();
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // �˳�JVM
			}
		});
	}
}
