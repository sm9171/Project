package com.uni;

public class StudentTest {

	public static void main(String[] args) {
		Student arrays [] = new Student[3];
		arrays[0]=new Student("ȫ�浿",15,171,81,"201101","����");
		arrays[1]=new Student("�ѻ��",13,183,72,"201102","����");
		arrays[2]=new Student("�Ӱ���",16,175,65,"201103","����");
		for(int i=0;i<arrays.length;i++)
		{
			System.out.println(arrays[i].printInformation());
		}
	}

}
