package SwapNumber;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		int a=100,b=200;
		
		System.out.println("This is before swapping......"+a+"   "+b);
		// this is with third variable
		/*int t=a;
		a=b;
		b=t;
		
		System.out.println("This is After swapping....."+a+"   "+b);
		*/
		//With out variables
		
		/* a=a+b; // 10+20=30
			b=a-b; //30-20=10
			a=a-b; // 30-10=20
			System.out.println("This is After swapping....."+a+"   "+b);
		*/
		// this logic a & b should not be zero we are using arithmetic express
	/*	
		a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20
		
		System.out.println("This is After swapping....."+a+"   "+b);
	*/
		
	// Logic three bitwise XOR please use Xor calculator
	/*	
		a=a^b;//30
		b=a^b; //10
		a=a^b; //20
		
		System.out.println("This is After swapping....."+a+"   "+b);
	*/
		
	// single statement for swapping
		
		b=a+b-(a=b);
		
		System.out.println("This is After swapping....."+a+"   "+b);
		
	}

}
