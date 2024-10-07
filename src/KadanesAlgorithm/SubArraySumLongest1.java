package KadanesAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class SubArraySumLongest1 {
	public static int findSum(int[] arr)
	{
		
		int max = Integer.MIN_VALUE;
		for(int i= 0;i<arr.length;i++) {
			for(int j= 0;j<arr.length;j++) {
				int sum=0;	
				for(int k= i;k<=j;k++) {
					sum+=arr[k];
					
					max=Math.max(sum,max);
				}	
			}
		}	
		return max;
	}
public static void main(String[] args) {
	int[] arr = {1,-1,5,-2,5};
	System.out.println(findSum(arr));

}
}
