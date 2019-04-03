package com.juliasoft;

import java.util.List;

public class Main {
	
	public static String ProgramStack[] = {"Server.jar", 
											"HbaseConnection.jar"};
	
	public static String CommunicationStack[] = {"/home/tanmoy/Julia-ShellClient/ChannelConfigs/Channel-gateway-db.xlsx",
												 "/home/tanmoy/Julia-ShellClient/ChannelConfigs/Channel-db-internet.xlsx"};
	
	//public static String communicationConfig = "/home/tanmoy/Julia-ShellClient/ChannelConfigs/ChannelConfig.xlsx"; 

	
	public static String[] initFiles = new String[ProgramStack.length];
	public static String[] Result = new String[ProgramStack.length];
	
	public static String ShellClientDir = "cd /home/tanmoy/Julia-ShellClient"; //String AnalyzeGateway = "./shell.sh analyze -p Server.jar -a config.xml -s Default -f java8 -l GDPR_SPECIFICATION -pt Other -p " /home/tanmoy/Desktop/GDPRSpecification-RPi.xlsx";

	public static boolean flag = true;
	
	
	public static void main(String[] args) {
	
		Terminal terminal = new Terminal();
			
		for(int i=0; i<ProgramStack.length; i++) {
			String command = terminal.generateInitCommand(ProgramStack[i]);
			System.out.println("passing command: "+command);
			String result_terminal = terminal.execute(ShellClientDir+";"+command);
			System.out.println(result_terminal);
			String AnalysisID = terminal.getAnalysisID(result_terminal);
			initFiles[i] = terminal.generateGDPRSpecificationFile(AnalysisID, ""+i);	
		}
		System.out.println("-------Generated init files------------"); 
		
		for(int j=0; j<CommunicationStack.length; j++) {
			Excel excel = new Excel(initFiles[j]);
	
			excel.updateJuliaConfigFile("SensitiveData", CommunicationStack[j], 0, 6);
			excel.updateJuliaConfigFile("LeakagePoint", CommunicationStack[j], 1, 8);
	
			excel.closeExcel();
		}
		System.out.println("-------updated the specification file------------");
		
		for(int k=0; k<ProgramStack.length; k++) {
			String command = terminal.generateReportCommand(ProgramStack[k],initFiles[k]);
			String result_terminal=terminal.execute(ShellClientDir+";"+command);
			System.out.println(result_terminal);
			Result[k]=terminal.getResuts(result_terminal);
			System.out.println("--->"+Result[k]);
		} 
		System.out.println("-------generated the result file------------"); 
		

		@SuppressWarnings("unchecked")
		List<Bug> bugs[] = new List[Result.length];
		for (int l=0; l<Result.length;l++) {
			ShellClientResult result = new ShellClientResult(Result[l]);
			System.out.println(Result[l]);
			
			bugs[l] = result.getCriticalBugs();
			for(Bug bug:bugs[l]) {
				if(bug.rank.equals("CRITICAL")) {
					System.out.println(bug.source+" "+bug.sink+" "+bug.method+"\n");
					
					flag = true;
				}
				else
					flag = false;
			}
		}
		
		for(int m=0; m<bugs.length-1; m++) {
			for(Bug b1:bugs[m]) {
				String presentSink = b1.sink;
				for(Bug b2:bugs[m+1]) {
					String nextSource = b2.source;
					if(presentSink.equals(nextSource)) {
						System.out.println("\n\nTAINT PROPAGATES AMONG THE INTERFACES...\n");
						System.out.println("It propagates from \""+ b1.source+"\" to \""+ b2.sink+"\" through \"" + b1.method +"\" method of program \""+ProgramStack[m] + "\" to \"" + b2.method + "\" method of program \""+ProgramStack[m=1]+"\"");
						
					}
				}
			}
		}

	}
}