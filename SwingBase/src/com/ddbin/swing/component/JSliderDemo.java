package com.ddbin.swing.component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("滑块条测试程序");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setVisible(true);

		// 创建一个面板
		JPanel contentPane = new JPanel();
		jFrame.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());

		// 创建一个滑块条
		JSlider slider = new JSlider(0, 100, 0);
		// 将滑块条添加到面板中
		contentPane.add(slider, BorderLayout.SOUTH);
		// 设置滑块条的具体参数
		slider.setMajorTickSpacing(20); // 设置主刻度
		slider.setMinorTickSpacing(5); // 设置次刻度
		slider.setPaintTicks(true);// 让刻度线显示出来
		slider.setPaintLabels(true);// 让刻度线对应的值显示出来
		slider.setSnapToTicks(true);// 让滑块滑到附近的整数处

		// 创建一个标签
		final JLabel label = new JLabel("目前的刻度是：" + slider.getValue());
		contentPane.add(label, BorderLayout.NORTH);

		// 给滑块添加改变事件
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if ((JSlider) e.getSource() == slider) {
					// 设置标签的值
					label.setText("目前的刻度值是：" + slider.getValue());
				}
			}
		});
	}
}
