package package1;

public class SecondMinMaxElementInArray
{
	public static void main(String[] args) 
	{
		int[] n = {6,3,8,2,4,7,1,10};
		int min=n[0],max=0;
		int smax=0,smin=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>max)
			{
				smax = max;
				max = n[i];
				
			}
			else if(n[i]<min)
			{
				smin = min;
				min = n[i];
				
			}
		}
		System.out.println("maximum : "+max);
		System.out.println("second maximum : "+smax);
		System.out.println("minimum : "+min);
		System.out.println("second minimum : "+smin);
	}

}
