package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component
public class MarksService {

	public int totalMarks(int s1, int s2, int s3) {
		
		return s1+s2+s3;
	}

    public double percentage(int total) {
    	
    	return(total / 300.0) * 100;
    }

    public String grade(double percentage) {
    	
    	if(percentage>=90)
    		return "A";
    	else if(percentage>=75)
    		return "B";
    	else if(percentage>=50)
    		return "C";
    	else 
    		return "Fail";
    }
}
