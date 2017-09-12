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

		// 创建一个时间格式化类
		DateFormat format = new SimpleDateFormat("yyyy--MM--dd");
		DateFormatter df = new DateFormatter(format);
		// 创建一个显示时间格式的文本框
		JFormattedTextField ftf1 = new JFormattedTextField(df);
		ftf1.setValue(new Date());
		content.add(ftf1);

		// IP地址的格式
		MaskFormatter mf1 = new MaskFormatter("###.###.###.###");
		// 通过掩码的形式设置文本框中显示数据的格式
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
