package com.ddbin.swing.panel;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;

public class JRootPaneDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	static final int WIDTH = 600;
	static final int HEIGTH = 300;

	// ���캯��
	public JRootPaneDemo() {
		super("���Դ���");

		JRootPane rp = new JRootPane();
		super.setContentPane(rp);

		JMenuBar menuBar1 = new JMenuBar();
		rp.setJMenuBar(menuBar1);
		// �����˵�������
		JMenu menu1 = new JMenu("�ļ�");
		JMenu menu2 = new JMenu("����");
		JMenu menu3 = new JMenu("��ͼ");
		JMenu menu4 = new JMenu("����");

		// ��һ���˵����뵽�˵���
		menuBar1.add(menu1);
		menuBar1.add(menu2);
		menuBar1.add(menu3);
		menuBar1.add(menu4);
		// ����һ���˵�������
		JMenuItem menuItem1 = new JMenuItem("��");
		JMenuItem menuItem2 = new JMenuItem("����");
		JMenuItem menuItem3 = new JMenuItem("��ӡ");
		JMenuItem menuItem4 = new JMenuItem("�˳�");
		//
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menu1.addSeparator(); // ��ӷָ���
		menu1.add(menuItem3);
		menu1.addSeparator();
		menu1.add(menuItem4);

		// ���������Ӳ˵���
		JMenuItem menuItem5 = new JMenuItem("����JDK");
		JMenuItem menuItem6 = new JMenuItem("��װJDK");
		JMenuItem menuItem7 = new JMenuItem("����JDK");
		JMenuItem menuItem8 = new JMenuItem("����JDK");
		// ���뵽���ܲ˵�
		menu2.add(menuItem5);
		menu2.add(menuItem6);
		menu2.add(menuItem7);
		menu2.add(menuItem8);

		JMenuItem menuItem9 = new JMenuItem("����");
		menu4.add(menuItem9);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		new JRootPaneDemo();
	}

}
