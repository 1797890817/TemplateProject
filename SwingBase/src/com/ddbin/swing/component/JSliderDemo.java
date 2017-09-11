package com.ddbin.swing.component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo {
	static final int WIDTH = 300;
	static final int HEIGTH = 200;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("���������Գ���");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(WIDTH, HEIGTH);
		jFrame.setVisible(true);

		// ����һ�����
		JPanel contentPane = new JPanel();
		jFrame.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());

		// ����һ��������
		JSlider slider = new JSlider(0, 100, 0);
		// ����������ӵ������
		contentPane.add(slider, BorderLayout.SOUTH);
		// ���û������ľ������
		slider.setMajorTickSpacing(20); // �������̶�
		slider.setMinorTickSpacing(5); // ���ôο̶�
		slider.setPaintTicks(true);// �ÿ̶�����ʾ����
		slider.setPaintLabels(true);// �ÿ̶��߶�Ӧ��ֵ��ʾ����
		slider.setSnapToTicks(true);// �û��黬��������������

		// ����һ����ǩ
		final JLabel label = new JLabel("Ŀǰ�Ŀ̶��ǣ�" + slider.getValue());
		contentPane.add(label, BorderLayout.NORTH);

		// ��������Ӹı��¼�
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if ((JSlider) e.getSource() == slider) {
					// ���ñ�ǩ��ֵ
					label.setText("Ŀǰ�Ŀ̶�ֵ�ǣ�" + slider.getValue());
				}
			}
		});
	}
}
