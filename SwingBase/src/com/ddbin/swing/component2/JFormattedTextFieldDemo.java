package com.ddbin.swing.component2;

import java.awt.Container;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.DateFormatter;
import javax.swing.text.MaskFormatter;

public class JFormattedTextFieldDemo {

	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("JFormattedTextFieldDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container content = frame.getContentPane();
		content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));

		// ����һ��ʱ���ʽ����
		DateFormat format = new SimpleDateFormat("yyyy--MM--dd");
		DateFormatter df = new DateFormatter(format);
		// ����һ����ʾʱ���ʽ���ı���
		JFormattedTextField ftf1 = new JFormattedTextField(df);
		ftf1.setValue(new Date());
		content.add(ftf1);

		// IP��ַ�ĸ�ʽ
		MaskFormatter mf1 = new MaskFormatter("###.###.###.###");
		// ͨ���������ʽ�����ı�������ʾ���ݵĸ�ʽ
		//mf1.setPlaceholderCharacter('.');
		JFormattedTextField ftf2 = new JFormattedTextField(mf1);
		content.add(ftf2);

		MaskFormatter mf2 = new MaskFormatter("(###)###_####");
		JFormattedTextField ftf3 = new JFormattedTextField(mf2);
		content.add(ftf3);
		frame.setSize(300, 100);
		frame.setVisible(true);

	}

}
