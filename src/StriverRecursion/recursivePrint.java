package StriverRecursion;

import java.util.ArrayList;

public class recursivePrint {
	public static void printnumbers(int count,int n,ArrayList<Integer> list)
	{
		if(count==n)
		{
			return;
		}
		System.out.println("hi: current number is --> " + count);
		list.add(count);
		
		printnumbers(count+1,n,list);
	}
	public static void sumOfEvennumbers(int count,int n,ArrayList<Integer> list,int sum)
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
		
		sumOfEvennumbers(count+1,n,list,sum);
	}
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	printnumbers(0,10,list);
	

	System.out.println("4th elemet of list    --->"+list.get(3));
}
}
