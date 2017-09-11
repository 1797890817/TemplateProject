package com.ddbin.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * timer 没有正常运行！！！
 * 
 * @author deepin
 *
 */
public class ProgressBarDemo2 implements ActionListener, ChangeListener {
	JFrame f = null;
	JProgressBar pb = null;
	JLabel label = null;
	Timer timer = null;
	JButton button = null;

	// 构造函数
	public ProgressBarDemo2() {
		f = new JFrame("进度条测试程序2");
		Container contentPane = f.getContentPane();
		label = new JLabel("", JLabel.CENTER);

		pb = new JProgressBar();
		pb.setOrientation(JProgressBar.HORIZONTAL);// 设置为水平方向
		// 设置最小刻度，最大刻度
		pb.setMaximum(0);
		pb.setMaximum(100);
		pb.setValue(0);// 设定默认值
		pb.setStringPainted(true);
		pb.addChangeListener(this);// 添加进度条变化事件
		pb.setPreferredSize(new Dimension(200, 30));

		// 创建一个防止按钮的面板
		JPanel panel = new JPanel();
		JButton button = new JButton("start");
		// 给按钮添加事件
		button.addActionListener(this);
		panel.add(button);

		// 创建一个事件组件对象
		timer = new Timer(50, this);

		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(pb, BorderLayout.CENTER);
		contentPane.add(label, BorderLayout.SOUTH);

		f.pack();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 退出JVM
			}
		});

	}

	public static void main(String[] args) {
		new ProgressBarDemo2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 当单击按钮时，计时开始
		if (e.getSource() == button) {
			timer.start();
		}

		// 当单击事件组件时，进度条开始变化
		if (e.getSource() == timer) {
			int value = pb.getValue();
			if (value < 100) {
				value++;
				pb.setValue(value);
				System.out.println(value);
			} else {
				timer.stop();
				pb.setValue(0);
			}
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// 当进度条运行时，就将进度显示在标签中
		if (e.getSource() == pb) {
			label.setText("目前已完成进度：" + pb.getValue() + "%");

		}

	}

}
