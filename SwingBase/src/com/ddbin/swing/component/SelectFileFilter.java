package com.ddbin.swing.component;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class SelectFileFilter extends FileFilter {
	String ext; // 要过滤的文件后缀

	// 构造函数
	public SelectFileFilter(String ext) {
		this.ext = ext;
	}

	@Override
	public boolean accept(File f) {
		if (f.isDirectory()) {
			return true;
		}
		String fileName = f.getName();
		int index = fileName.lastIndexOf('.');
		if (index > 0 && index < fileName.length() - 1) {
			// 取得文件的后缀名
			String extension = fileName.substring(index + 1).toLowerCase();
			if (extension.equalsIgnoreCase(ext)) {
				return true; // 类型匹配
			}
		}

		return false;
	}

	@Override
	public String getDescription() {
		// 返回描述文件说明的字符串
		// if (ext.equals("java")) {
		// return "Java Source File (*.java)";
		// } else if (ext.equals("class")) {
		// return "Java Class File (*.class)";
		// }
		switch (ext) {
		case "java":
			return "Java Source File (*.java)";
		// break;
		case "class":
			return "Java Class File (*.class)";
		// break;
		case "txt":
			return "Text File (*.txt)";
		// break;
		default:
			break;
		}
		return null;
	}

}
