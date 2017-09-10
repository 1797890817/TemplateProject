package com.ddbin.swing.event;

import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowListenerDemo extends JFrame {

	private static final long serialVersionUID = 1L;

	// 构造函数
	public WindowListenerDemo() {
		super("窗口事件测试程序");

		// 添加窗口监听器
		// WindowListener wh = new WindowHandler(); //使用实现借口的方式
		WindowListener wh = new WindowHandler2(); // 使用适配器的方式
		addWindowListener(wh);

	}

	public static void main(String[] args) {
		WindowListenerDemo wld = new WindowListenerDemo();
		wld.setSize(300, 200);
		wld.setVisible(true);

	}

}
