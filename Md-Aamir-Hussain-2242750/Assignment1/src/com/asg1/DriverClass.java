package com.asg1;

import java.util.List;

public class DriverClass {
	
//	
//	* on price in descending order and
//	* if price is same, then sort on duration form shortest to longest
//	* and print
	
	public static void getSortedListCompetitiveExamCourses() {
		
		List<CompetitiveExamCourses> courseList=CompetitiveExamCoursesDB.getCompetitiveExamCoursesList();
		
		courseList.sort((p1,p2)->{
			if((p2.getTotalFee()>p1.getTotalFee())) {
				return 1;
			}
			if(p1.getTotalFee()==p2.getTotalFee()) {
				if(p1.getCourseDuration()>p2.getCourseDuration()) {
					return 1;
				}
				
			}
			return -1;
		});	
		
		courseList.forEach(p->System.out.println(p));
	}

	
	public static void main(String[] args) {
		getSortedListCompetitiveExamCourses();
		
	}

}
