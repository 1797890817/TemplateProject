package com.ddbin.swing.component2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldDemo {

	public static void main(String[] args) {
		new MyPane();

	}

}

class MyPane extends JPanel {

	private static final long serialVersionUID = 1L;
	static final int WIDTH = 300;
	static final int HEIGTH = 150;
	JFrame loginFrame;

	public void add(Component c, GridBagConstraints constraints, int x, int y, int w, int h) {

		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;

		add(c, constraints);

	}

	// ���캯��
	public MyPane() { // ֱ��д�������Կ��ٴ��������캯��
		loginFrame = new JFrame("һ���ۺ�ʵ��");
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		loginFrame.add(this, BorderLayout.WEST);
		loginFrame.setSize(WIDTH, HEIGTH);
		// loginFrame.setVisible(true);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();// ��ȡ��Ļ�ߴ�
		int width = screenSize.width;
		int heigth = screenSize.height;
		// ȷ����¼�����ʾλ��,���м���ʾ
		int x = (width - WIDTH) / 2;
		int y = (heigth - HEIGHT) / 2;
		loginFrame.setLocation(x, y);

		// ������¼��������ť
		JButton ok = new JButton("��¼");
		JButton cancel = new JButton("����");
		// 3����ǩ
		JLabel title = new JLabel("��¼����");
		JLabel name = new JLabel("�û���");
		JLabel password = new JLabel("����");
		// 2���ı���
		JTextField nameInput = new JTextField(15);
		// JTextField passwordInput = new JTextField(15);
		JPasswordField passwordInput = new JPasswordField(15);

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 3;
		constraints.weighty = 4;
		add(title, constraints, 0, 0, 2, 1);
		add(name, constraints, 0, 1, 1, 1);
		add(password, constraints, 0, 2, 1, 1);
		add(nameInput, constraints, 2, 1, 1, 1);
		add(passwordInput, constraints, 2, 2, 1, 1);
		add(ok, constraints, 0, 3, 1, 1);
		add(cancel, constraints, 2, 3, 1, 1);

		loginFrame.setResizable(false);
		loginFrame.setVisible(true);
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nameText = nameInput.getText();
				// String passwordText = passwordInput.getText();
				String passwordText = String.valueOf(passwordInput.getPassword());

				// �Ƚ�����
				boolean x = "admin".equals(nameText);
				boolean y = "admin".equals(passwordText);
				if (x && y) {
					loginFrame.dispose();
				} else {
					// ������û��������벻��ȷʱ������ı��������
					nameInput.setText("");
					passwordInput.setText("");
				}

			}
		});
	}

}