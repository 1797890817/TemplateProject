package com.ddbin.swing.demo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * ����һ����¼�࣬�̳�������
 */
public class LoginDemo extends JPanel {

	private static final long serialVersionUID = 1L;

	static final int WIDTH = 300; // �����ܵĿ��
	static final int HIGTH = 150; // �����ܵĸ߶�

	JFrame loginFrame;

	// �������񲼾ַ�ʽ���������
	public void add(Component c, GridBagConstraints constraints, int x, int y, int w, int h) {
		constraints.gridx = x; // ָ��λ�ڵڼ���
		constraints.gridy = y; // ָ��λ�ڵڼ���
		constraints.gridwidth = w; // �ؼ���Ҫռ����
		constraints.gridheight = h; // �ؼ���Ҫռ����
		add(c, constraints);
	}

	// ���캯��
	public LoginDemo() {
		loginFrame = new JFrame("��ӭ����Java���磡");
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridBagLayout lay = new GridBagLayout(); // ���񲼾ֹ���������
		setLayout(lay);
		loginFrame.add(this, BorderLayout.WEST);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int heigth = screenSize.height;

		int x = (width - WIDTH) / 2;
		int y = (heigth - HEIGHT) / 2;

		loginFrame.setLocation(x, y);
		JButton ok = new JButton("��¼");
		JButton cancel = new JButton("ȡ��");

		JLabel title = new JLabel("��ӭ����Java����");
		JLabel name = new JLabel("�û�����");
		JLabel password = new JLabel("���룺");

		final JTextField nameInput = new JTextField(15);
		final JTextField passwordInput = new JTextField(15);

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 3;
		constraints.weighty = 4;
		add(title, constraints, 0, 0, 4, 1);
		add(name, constraints, 0, 1, 1, 1);
		add(password, constraints, 0, 2, 1, 1);

		add(nameInput, constraints, 2, 1, 1, 1);
		add(passwordInput, constraints, 2, 2, 1, 1);

		add(ok, constraints, 0, 3, 1, 1);
		add(cancel, constraints, 2, 3, 1, 1);

		loginFrame.setResizable(true);	// �Ƿ���Ըı䴰�ڵĴ�С
		loginFrame.setVisible(true); 	// ���ô��ڵĿɼ���
	}

	public static void main(String[] args) {
		LoginDemo loginDemo = new LoginDemo();
	}

}
