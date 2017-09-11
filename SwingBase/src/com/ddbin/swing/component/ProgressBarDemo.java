package com.ddbin.swing.component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBarDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) throws Exception {

		JFrame jf = new JFrame("进度条测试程序");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(WIDTH, HEIGTH);
		jf.setVisible(true); // 没有这一行程序不显示

		// 创建主面板
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);

		// 创建进度条
		JProgressBar pb = new JProgressBar();
		// 创建一个纵向的进度条
		// JProgressBar pb = new JProgressBar(JProgressBar.VERTICAL);
		contentPane.add(pb);

		// 设置进度条的最大值最小值
		pb.setMaximum(10);
		pb.setMinimum(1);

		// 模拟进度条的滚动
		int i = 0;
		while (i <= 10) {
			Thread.sleep(1000); // 不等待的话，很快就运行结束，看不到效果
			pb.setValue(i);
			i++;
		}

	}

}
