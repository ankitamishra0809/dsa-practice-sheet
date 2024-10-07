package array;

import java.util.ArrayList;
import java.util.List;

public class subsetXORSum {
	static int ans=0;
	public static int subsetXORSum(int[] nums)
	{
		List<Integer> list = new ArrayList<>();
		findAns(0,nums,list);
		return ans;
		
	}
	public static void findAns(int index,int[] nums, List<Integer>al) {
		if(index==nums.length) {
			int result=0;
			for(int num:al) {
				result^=num;
			}
			ans+=result;
			return;
		}
		al.add(nums[index]);
		findAns(index+1,nums,al);
		al.remove(al.size()-1);
		findAns(index+1,nums,al);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int sum = subsetXORSum(arr);
		System.out.println("xor sum of all elements --> "+sum);
	}

}
