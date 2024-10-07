package StriverRecursion;

import java.util.ArrayList;

public class sum0fEvenNumbers {
	static int  sum = 0;

	public static void sumOfEvennumbers(int count,int n,ArrayList<Integer> list)
	{
		if(count==n)
		{
			return;
		}
		if(count%2==0)
		{	sum=sum+count;
			list.add(count);
			System.out.println("hi: current even number is --> " + count);
		}
		sumOfEvennumbers(count+1,n,list);
	}
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
		sumOfEvennumbers(0,10,list);
	System.out.println("4th elemet of list---> "+list.get(3)+" sum is "+sum);
}
}
