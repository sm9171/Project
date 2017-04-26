package array;

public class Test10 {

	public static void main(String[] args) {
		int count=0;
		int [][] array = {
				{12, 41, 36, 56}, 
				{82, 10, 12, 61}, 
				{14, 16, 18, 78}, 
				{45, 26, 72, 23}}; 
		for(int i=0;i<array.length;i++)
		{
			for(int j=0; j<array[i].length;j++)
			{
				if(array[i][j]%3==0){
					
					count++;
				}
			}
		}
		int[] copyAr = new int[count-1];
		System.out.print("copyAr : ");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0; j<array[i].length;j++)
			{
					
					copyAr[i]=array[i][j];
					if(array[i][j]%3==0){
					System.out.print(copyAr[i]+ "  ");
					}
			}
		}
		
		
	}
	
}
