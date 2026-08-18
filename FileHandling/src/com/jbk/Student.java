package com.jbk;

import java.io.Serializable;

public class Student implements Serializable {

	int stdId;
	String stdName;
	String stdBranch;
	int rollNo;

	public Student(int stdId, String stdName, String stdBranch, int rollNo) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdBranch = stdBranch;
		this.rollNo = rollNo;
	}

}
