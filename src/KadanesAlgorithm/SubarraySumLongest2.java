package KadanesAlgorithm;
//2nd method
import java.util.ArrayList;
import java.util.List;

public class SubarraySumLongest2 {
	
	public static int findSum(int[] arr)
	{
		
		int max = Integer.MIN_VALUE;
		for(int i= 0;i<arr.length;i++) {
			int sum=0;
			for(int j= 0;j<arr.length;j++) {
					sum+=arr[j];
					max=Math.max(sum,max);
				}
				
			
		}
		
		return max;
	}
public static void main(String[] args) {
	int[] arr = {1,-1,5,-2,5};
	System.out.println(findSum(arr));
	
	}
}
