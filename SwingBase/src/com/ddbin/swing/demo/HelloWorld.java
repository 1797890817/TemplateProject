package com.ddbin.swing.demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorld {

	public static void main(String[] args) {
		//��������---> �м�����---->�������
		//JFrame--->  jPanel---->jButton
		JFrame jFrame = new JFrame("���Դ���");	//������������
		JPanel jPanel = new JPanel();			//�����м�����
		jFrame.setContentPane(jPanel); 			//���м����������ڶ���������
		JButton jButton = new JButton("����һ�����԰�ť");	//����һ���������
		jPanel.add(jButton);					//����������������м�������
		
		JButton jButton2 = new JButton("\u8FD9\u662F\u7B2C\u4E8C\u4E2A\u6D4B\u8BD5\u6309\u94AE");
		jPanel.add(jButton2);
		jFrame.setVisible(true);				//���ö��������Ŀɼ���
	}

}
