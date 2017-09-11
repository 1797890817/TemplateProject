package com.ddbin.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooserDemo implements ActionListener {
	JFrame f = null;
	JLabel label = null;
	JTextArea textArea = null;
	JFileChooser fileChooser = null;

	// 构造函数
	public JFileChooserDemo() {
		f = new JFrame("文件选择器演示");
		Container contentPane = f.getContentPane();
		textArea = new JTextArea();

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(350, 300));
		// 创建容纳两个按钮的面板
		JPanel panel = new JPanel();
		JButton button1 = new JButton("读取文件");
		button1.addActionListener(this);// 添加监听器
		JButton button2 = new JButton("存储文件");
		button2.addActionListener(this);// 添加监听器

		panel.add(button1);
		panel.add(button2);

		label = new JLabel("", JLabel.CENTER);
		// 创建一个文件选择器
		fileChooser = new JFileChooser("~/");
		
		//添加文件类型的过滤
		fileChooser.addChoosableFileFilter(new SelectFileFilter("java"));
		fileChooser.addChoosableFileFilter(new SelectFileFilter("class"));
		fileChooser.addChoosableFileFilter(new SelectFileFilter("txt"));
		
		contentPane.add(label, BorderLayout.NORTH);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		contentPane.add(panel, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 退出JVM
			}
		});

	}

	public static void main(String[] args) {
		new JFileChooserDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "读取文件":
			readTextFile();
			break;
		case "存储文件":
			writeTextFile();
			break;
		default:
			break;
		}
	}

	private void writeTextFile() {
		File file;
		int result = fileChooser.showSaveDialog(f);
		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			label.setText("您选择的存储的文件名为：" + file.getName());
			FileOutputStream fileOutputStream = null;
			if (file != null) {
				try {
					fileOutputStream = new FileOutputStream(file);
				} catch (FileNotFoundException e) {
					label.setText("文件找不到！");
					return;
				}
				String contentText = textArea.getText();

				try {
					fileOutputStream.write(contentText.getBytes());
				} catch (IOException e) {
					label.setText("写入文件错误！");
				} finally {
					try {
						if (fileOutputStream != null) {
							fileOutputStream.close();
						}
					} catch (IOException e) {
						label.setText("文件输出流关闭异常！");
					}
				}
			}
		} else if (result == JFileChooser.CANCEL_OPTION) {
			label.setText("您没有选择任何文件");
		}

	}

	private void readTextFile() {
		File file;
		int result;
		fileChooser.setApproveButtonText("确定");
		fileChooser.setDialogTitle("打开文件");
		result = fileChooser.showOpenDialog(f);// 与父组件关联
		textArea.setText("");

		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			label.setText("您选择的文件名为：" + file.getName());

			// 使用流操作文件
			FileInputStream fileInputStream = null;
			if (file != null) {

				try {
					fileInputStream = new FileInputStream(file);
				} catch (FileNotFoundException e1) {
					label.setText("文件没有找到！");
					return;
				}

				int readByte;

				try {
					while ((readByte = fileInputStream.read()) != -1) {
						textArea.append(String.valueOf((char) readByte));
					}
				} catch (IOException e1) {
					label.setText("读取文件出错！");
				} finally {
					try {
						if (fileInputStream != null) {
							fileInputStream.close();
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}

			}

		} else if (result == JFileChooser.CANCEL_OPTION) {
			label.setText("您没有选择任何文件");
		}
	}

}
