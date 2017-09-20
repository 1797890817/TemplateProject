package com.ddbin.swing.component2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JEditorPaneDemo {

	public static void main(String[] args) {
		String string = new String("����һ������Ա.\n����һ������ĳ���Ա��\n ����һ�������JAVA����Ա��");
		// ����һ��JEditorPane�������stringΪ���ݣ���text/plainΪ��ʽ
		JEditorPane editorPane = new JEditorPane("text/plain", string);
		editorPane.setEditable(false);
		JFrame frame = new JFrame("JEditorPane2");
		frame.setContentPane(new JScrollPane(editorPane));
		frame.pack();
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
	}
}
