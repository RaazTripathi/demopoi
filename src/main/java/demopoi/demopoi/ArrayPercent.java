package demopoi.demopoi;

public class ArrayPercent {
	
	
	
	
	
	
	public void calpercent(int []a )
	{
		
		int count ;
		int length= a.length;
		count =lessthenorequal(a,3);
		System.out.println(percentage(length, count)+"% of the numbers are less than or equal to 3");
		
		
		count =lessthenorequal(a,8);
		System.out.println(percentage(length, count)+"% of the numbers are less than or equal to 8");

		count =lessthenorequal(a,16);
		System.out.println(percentage(length, count)+"% of the numbers are less than or equal to 16");

		count =lessthenorequal(a,20);
		System.out.println(percentage(length, count)+"% of the numbers are less than or equal to 20");

		count =lessthenorequal(a,22);
		System.out.println(percentage(length, count)+"% of the numbers are less than or equal to 22");

		
	}
	
	
	
	public int percentage (int length,int count)
	{
		return (count/length)*100;
	}
	
	
	public int lessthenorequal(int []a,int num)
	{
		int count=0;
		for (int i:a)
		{
			if (i<=num)
			{
				count++;
			}
		}
		return count;
	}

}

 class caller {
	
	
	public static void main (String s[])
	{
		ArrayPercent ap=new ArrayPercent();
		int [] a= {8, 6, 6, 20, 9, 1, 12, 16, 3, 16, 22, 2} ;
		ap.calpercent(a);
	
	}
	
}
