package KadanesAlgorithm;
//2nd method
import java.util.ArrayList;
import java.util.List;

public class SubarraySumLongest3 {
	
	public static int findSum(int[] arr)
	{
		
		int max = Integer.MIN_VALUE;
		int sum=0;
		for(int i= 0;i<arr.length;i++) {
			sum+=arr[i];
			max=Math.max(sum,max);
			if(sum<0)
			{
				sum=0;
			}	
		}
		return max;
	}
public static void main(String[] args) {
	int[] arr = {1,-1,-5,-2,-5};
	System.out.println(findSum(arr));
	
	}
}
