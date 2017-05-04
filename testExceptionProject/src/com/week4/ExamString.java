package com.week4;

public class ExamString {
	public String preChar(String s){
		char b[]=s.toCharArray();
		b[0] = Character.toUpperCase(b[0]);
		s = String.valueOf(b);
		return s;
	}
	public int charSu(String s, char ch){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==ch)
				count++;
		}
		return count;
	}
}
