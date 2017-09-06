package com.ddbin.swing.demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorld {

	public static void main(String[] args) {
		//顶层容器---> 中间容器---->基本组件
		//JFrame--->  jPanel---->jButton
		JFrame jFrame = new JFrame("测试窗口");	//创建顶层容器
		JPanel jPanel = new JPanel();			//创建中间容器
		jFrame.setContentPane(jPanel); 			//将中间容器依托在顶层容器内
		JButton jButton = new JButton("这是一个测试按钮");	//创建一个基本组件
		jPanel.add(jButton);					//将基本组件依托在中间容器内
		
		JButton jButton2 = new JButton("\u8FD9\u662F\u7B2C\u4E8C\u4E2A\u6D4B\u8BD5\u6309\u94AE");
		jPanel.add(jButton2);
		jFrame.setVisible(true);				//设置顶层容器的可见性
	}

}
