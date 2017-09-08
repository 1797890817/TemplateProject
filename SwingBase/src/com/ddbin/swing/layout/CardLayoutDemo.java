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
 * 若是觉的代码层级复杂了，用图形化编辑器打开，结构层次容易看明白！
 * @author deepin
 *
 */
public class CardLayoutDemo extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panel = null;
	private JPanel p = null; // 放按钮的Jpanel
	private CardLayout card = null; // CardLayout布局管理器
	private JButton last = null; // 上一步
	private JButton next = null; // 下一步

	// 中间1-2-3的按钮
	private JButton b_1 = null, b_2 = null, b_3 = null;
	// 要切换的三个panel
	private JPanel p_1 = null, p_2 = null, p_3 = null;

	// 构造函数
	public CardLayoutDemo() {
		super("CardLayoutDemo");
		try {
			// 将LookAndFeel设置成Windows样式
			// 可以打开下面的字符串中的包，看看支持那些样式
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		card = new CardLayout(5, 5);// 创建一个具有指定水平和垂直间隙的新卡片布局
		// 存放卡片的容器
		panel = new JPanel(card); // 面板的布局管理器被设置成CardLayout

		// 构造放置按钮的JPanel
		p = new JPanel();
		// 构建需要的Buttons
		last = new JButton("<上一步");
		next = new JButton("下一步>");
		b_1 = new JButton("1");
		b_2 = new JButton("2");
		b_3 = new JButton("3");
		b_1.setMargin(new Insets(2, 2, 2, 2));
		b_2.setMargin(new Insets(2, 2, 2, 2));
		b_3.setMargin(new Insets(2, 2, 2, 2));
		// 将按钮加入到面板中
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

		// 将三个小的面板放到大的面板中
		panel.add(p_1, "p1");
		panel.add(p_2, "p2");
		panel.add(p_3, "p3");

		// 给按钮添加事件
		last.addActionListener(new ActionListener() {
			// 上一步的按钮动作
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(panel);
			}
		});
		next.addActionListener(new ActionListener() {
			// 下一步的按钮动作
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(panel);
			}
		});
		b_1.addActionListener(new ActionListener() {
			// 直接翻转到p_1
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
		// 注意，South对应的是屏幕的下方，east对应的是右方，依次类推！
		this.getContentPane().add(p, BorderLayout.SOUTH); // 将存放按钮的那一行给放到主面板里
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new CardLayoutDemo();
	}

}
