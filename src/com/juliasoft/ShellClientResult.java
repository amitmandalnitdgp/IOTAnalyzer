package com.juliasoft;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.juliasoft.julia.api.specification.AnalysisReportResult;



public class ShellClientResult {

	public String path;
	AnalysisReportResult result = null;
	
	
	public ShellClientResult(String path) {
		this.path=path;
		result = createresult(path);
	}
	
	
	public AnalysisReportResult createresult(String path) {
		File file = new File(path);
		JAXBContext context;
		Unmarshaller unmarshaller;
		AnalysisReportResult result = null;
		try {
			context = JAXBContext.newInstance(AnalysisReportResult.class);
			unmarshaller = context.createUnmarshaller();
			result = (AnalysisReportResult)unmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot instantiate the xml: "+path);
		}
		return result;
	}
	public List<Bug> getCriticalBugs() {
		List<Bug> bugs = new ArrayList<Bug>();
		SortedSet<com.juliasoft.julia.api.engine.warning.JuliaWarningMessage> list = result.getWarnings();
		for(com.juliasoft.julia.api.engine.warning.JuliaWarningMessage msg:list) {
			String rank = ""+msg.getWarningRank();
			if(rank.equals("CRITICAL")) {
				bugs.add(new Bug(getSource(msg.getWarningMessage()),getSink(msg.getWarningMessage()),getMethodName(msg.getWarningMessage()), rank));
				System.out.println(""+msg.getWarningMessage()+msg.getWarningRank());
			}
		}
		return bugs;
	}

	public String getMethodName(String warning) {
		String methodName = "";
		String Words[]=warning.split(" ");
		methodName = Words[Words.length-1];
		methodName = methodName.replaceAll("^\"|\"$", "");
		//System.out.println(methodName);
		return methodName;
	}
	public String getSource(String warning) {
		String Words[]=warning.split(" ");
		return Words[7];
	}
	public String getSink(String warning) {
		String Words[]=warning.split(" ");
		return Words[9];
	}
}
