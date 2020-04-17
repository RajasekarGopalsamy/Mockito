import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class ArraysCompareTest {
	

	

	int inputArray ; 
	int  outputArray ;

	public ArraysCompareTest(int inputArray, int outputArray) {
		super();
		this.inputArray = inputArray;
		this.outputArray = outputArray;
	}

	@Parameters
	public static Collection<int[]> inputParameterization() {
		int expectedOutputs [][] = {
				{1,2},{3,4}	
				};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testsuiteParamterizedArrayComp() {
		//Arrays.sort(inputArray);
		//Arrays.sort(outputArray);
		assertEquals(outputArray, inputArray);
		
	}
	
	@Test
	public void testsuiteArrayComparision() {
		int[] numbers = {1,12,3,14,5,16};
		int[] number_actual = {1,4,2,6,7};
		int[] number_expected = {2,4,6,7,1};
		Arrays.sort(number_actual);
		Arrays.sort(number_expected);
		assertArrayEquals(number_expected, number_actual);
		
		/*
		 * Arrays.sort(numbers); Arrays.asList(numbers).stream().forEach(number ->
		 * System.out.println(number)); System.out.println(Arrays.toString(numbers));
		 */
	}
	
	@Test(expected = NullPointerException.class)
	public void testArrayComparision_ExceptionOutput() {
		int inputArray[] = null;
		System.out.println();
		Arrays.sort(inputArray);
	}
	
	@Test(timeout=100)
	public void testTimeout_functionality() {
		int Array[] = new int[1000000];
		int a;
		for(a=0;a < Array.length;a++) {
		 Array[a]=a;
		}
		System.out.println("Timeout ---" + Array[a-1]);
	}
	
}
