package com.ddbin.swing.demo;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ButtonDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) throws Exception {
		JFrame jFrame = new JFrame("添加内容面板测试程序");
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		JPanel contentPanel = new JPanel();
		jFrame.setContentPane(contentPanel); // 设置到顶层容器中

		// 创建单选按钮
		JLabel action = new JLabel("请选择：");
		contentPanel.add(action);
		JRadioButton radioButton1 = new JRadioButton("忽略");
		JRadioButton radioButton2 = new JRadioButton("继续");
		JRadioButton radioButton3 = new JRadioButton("跳过");
		// 创建按钮组
		ButtonGroup bg = new ButtonGroup();
		// 将单选按钮放到按钮组里
		bg.add(radioButton1);
		bg.add(radioButton2);
		bg.add(radioButton3);
		// 将单选按钮加到面板里
		contentPanel.add(radioButton1);
		contentPanel.add(radioButton2);
		contentPanel.add(radioButton3);

		// 使用复选框
		JLabel hobby = new JLabel("兴趣：");
		contentPanel.add(hobby);
		JCheckBox checkBox1 = new JCheckBox("羽毛球");
		JCheckBox checkBox2 = new JCheckBox("足球");
		JCheckBox checkBox3 = new JCheckBox("电脑书");
		JCheckBox checkBox4 = new JCheckBox("数学书");
		JCheckBox checkBox5 = new JCheckBox("电影");
		JCheckBox checkBox6 = new JCheckBox("录像");
		// 将复选框组件加入到面板中
		contentPanel.add(checkBox1);
		contentPanel.add(checkBox2);
		contentPanel.add(checkBox3);
		contentPanel.add(checkBox4);
		contentPanel.add(checkBox5);
		contentPanel.add(checkBox6);

	}

}
