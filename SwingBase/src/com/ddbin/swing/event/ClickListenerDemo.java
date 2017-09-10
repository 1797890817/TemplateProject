package com.ddbin.swing.event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClickListenerDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	JButton button;

	// ���캯��
	public ClickListenerDemo(String str) {
		super(str);
		
		button = new JButton("ȷ��");
		add(button);
		// ��Ӽ���������
		ActionListener ah = new ActionHandler();
		button.addActionListener(ah);

	}

	public static void main(String[] args) {
		ClickListenerDemo cld = new ClickListenerDemo("�����¼����Գ���");
		cld.pack();
		cld.setVisible(true);
	}

	class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			button.setText("ȡ��");
			button.setBackground(Color.GREEN);
		}
	}
}
