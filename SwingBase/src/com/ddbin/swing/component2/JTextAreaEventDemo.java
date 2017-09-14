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
	// ��ʾ�༭�Ķ��󣬱�ʾ����ɲ��ҿ��Խ��г����ͻָ�
	private UndoableEdit edit;

	private JTextArea jta;
	private JTextArea message;
	private JMenuItem undoItem;
	private JMenuItem redoItem;

	// ���캯��
	public JTextAreaEventDemo() {
		super("�ı����¼����Գ���");
		jta = new JTextArea();
		jta.getDocument().addUndoableEditListener(this);
		jta.getDocument().addDocumentListener(this);

		message = new JTextArea();
		message.setEditable(false);// ����Ϊ���ɱ༭

		// ���
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		panel.setBorder(BorderFactory.createTitledBorder("Edit Area:"));
		/*
		 * BorderFactory.createTitledBorder��������һ������߿�ʹ��Ĭ�ϱ߿򣨸��񻯣���
		 * Ĭ���ı�λ�á�λ�ڶ����ϡ���Ĭ�ϵ�����Leading���Լ��ɵ�ǰ���ȷ����Ĭ��������ı���ɫ ��ָ���˱����ı�
		 */

		panel.add(new JScrollPane(jta));

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 1));
		panel2.setBorder(BorderFactory.createTitledBorder("message:"));
		panel2.add(new JScrollPane(message));

		// ������С�����ӵ��������
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		contentPane.add(panel);
		contentPane.add(panel2);

		// �����˵�
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Edit");
		undoItem = new JMenuItem("Undo");
		redoItem = new JMenuItem("Redo");
		menu.add(undoItem);
		menu.add(redoItem);
		menuBar.add(menu);
		// �����˵���
		updateMenuItem();
		setJMenuBar(menuBar);
		setSize(800, 800);
		// setVisible(true);
		undoItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				edit.undo(); // �������в���
				updateMenuItem();
				message.append("-Undo-\n");
			}
		});
		redoItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				edit.redo(); // Ӧ�����в���
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
