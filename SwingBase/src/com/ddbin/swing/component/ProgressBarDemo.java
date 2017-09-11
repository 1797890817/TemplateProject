package com.ddbin.swing.component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBarDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) throws Exception {

		JFrame jf = new JFrame("���������Գ���");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(WIDTH, HEIGTH);
		jf.setVisible(true); // û����һ�г�����ʾ

		// ���������
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);

		// ����������
		JProgressBar pb = new JProgressBar();
		// ����һ������Ľ�����
		// JProgressBar pb = new JProgressBar(JProgressBar.VERTICAL);
		contentPane.add(pb);

		// ���ý����������ֵ��Сֵ
		pb.setMaximum(10);
		pb.setMinimum(1);

		// ģ��������Ĺ���
		int i = 0;
		while (i <= 10) {
			Thread.sleep(1000); // ���ȴ��Ļ����ܿ�����н�����������Ч��
			pb.setValue(i);
			i++;
		}

	}

}
