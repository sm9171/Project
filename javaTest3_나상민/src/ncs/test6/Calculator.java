package ncs.test6;

public class Calculator {
	public Calculator() {}

	public double getSum(int data) throws InvalidException {
	double sum=0;
		if(data>=2&&data<=5)
	{
		for(int i=0;i<=data;i++)
			sum+=i;
		return sum;
	}
	else
		throw new InvalidException("�Է� ���� ������ �ֽ��ϴ�.");
	}
}
