package day18.silsub;

import exception.sample.ZeroDivideException;

public class CharacterProcess {
	
	public CharacterProcess(String message){}
	
	public int countAlpha(String s){
	int sum=0;
		for(int i=0;i<s.length();i++)
	{
		if((s.charAt(i)>='a'&&s.charAt(i)<='z')||s.charAt(i)>='A'&&s.charAt(i)<='Z'){
			sum+=i;
		}
		if(s.charAt(i)==' ')
			throw new CharCheckException("공백이 포함되어 있습니다.");
	}
	return sum;
	}
}
