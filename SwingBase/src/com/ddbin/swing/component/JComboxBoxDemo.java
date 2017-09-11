package com.ddbin.swing.component;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboxBoxDemo {

	public static void main(String[] args) {
		JFrame jf = new JFrame("下拉列表框");

		Container contentPane = jf.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));

		// 创建一个数组用来构建下拉列表
		String[] s = { "梅花", "牡丹", "玫瑰", "月季", "茉莉", "菊花", "樱花" };
		// 创建一个Vector用来构建下拉列表
		Vector<String> v = new Vector<String>();
		// 向Vector中添加元素
		v.add("普京");
		v.add("特朗普");
		v.add("习大大");
		v.add("安倍...");
		v.add("铁娘子");
		v.add("韦德梅杰夫");

		// 利用数组创建下拉列表框
		JComboBox<String> comboBox1 = new JComboBox<String>(s);
		// 单独向列表框中添加元素
		comboBox1.addItem("映山红");
		comboBox1.setBorder(BorderFactory.createTitledBorder("您喜欢哪种花？"));

		// 利用Vector创建下拉列表
		JComboBox<String> comboBox2 = new JComboBox<>(v);
		comboBox2.setBorder(BorderFactory.createTitledBorder("你最好的朋友呢？"));

		// 将两个下拉列表框添加到主面板上
		contentPane.add(comboBox1);
		contentPane.add(comboBox2);

		jf.pack();
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 退出JVM
			}
		});
	}
}
