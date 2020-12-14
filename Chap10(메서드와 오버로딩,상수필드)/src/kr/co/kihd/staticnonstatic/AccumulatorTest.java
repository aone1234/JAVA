package kr.co.kihd.staticnonstatic;

class A {
	
	int data1 = 10;
	int data2 = 20;
	
}

public class AccumulatorTest {

	public static void main(String[] args) {
		
		Accumulator accum = new Accumulator();
		int iResult = accum.add(10, 50);
		System.out.println("iResult : " + iResult);

		// 접미사 반드시 붙이도록 함.
		long lResult = accum.add(100, 7500L);
		System.out.println("lResult : " + lResult);
		
		lResult = accum.add(1000L, 10);
		System.out.println("lResult : " + lResult);
		
		double dResult = accum.add(115.2, 4.5);
		System.out.println("lResult : " + dResult);
		
		lResult = accum.add(new int[] {1,2,3,4,5});
		System.out.println("lResul :" + lResult);
		
		iResult = accum.add(new A());
		System.out.println("iResult : " + iResult);

		int result1 = accum.divide(10,4);
		double result2 = accum.divide(10.0, 4.0);
	
   }
	
}

