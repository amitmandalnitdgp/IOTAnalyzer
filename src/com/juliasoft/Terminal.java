package com.juliasoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Terminal {
	
	public String ShellClientDir = "cd /home/tanmoy/Julia-ShellClient";
	
	public static ArrayList<String> command(final String cmdline,final String directory) {
		try {
			Process process = new ProcessBuilder(new String[] {"bash", "-c", cmdline}).redirectErrorStream(true).directory(new File(directory)).start();

			ArrayList<String> output = new ArrayList<String>();
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			while ( (line = br.readLine()) != null ) {
				output.add(line);
			}
			if (0 != process.waitFor()) {	//wait till execution.
				return null;
			}
			return output;

		} catch (Exception e) {
			return null;
		}
	}

	public String execute(String cmdline) {
		ArrayList<String> output = command(cmdline, ".");
		String result="";
		if (null == output) {
			System.out.println("\n\n\t\tCOMMAND FAILED: " + cmdline);
			return "NO_SUCCESS";
		}
		else {
			for (String line : output) {
				result = result+line+"\n";
				//System.out.println(line);
			}
			return result;
		}
	}
	
	public String generateReportCommand(String jarName, String SpecFile) {
		String cmdP1 = "./shell.sh analyze -p ";//Server.jar
		String cmdP2 = " -a config_Report.xml -s Default -f java8 -l GDPR_SPECIFICATION -pt Other -p "; // /home/tanmoy/Desktop/GDPRSpecification-RPi.xlsx";
		//String cmd = cmdP1+jarName+cmdP2+SpecFile;
		return cmdP1+jarName+cmdP2+SpecFile;
	}
	
	public String generateInitCommand(String jarName) {
		String cmdP1 = "./shell.sh analyze -p ";//Server.jar
		String cmdP2 = " -a config_Init.xml -s Default -f java8";
//		String cmd = cmdP1+jarName+cmdP2;
		return cmdP1+jarName+cmdP2;
	}
	
	public String getAnalysisID(String result_terminal) {
		
		String AnalysisID = null;
		if(!result_terminal.equals("NO_SUCCESS")) {
			String result_t[]=result_terminal.split("\n");
			for(int i=0; i<result_t.length;i++) {
				if((result_t[i].length()>1) && (result_t[i].contains("INFO: Id of the registered analysis is:"))) {
					String words[]=result_t[i].split(" ");
					AnalysisID = words[words.length-1];
					//System.out.println("--> "+result_t[i]);
				}
			}
		}
		return AnalysisID;
	}
	
public String getResuts(String result_terminal) {
		
		String ResultFile = null;
		if(!result_terminal.equals("NO_SUCCESS")) {
			String result_t[]=result_terminal.split("\n");
			for(int i=0; i<result_t.length;i++) {
				if((result_t[i].length()>1) && (result_t[i].contains("INFO: Writing analysis result to file:"))) {
					String words[]=result_t[i].split(" ");
					ResultFile = words[words.length-1];
					//System.out.println("--> "+result_t[i]);
				}
			}
		}
		return "/home/tanmoy/Julia-ShellClient/"+ResultFile;
	}
	
	public String generateGDPRSpecificationFile(String AnalysisID, String programID) {
		//String cmdP1 = "./shell.sh retrieve-output -i "; //1c92b5b9-c791-4216-a5bc-5396180a8a9c -k GDPRSpecification.xlsx
		//String cmdP2 = " -k GDPRSpecification.xlsx";
		String command = "./shell.sh retrieve-output -i "+ AnalysisID + " -k GDPRSpecification.xlsx";
		execute(ShellClientDir+";"+command);
		File f1 = new File("/home/tanmoy/Julia-ShellClient/GDPRSpecification.xlsx");
		File f2 = new File("/home/tanmoy/Julia-ShellClient/GDPRSpecification_"+programID+".xlsx");
		f1.renameTo(f2);
		return "/home/tanmoy/Julia-ShellClient/GDPRSpecification_"+programID+".xlsx";

	}
}
