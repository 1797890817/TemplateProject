package com.ddbin.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// ���ı�����Ϊ�մ�
		new ActionListenerDemo().textField.setText("");

	}

}
