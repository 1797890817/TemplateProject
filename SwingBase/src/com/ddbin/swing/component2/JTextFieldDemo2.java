package com.ddbin.swing.component2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextFieldDemo2 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("JTextField3");
		Container contentPane = jFrame.getContentPane();
		contentPane.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST; // 设定Layout的位置
		gbc.insets = new Insets(2, 2, 2, 2);// 设定与边界的距离，上左下右
		panel.setBorder(BorderFactory.createTitledBorder("学生的基本数据"));

		// 创建4个标签
		JLabel label1 = new JLabel("学生姓名");
		JLabel label2 = new JLabel("学生性别");
		JLabel label3 = new JLabel("学生身高");
		JLabel label4 = new JLabel("学生体重");
		// 创建JTextField3_FixedLengthDoument对象，字符串为空，指定长度的文本域组件
		JTextField textField1 = new JTextField(new JTextField3_FixedLengthDoument(10), "", 10);
		JTextField textField2 = new JTextField(new JTextField3_FixedLengthDoument(1), "", 1);
		JTextField textField3 = new JTextField(new JTextField3_FixedLengthDoument(5), "", 5);
		JTextField textField4 = new JTextField(new JTextField3_FixedLengthDoument(5), "", 5);
		// 对上面的组件进行网格式布局
		gbc.gridy = 1;
		gbc.gridx = 0;
		panel.add(label1, gbc);
		gbc.gridx = 1;
		panel.add(textField1, gbc);

		gbc.gridy = 2;
		gbc.gridx = 0;
		panel.add(label2, gbc);
		gbc.gridx = 1;
		panel.add(textField2, gbc);

		gbc.gridy = 3;
		gbc.gridx = 0;
		panel.add(label3, gbc);
		gbc.gridx = 1;
		panel.add(textField3, gbc);

		gbc.gridy = 4;
		gbc.gridx = 0;
		panel.add(label4, gbc);
		gbc.gridx = 1;
		panel.add(textField4, gbc);

		// 在主面板中添加面板
		contentPane.add(panel);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.addWindowListener(new WindowAdapter() { // 使用快捷键

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 系统 退出
			}

		});

		// 给textField添加事件监听
		textField1.addActionListener(new ActionListener() {

			@Override // 处理键盘回车事件
			public void actionPerformed(ActionEvent e) {
				// 回车后文本框内容被清空
				textField1.setText("");
			}
		});
		// 给文本域添加键盘监听
		textField1.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// 键入字符时，提示出来
				textField1.setToolTipText(String.valueOf(e.getKeyChar()));
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
	}

}

class JTextField3_FixedLengthDoument extends PlainDocument {

	private static final long serialVersionUID = 1L;
	private int maxLength;

	// 构造函数
	public JTextField3_FixedLengthDoument(int maxLength) {
		// 构造器中设置文本的最大长度
		this.maxLength = maxLength;
	}

	@Override // 使用eclipse生成框架
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		// offs是插入数据的偏移量，str是要插入的数据，a是插入的数据属性
		// 如果文件的长度加上str的长度大于最大长度
		if (getLength() + str.length() > maxLength) {
			Toolkit.getDefaultToolkit().beep();// 发音警告
		} else {
			super.insertString(offs, str, a);
		}

	}

}