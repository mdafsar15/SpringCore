package com.genx.springcore.collection;

import java.util.List;

public class Student {

	private List<Integer> marks;

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + "]";
	}

}
