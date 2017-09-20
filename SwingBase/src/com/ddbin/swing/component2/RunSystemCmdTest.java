package com.ddbin.swing.component2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RunSystemCmdTest {
	protected static String sudoCmd = "echo \"linux\" | sudo -S ";

	public static void main(String[] args) throws Exception {

		// String cmds[] = {"/bin/bash", "-c", sudoCmd + "ls -l /home/deepin"};
		String cmds[] = { "/bin/bash", "-c", sudoCmd + "chkconfig --list" };
		Process p = Runtime.getRuntime().exec(cmds);
		// Process p = Runtime.getRuntime().exec("ps -ef");
		InputStream is = p.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		p.waitFor();
		is.close();
		reader.close();
		p.destroy();

	}

}
