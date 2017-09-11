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

	// ���캯��
	public JFileChooserDemo() {
		f = new JFrame("�ļ�ѡ������ʾ");
		Container contentPane = f.getContentPane();
		textArea = new JTextArea();

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(350, 300));
		// ��������������ť�����
		JPanel panel = new JPanel();
		JButton button1 = new JButton("��ȡ�ļ�");
		button1.addActionListener(this);// ��Ӽ�����
		JButton button2 = new JButton("�洢�ļ�");
		button2.addActionListener(this);// ��Ӽ�����

		panel.add(button1);
		panel.add(button2);

		label = new JLabel("", JLabel.CENTER);
		// ����һ���ļ�ѡ����
		fileChooser = new JFileChooser("~/");
		
		//����ļ����͵Ĺ���
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
				System.exit(0); // �˳�JVM
			}
		});

	}

	public static void main(String[] args) {
		new JFileChooserDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "��ȡ�ļ�":
			readTextFile();
			break;
		case "�洢�ļ�":
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
			label.setText("��ѡ��Ĵ洢���ļ���Ϊ��" + file.getName());
			FileOutputStream fileOutputStream = null;
			if (file != null) {
				try {
					fileOutputStream = new FileOutputStream(file);
				} catch (FileNotFoundException e) {
					label.setText("�ļ��Ҳ�����");
					return;
				}
				String contentText = textArea.getText();

				try {
					fileOutputStream.write(contentText.getBytes());
				} catch (IOException e) {
					label.setText("д���ļ�����");
				} finally {
					try {
						if (fileOutputStream != null) {
							fileOutputStream.close();
						}
					} catch (IOException e) {
						label.setText("�ļ�������ر��쳣��");
					}
				}
			}
		} else if (result == JFileChooser.CANCEL_OPTION) {
			label.setText("��û��ѡ���κ��ļ�");
		}

	}

	private void readTextFile() {
		File file;
		int result;
		fileChooser.setApproveButtonText("ȷ��");
		fileChooser.setDialogTitle("���ļ�");
		result = fileChooser.showOpenDialog(f);// �븸�������
		textArea.setText("");

		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			label.setText("��ѡ����ļ���Ϊ��" + file.getName());

			// ʹ���������ļ�
			FileInputStream fileInputStream = null;
			if (file != null) {

				try {
					fileInputStream = new FileInputStream(file);
				} catch (FileNotFoundException e1) {
					label.setText("�ļ�û���ҵ���");
					return;
				}

				int readByte;

				try {
					while ((readByte = fileInputStream.read()) != -1) {
						textArea.append(String.valueOf((char) readByte));
					}
				} catch (IOException e1) {
					label.setText("��ȡ�ļ�����");
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
			label.setText("��û��ѡ���κ��ļ�");
		}
	}

}
