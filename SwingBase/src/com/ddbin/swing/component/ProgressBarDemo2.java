package com.ddbin.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * timer û���������У�����
 * 
 * @author deepin
 *
 */
public class ProgressBarDemo2 implements ActionListener, ChangeListener {
	JFrame f = null;
	JProgressBar pb = null;
	JLabel label = null;
	Timer timer = null;
	JButton button = null;

	// ���캯��
	public ProgressBarDemo2() {
		f = new JFrame("���������Գ���2");
		Container contentPane = f.getContentPane();
		label = new JLabel("", JLabel.CENTER);

		pb = new JProgressBar();
		pb.setOrientation(JProgressBar.HORIZONTAL);// ����Ϊˮƽ����
		// ������С�̶ȣ����̶�
		pb.setMaximum(0);
		pb.setMaximum(100);
		pb.setValue(0);// �趨Ĭ��ֵ
		pb.setStringPainted(true);
		pb.addChangeListener(this);// ��ӽ������仯�¼�
		pb.setPreferredSize(new Dimension(200, 30));

		// ����һ����ֹ��ť�����
		JPanel panel = new JPanel();
		JButton button = new JButton("start");
		// ����ť����¼�
		button.addActionListener(this);
		panel.add(button);

		// ����һ���¼��������
		timer = new Timer(50, this);

		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(pb, BorderLayout.CENTER);
		contentPane.add(label, BorderLayout.SOUTH);

		f.pack();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // �˳�JVM
			}
		});

	}

	public static void main(String[] args) {
		new ProgressBarDemo2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ��������ťʱ����ʱ��ʼ
		if (e.getSource() == button) {
			timer.start();
		}

		// �������¼����ʱ����������ʼ�仯
		if (e.getSource() == timer) {
			int value = pb.getValue();
			if (value < 100) {
				value++;
				pb.setValue(value);
				System.out.println(value);
			} else {
				timer.stop();
				pb.setValue(0);
			}
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// ������������ʱ���ͽ�������ʾ�ڱ�ǩ��
		if (e.getSource() == pb) {
			label.setText("Ŀǰ����ɽ��ȣ�" + pb.getValue() + "%");

		}

	}

}
