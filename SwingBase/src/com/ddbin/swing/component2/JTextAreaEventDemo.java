package com.ddbin.swing.component2;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Element;
import javax.swing.undo.UndoableEdit;

public class JTextAreaEventDemo extends JFrame implements UndoableEditListener, DocumentListener {

	private static final long serialVersionUID = 1L;
	// 表示编辑的对象，表示已完成并且可以进行撤销和恢复
	private UndoableEdit edit;

	private JTextArea jta;
	private JTextArea message;
	private JMenuItem undoItem;
	private JMenuItem redoItem;

	// 构造函数
	public JTextAreaEventDemo() {
		super("文本域事件测试程序");
		jta = new JTextArea();
		jta.getDocument().addUndoableEditListener(this);
		jta.getDocument().addDocumentListener(this);

		message = new JTextArea();
		message.setEditable(false);// 设置为不可编辑

		// 面板
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		panel.setBorder(BorderFactory.createTitledBorder("Edit Area:"));
		/*
		 * BorderFactory.createTitledBorder（）创建一个标题边框．使用默认边框（浮雕化），
		 * 默认文本位置〈位于顶线上〉、默认调整（Leading）以及由当前外观确定的默认字体和文本颜色 并指定了标题文本
		 */

		panel.add(new JScrollPane(jta));

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 1));
		panel2.setBorder(BorderFactory.createTitledBorder("message:"));
		panel2.add(new JScrollPane(message));

		// 将两个小面板添加到主面板里
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		contentPane.add(panel);
		contentPane.add(panel2);

		// 创建菜单
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Edit");
		undoItem = new JMenuItem("Undo");
		redoItem = new JMenuItem("Redo");
		menu.add(undoItem);
		menu.add(redoItem);
		menuBar.add(menu);
		// 创建菜单项
		updateMenuItem();
		setJMenuBar(menuBar);
		setSize(800, 800);
		// setVisible(true);
		undoItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				edit.undo(); // 撤销所有操作
				updateMenuItem();
				message.append("-Undo-\n");
			}
		});
		redoItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				edit.redo(); // 应用所有操作
				updateMenuItem();
				message.append("-Redo-\n");
			}
		});

	}

	public void updateMenuItem() {
		if (edit != null) {
			undoItem.setEnabled(edit.canUndo());
			undoItem.setText(edit.getUndoPresentationName());
			redoItem.setEnabled(edit.canRedo());
			redoItem.setText(edit.getRedoPresentationName());
		} else {
			undoItem.setEnabled(false);
			undoItem.setText("Undo");
			redoItem.setEnabled(false);
			redoItem.setText("Redo");

		}

	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		showDE(e);
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		showDE(e);
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		showDE(e);
	}

	@Override
	public void undoableEditHappened(UndoableEditEvent e) {
		StringBuffer buf = new StringBuffer(200);
		edit = e.getEdit();
		buf.append("UndoableEdit:");
		buf.append(edit.getPresentationName());
		buf.append("\n");

		message.append(buf.toString());
		updateMenuItem();
	}

	public void showDE(DocumentEvent de) {
		StringBuffer buffer = new StringBuffer(100);
		buffer.append(de.getType());
		buffer.append("Offset:");
		buffer.append(de.getOffset());
		buffer.append("Length:");
		Element Eroot = jta.getDocument().getDefaultRootElement();
		DocumentEvent.ElementChange eChange = de.getChange(Eroot);
		if (eChange == null) {
			buffer.append("(No Element Change)");
		} else {
			buffer.append("Element Change:index");
			buffer.append(eChange.getIndex());

		}
		buffer.append("\n");
		message.append(buffer.toString());

	}

	public static void main(String[] args) {
		// new JTextAreaEventDemo();
		JFrame frame = new JTextAreaEventDemo();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}

}
