package com.ddbin.swing.component2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JEditorPaneDemo2 {

	public static void main(String[] args) {
		JEditorPane editorPane = null;
		try {
			URL address = new URL("http://www.360.cn");
			editorPane = new JEditorPane(address);// 创建一个带URL地址JEditorPane组件
		} catch (MalformedURLException e) {
			System.out.println("Malformed URL:" + e);
		} catch (IOException e) {
			System.out.println("IOException :" + e);
		}
		JFrame frame = new JFrame("网页测试窗口");
		frame.setContentPane(new JScrollPane(editorPane));
		frame.setSize(200, 250);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

	}
}
