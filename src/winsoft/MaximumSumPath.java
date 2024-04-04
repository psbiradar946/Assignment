package winsoft;

public class MaximumSumPath {

	public static int maxSumPath(int[]x,int[]y)
	{
		int m = x.length;
		int  n = y.length;
		int i=0,j=0;
		int result = 0, sumX=0, sumY = 0;
		
		while(i<m && j<n)
		{
			if(x[i] == y[j])
			{
				result += Math.max(sumX, sumY) + x[i];
				sumX = 0;
				sumY = 0;
				i++;
				j++;
			}
			else if(x[i]<y[j])
			{
				sumX +=x[i];
				i++;
			}
			else
			{
				sumY += y[j];
				j++;
			}
		}
		while(i<m)
		{
			sumX += x[i];
			i++;
		}
		while(j<n)
		{
			sumY += y[j];
			j++;
		}
		result += Math.max(sumX, sumY);
		return result;
	}
	public static void main(String[] args) {
		int[]x = {3,6,7,8,10,12,15,18,100};
		int[]y = {1,2,3,5,7,9,10,11,15,16,18,25,50};
		System.out.println("Maximum Sun Path: "+maxSumPath(x,y));
	}

}
