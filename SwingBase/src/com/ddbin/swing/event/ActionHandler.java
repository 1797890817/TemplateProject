package com.ddbin.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// 将文本域设为空串
		new ActionListenerDemo().textField.setText("");

	}

}
