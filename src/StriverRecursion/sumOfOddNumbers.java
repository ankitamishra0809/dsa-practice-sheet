package StriverRecursion;

import java.util.ArrayList;

public class sumOfOddNumbers {
	public static int findsumofOddNumbers(int start,int end,int sum, ArrayList<Integer> list) {
		if(start==end)
		{
			System.out.println("final base case: "+sum);

			return sum;
		}
		if(start%2!=0)
		{
			sum+=start;
			list.add(start);
			System.out.println("odd numbers: " +start);
		}
		return findsumofOddNumbers(start+1,end,sum,list);
	}
public static void main(String[] args) {
	int sum=0;
	ArrayList<Integer> list = new ArrayList<>();
	int ans = findsumofOddNumbers(0,10,sum,list);
	System.out.println("sum of all odd numbers: "+ans);
}
}
