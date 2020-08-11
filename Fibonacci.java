public class FibonacciSequence {

	public static void main(String[] args) 

	{

		 int maxNum = 10; 

		 int previousNum = 0;

		 int nextNumber = 1;

	        System.out.print("Fibonacci Series of "+maxNum+" numbers:");

	        for (int i = 1; i <= maxNum; ++i)

	        {
	            System.out.print(previousNumber+" ");

        	int sum = previousNumber + nextNumber;

	            previousNumber = nextNumber;

	            nextNumber = sum;

	        }

 

	}

 

}
