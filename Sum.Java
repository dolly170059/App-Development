package recursionPuzzles;

public class Sum {

	private static int Sum (int n) {
		// Replace the following function with the recursive function to be tested
		if (n > 0) 
		return (Sum(n-1) + n);
		return n;
		
}
	public static void main(String [] args) {
		// Local variables used for testing
		int actualResult = 0;
		int expectedResult;
		
		// Test Number 1
		actualResult = Sum(0);	                // Test the Base Case
		expectedResult = 15;					// Replace this line with what the actual expected result should be
		if (actualResult == expectedResult)
			System.out.println("Test 1: Pass; Result: " + actualResult);
		else
			System.out.println("Test 1: Fail; Result: " + actualResult + "; Expected: " + expectedResult);
	}}
