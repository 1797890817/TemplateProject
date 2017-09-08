package com.ddbin.swing.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
/**
 * ���Ǿ��Ĵ���㼶�����ˣ���ͼ�λ��༭���򿪣��ṹ������׿����ף�
 * @author deepin
 *
 */
public class CardLayoutDemo extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panel = null;
	private JPanel p = null; // �Ű�ť��Jpanel
	private CardLayout card = null; // CardLayout���ֹ�����
	private JButton last = null; // ��һ��
	private JButton next = null; // ��һ��

	// �м�1-2-3�İ�ť
	private JButton b_1 = null, b_2 = null, b_3 = null;
	// Ҫ�л�������panel
	private JPanel p_1 = null, p_2 = null, p_3 = null;

	// ���캯��
	public CardLayoutDemo() {
		super("CardLayoutDemo");
		try {
			// ��LookAndFeel���ó�Windows��ʽ
			// ���Դ�������ַ����еİ�������֧����Щ��ʽ
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		card = new CardLayout(5, 5);// ����һ������ָ��ˮƽ�ʹ�ֱ��϶���¿�Ƭ����
		// ��ſ�Ƭ������
		panel = new JPanel(card); // ���Ĳ��ֹ����������ó�CardLayout

		// ������ð�ť��JPanel
		p = new JPanel();
		// ������Ҫ��Buttons
		last = new JButton("<��һ��");
		next = new JButton("��һ��>");
		b_1 = new JButton("1");
		b_2 = new JButton("2");
		b_3 = new JButton("3");
		b_1.setMargin(new Insets(2, 2, 2, 2));
		b_2.setMargin(new Insets(2, 2, 2, 2));
		b_3.setMargin(new Insets(2, 2, 2, 2));
		// ����ť���뵽�����
		p.add(last);
		p.add(b_1);
		p.add(b_2);
		p.add(b_3);
		p.add(next);

		p_1 = new JPanel();
		p_2 = new JPanel();
		p_3 = new JPanel();
		p_1.setBackground(Color.RED);
		p_2.setBackground(Color.BLUE);
		p_3.setBackground(Color.GREEN);
		p_1.add(new JLabel("JPanel_1"));
		p_2.add(new JLabel("JPanel_2"));
		p_3.add(new JLabel("JPanel_3"));

		// ������С�����ŵ���������
		panel.add(p_1, "p1");
		panel.add(p_2, "p2");
		panel.add(p_3, "p3");

		// ����ť����¼�
		last.addActionListener(new ActionListener() {
			// ��һ���İ�ť����
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(panel);
			}
		});
		next.addActionListener(new ActionListener() {
			// ��һ���İ�ť����
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(panel);
			}
		});
		b_1.addActionListener(new ActionListener() {
			// ֱ�ӷ�ת��p_1
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(panel, "p1");
			}
		});
		b_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(panel, "p2");
			}
		});
		b_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(panel, "p3");
			}
		});

		this.getContentPane().add(panel);
		// ע�⣬South��Ӧ������Ļ���·���east��Ӧ�����ҷ����������ƣ�
		this.getContentPane().add(p, BorderLayout.SOUTH); // ����Ű�ť����һ�и��ŵ��������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new CardLayoutDemo();
	}

}
