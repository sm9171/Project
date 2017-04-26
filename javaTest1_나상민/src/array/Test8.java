package array;

public class Test8 {

	public static void main(String[] args) {
		int sum=0;
		int sum2=0;
		int [][] array = {
				{12, 41, 36, 56}, 
				{82, 10, 12, 61}, 
				{14, 16, 18, 78}, 
				{45, 26, 72, 23}}; 
	for(int i=0;i<array.length;i++)
	{
		for(int j=0; j<array[i].length;j++)
		{
			sum2=array[i].length;
			sum+=array[i][j];
		}
	}
	System.out.println("ÇÕ°è : " + (double)sum);
	System.out.println("Æò±Õ : " + (sum/(double)(sum2*array.length)));
	
	
	}

}
