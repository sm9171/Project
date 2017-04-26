package ncs.test4;

public class TestSort {

	public static void main(String[] args) {
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			int b=(int)((Math.random()*100)+1);
			if(b<=50)
			a[i]=b+50;
			else
			a[i]=b;
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			System.out.print(a[i]+ " ");
			
		}
	}

}
