package com.ddbin.swing.panel;

import java.awt.FlowLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JInternalFrameDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 150;

	public static void main(String[] args) {
		JFrame jf = new JFrame("�����ڲ�����");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(WIDTH, HEIGTH);
		jf.setVisible(true);
		// ����һ���м���������ӵ����������У�����Ϊ������
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout());
		jf.setContentPane(contentPane);

		// ����һ������������������������ӵ��м�������
		JDesktopPane dp = new JDesktopPane();
		dp.setLayout(new FlowLayout());
		contentPane.add(dp);

		// ��������JInternalFrame����
		JInternalFrame jif1 = new JInternalFrame("�ڲ���һ������", true, true, true);
		JInternalFrame jif2 = new JInternalFrame("�ڲ��ڶ�������", true, true, true);
		// ����Ϊ������
		jif1.setLayout(new FlowLayout());
		jif2.setLayout(new FlowLayout());

		// ����6����ǩ
		JLabel label1 = new JLabel("�����ҵ�һ������");
		JLabel label2 = new JLabel("�������һ������");
		JLabel label3 = new JLabel("��ͬʱ������һ������");
		JLabel label4 = new JLabel("�����ҵڶ�������");
		JLabel label5 = new JLabel("������ڶ�������");
		JLabel label6 = new JLabel("��ͬʱҲ�����ڶ�������");
		// ����ǩ�ӵ���������
		jif1.add(label1);
		jif1.add(label2);
		jif1.add(label3);
		jif2.add(label4);
		jif2.add(label5);
		jif2.add(label6);
		// ���ÿɼ���
		jif1.setVisible(true);
		jif2.setVisible(true);

		dp.add(jif1);
		dp.add(jif2);
	}

}
