package com.ddbin.swing.demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("ѧ������ϵͳ");
		jf.setSize(413, 284);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �����˵����������ӵ���������
		JMenuBar mb = new JMenuBar();
		jf.setJMenuBar(mb);

		// ����һ������˵���
		JMenu jMenu1 = new JMenu("�ļ�");
		JMenu jMenu2 = new JMenu("�༭");
		JMenu jMenu3 = new JMenu("��ͼ");

		// ��һ���˵���ӵ��˵�����
		mb.add(jMenu1);
		mb.add(jMenu2);
		mb.add(jMenu3);

		// ����һ���˵���Ӧ���Ӳ˵���
		JMenuItem jmItem1 = new JMenuItem("��");
		JMenuItem jmItem2 = new JMenuItem("����");
		JMenuItem jmItem3 = new JMenuItem("��ӡ");
		JMenuItem jmItem4 = new JMenuItem("�˳�");

		// ���Ӳ˵�����ӵ�һ���˵���
		jMenu1.add(jmItem1);
		jMenu1.add(jmItem2);
		jMenu1.addSeparator(); // ��Ӳ˵���֮��ķָ������
		jMenu1.add(jmItem3);
		jMenu1.addSeparator(); // ��Ӳ˵���֮��ķָ������
		jMenu1.add(jmItem4);

		jf.setVisible(true);

		// ����һ����ť
		JButton button = new JButton("����һ�����԰�ť���");
		// ����һ������ ��ť���������
		JPanel panel = new JPanel();
		panel.add(button);
		// �������ӵ�����������
		jf.setContentPane(panel);

	}

}
