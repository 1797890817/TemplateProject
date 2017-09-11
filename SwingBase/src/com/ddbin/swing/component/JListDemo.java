package com.ddbin.swing.component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JListDemo {

	public static void main(String[] args) {
		JFrame jf = new JFrame("JList Demo");
		jf.setSize(400, 300);
		jf.setLocation(0, 0);
		jf.setVisible(true);

		// 创建一个面板
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		jf.setContentPane(contentPane);

		// 创建一个存储姓名的数组
		String[] names = { "小李", "小张", "小赵", "小王", "小肖", "小吴", "小菜" };
		JList<String> list = new JList<String>(names);

		// 创建一个显示选中的的文本域
		JTextField tf = new JTextField();

		// 将两个组件添加到面板中
		contentPane.add(list, BorderLayout.NORTH);
		contentPane.add(tf, BorderLayout.SOUTH);

		// 一直判断是否有选中的项目
		while (true) {
			// 设定文本框的值
			String item = list.getSelectedValue();
			System.out.println(item);
			tf.setText(item);

		}

	}

}
