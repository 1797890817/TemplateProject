package com.ddbin.swing.component;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JColorChooserDemo {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("测试颜色选择器");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 创建面板
		MyPane pane = new MyPane();
		jFrame.getContentPane().add(pane);

		jFrame.pack();
		jFrame.setVisible(true);

	}

}

class MyPane extends JPanel implements ActionListener {
	private JButton button, rgb, red, green, blue;
	private Color color = new Color(0, 0, 0);

	// 构造函数
	public MyPane() {
		button = new JButton("Get Color");
		rgb = new JButton("RDB:");
		red = new JButton("Red:");
		green = new JButton("Green:");
		blue = new JButton("Blue:");

		button.addActionListener(this);
		setPreferredSize(new Dimension(550, 250));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setBackground(color);

		add(button);
		add(rgb);
		add(red);
		add(green);
		add(blue);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		color = JColorChooser.showDialog(this, "Choose Color", color);
		setBackground(color);

		button.setText("Get again");
		rgb.setText("RGB:" + color.getRGB());
		red.setText("RED:" + color.getRed());
		green.setText("Green:" + color.getGreen());
		blue.setText("Blue:" + color.getBlue());

	}

}
