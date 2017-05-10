package test.object.io;

import java.io.*;

public class Student extends Person implements Serializable{
	// 부모 클래스가 직렬화되어 있지 않으면, 부모 필드도 직렬화에서 제외됨.
	private String name;
	private transient int classNo;
	private double score;
	private Object ref;//object 필드는 자동으로 직렬화에서 제외됨.
	public Student(){}

	public String getName() {
		return name;
	}

	public int getClassNo() {
		return classNo;
	}

	public double getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name + ", " + classNo + ", " + score;
	}

	public Student(String name, int classNo, double score) {
		this.name = name;
		this.classNo = classNo;
		this.score = score;
	}
	
	
}
