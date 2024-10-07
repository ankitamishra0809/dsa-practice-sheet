package StriverRecursion;

public class fun1 {

	static int fun1recur(int x, int y) 
	{ 
	    if (x == 0) 
	        return y; 
	    else
	    {
	    	System.out.println("hi:  y "+y + "   its x: "+x);
	        return fun1recur(x - 1, x + y); 
	    }
	}
	public static void main(String[] args) {
		int x=10;
		int y=1;
		int ans = fun1recur(x,y);
		System.out.println(ans);
	}
}
