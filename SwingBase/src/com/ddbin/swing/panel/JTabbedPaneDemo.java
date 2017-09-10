package com.ddbin.swing.panel;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class JTabbedPaneDemo {

	public static void main(String[] args) {
		try {
			// 显示外观风格
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		JFrame jFrame = new JFrame("资金状况");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		// 创建一个选项卡容器，并将其放到顶层容器里
		JTabbedPane jtPane = new JTabbedPane();
		jFrame.setContentPane(jtPane);

		//
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();

		// 向选项卡容器里添加页签面板
		jtPane.add("jp1", jp1);
		jtPane.setEnabledAt(0, true);
		jtPane.setTitleAt(0, "个人收入状况");
		jtPane.add("jp2", jp2);
		jtPane.setEnabledAt(1, true);
		jtPane.setTitleAt(1, "工资");
		jtPane.add("jp3", jp3);
		jtPane.setEnabledAt(2, true);
		jtPane.setTitleAt(2, "奖金");
		jtPane.add("jp4", jp4);
		jtPane.setEnabledAt(3, true);
		jtPane.setTitleAt(3, "津贴");
		jtPane.add("jp5", jp5);
		jtPane.setEnabledAt(4, true);
		jtPane.setTitleAt(4, "社保");

		// 设置其大小及选项卡方向
		jtPane.setPreferredSize(new Dimension(500, 200));
		jtPane.setTabPlacement(JTabbedPane.TOP);
		// 设置选项卡在容器中的显示形式
		jtPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		//jFrame.pack();

		// 创建8个标签，为了放在容器里
		JLabel jl1 = new JLabel("工资状况");
		JLabel jl2 = new JLabel("3000元/月");
		JLabel jl3 = new JLabel("奖金状况");
		JLabel jl4 = new JLabel("1500元/月");
		JLabel jl5 = new JLabel("津贴状况");
		JLabel jl6 = new JLabel("500元/月");
		JLabel jl7 = new JLabel("社保状况");
		JLabel jl8 = new JLabel("200元/月");
		jp2.add(jl1);
		jp2.add(jl2);
		jp3.add(jl3);
		jp3.add(jl4);
		jp4.add(jl5);
		jp4.add(jl6);
		jp5.add(jl7);
		jp5.add(jl8);

		jFrame.pack();

	}
}
