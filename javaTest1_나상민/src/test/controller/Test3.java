package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<101)
		{
			sum+=i;
			i++;
		}
		System.out.println("ÇÕ°è : "+ (double)sum);
		System.out.println("Æò±Õ : "+ ((double)sum/i));
	}

}
