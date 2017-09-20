package com.ddbin.swing.component2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JEditorPaneDemo {

	public static void main(String[] args) {
		String string = new String("我是一名程序员.\n我是一名优秀的程序员！\n 我是一名优秀的JAVA程序员！");
		// 创建一个JEditorPane组件，以string为内容，以text/plain为格式
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
