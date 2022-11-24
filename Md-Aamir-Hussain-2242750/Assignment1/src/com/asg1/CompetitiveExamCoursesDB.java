package com.asg1;

import java.util.Arrays;
import java.util.List;

public class CompetitiveExamCoursesDB {
	
	
	public static List<CompetitiveExamCourses> getCompetitiveExamCoursesList(){
		
		CompetitiveExamCourses c1=new CompetitiveExamCourses(1,"JEE","ABC",18,50000);
		
		CompetitiveExamCourses c2=new CompetitiveExamCourses(2,"CAT","CDE",12,20000);
		
		CompetitiveExamCourses c3=new CompetitiveExamCourses(3,"NEET","EFG",15,25000);
		
		CompetitiveExamCourses c4=new CompetitiveExamCourses(4,"JRE","GHI",15,24000);
		
		CompetitiveExamCourses c5=new CompetitiveExamCourses(5,"JRF","IJK",18,23000);
		
		CompetitiveExamCourses c6=new CompetitiveExamCourses(6,"IAS","KLM",6,30000);
		
		CompetitiveExamCourses c7=new CompetitiveExamCourses(7,"UPSC","MNO",4,35000);
		
		CompetitiveExamCourses c8=new CompetitiveExamCourses(8,"BPSC","OPQ",8,30000);
		
		CompetitiveExamCourses c9=new CompetitiveExamCourses(9,"BANK PO","RST",10,15000);
		
		CompetitiveExamCourses c10=new CompetitiveExamCourses(10,"INDIAN RAIL","TUV",12,10000);
		
		CompetitiveExamCourses c11=new CompetitiveExamCourses(11,"CDS","VWX",12,5000);
		
		CompetitiveExamCourses c12=new CompetitiveExamCourses(12,"INDIAN ARAMY","XYZ",20,20000);
		
		CompetitiveExamCourses c13=new CompetitiveExamCourses(13,"INDIAN NAVY","ZAB",17,17000);
		
		CompetitiveExamCourses c14=new CompetitiveExamCourses(14,"PUC","BAC",13,50000);
		
		CompetitiveExamCourses c15=new CompetitiveExamCourses(15,"GENERAL","CAD",9,50000);
		
		return Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15);
		
		
	}

}
