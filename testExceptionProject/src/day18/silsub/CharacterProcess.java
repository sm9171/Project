package day18.silsub;

import exception.sample.ZeroDivideException;

public class CharacterProcess {
	
	public CharacterProcess(){}
	
	public int countAlpha(String s) throws CharCheckException{
	int sum=0;
		for(int i=0;i<s.length();i++)
	{
		if((s.charAt(i)>='a'&&s.charAt(i)<='z')||s.charAt(i)>='A'&&s.charAt(i)<='Z'){
			sum++;
		}
		if(s.charAt(i)==' ')
			throw new CharCheckException("공백이 포함되어 있습니다.");
	}
	return sum;
	}
}
