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
		gbc.anchor = GridBagConstraints.WEST; // �趨Layout��λ��
		gbc.insets = new Insets(2, 2, 2, 2);// �趨��߽�ľ��룬��������
		panel.setBorder(BorderFactory.createTitledBorder("ѧ���Ļ�������"));

		// ����4����ǩ
		JLabel label1 = new JLabel("ѧ������");
		JLabel label2 = new JLabel("ѧ���Ա�");
		JLabel label3 = new JLabel("ѧ�����");
		JLabel label4 = new JLabel("ѧ������");
		// ����JTextField3_FixedLengthDoument�����ַ���Ϊ�գ�ָ�����ȵ��ı������
		JTextField textField1 = new JTextField(new JTextField3_FixedLengthDoument(10), "", 10);
		JTextField textField2 = new JTextField(new JTextField3_FixedLengthDoument(1), "", 1);
		JTextField textField3 = new JTextField(new JTextField3_FixedLengthDoument(5), "", 5);
		JTextField textField4 = new JTextField(new JTextField3_FixedLengthDoument(5), "", 5);
		// ������������������ʽ����
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

		// ���������������
		contentPane.add(panel);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.addWindowListener(new WindowAdapter() { // ʹ�ÿ�ݼ�

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // ϵͳ �˳�
			}

		});

		// ��textField����¼�����
		textField1.addActionListener(new ActionListener() {

			@Override // ������̻س��¼�
			public void actionPerformed(ActionEvent e) {
				// �س����ı������ݱ����
				textField1.setText("");
			}
		});
		// ���ı�����Ӽ��̼���
		textField1.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// �����ַ�ʱ����ʾ����
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

	// ���캯��
	public JTextField3_FixedLengthDoument(int maxLength) {
		// �������������ı�����󳤶�
		this.maxLength = maxLength;
	}

	@Override // ʹ��eclipse���ɿ��
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		// offs�ǲ������ݵ�ƫ������str��Ҫ��������ݣ�a�ǲ������������
		// ����ļ��ĳ��ȼ���str�ĳ��ȴ�����󳤶�
		if (getLength() + str.length() > maxLength) {
			Toolkit.getDefaultToolkit().beep();// ��������
		} else {
			super.insertString(offs, str, a);
		}

	}

}