package winsoft;

import java.util.Arrays;

public class MergeArrays {
	public static void mergeArrays(int[]x,int[]y)
	{
		int m=x.length;
		int n = y.length;
		
		int k =m-1;
		for(int i = m-1;i>=0;i--)
		{
			if(x[i]!=0)
			{
				x[k--]=x[i];
			}
		}
		
		int i=k+1;
		int j=0;
		int l=0;
		while(i<m && j<n)
		{
			if(x[i]<y[j])
			{
			x[l++]=x[i++];
			}
			else
			{
				x[l++] = y[j++];
			}
		}
		
		while(j<n)
		{
			x[l++]=y[j++];
		}
	}
	public static void main(String[] args) {
		int []x= {0,2,0,3,0,5,6,0,0};
		int []y= {1,8,9,10,15};
		mergeArrays(x,y);
		System.out.println("Merged Array: "+Arrays.toString(x));


	}

}
