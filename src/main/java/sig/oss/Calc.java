public class Calc {

	private int r = 0;

	public int add(int x,int y){//add method
		return x+y;
	}

	public int sub(int x, int y){//sub method
		return x-y;
	}

	public int mul(int x, int y){//multiplication method 1 2
		return x*y;
	}


	public void inc(int x){
		r = r-x;
	}
	
	public void dec(int d){ //add method
		r = r-d;
	}
}

