import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.in28minutes.junit.helper.StringHelper;
@RunWith(Parameterized.class)
public class QuickBeforeAfterTest {
	
	StringHelper strHelper = new StringHelper();
	String inputParam;

	public QuickBeforeAfterTest(String inputParam) {
		super();
		this.inputParam = inputParam;
	}


	@Parameters
	public static Collection<String> inputParameters() {
		String[] inputElements = {"AABAA","AABAA"};
		return Arrays.asList(inputElements);
	}
	
	
	@Test
	public void TestareFirstAndLastTwoCharactersTheSame_PositiveAndNegativeScenarios() {
		
		assertTrue(strHelper.areFirstAndLastTwoCharactersTheSame(inputParam));
		/* assertFalse(strHelper.areFirstAndLastTwoCharactersTheSame("AAB")); */
	}
	
	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	
	/*
	 * @Test public void test1() { System.out.println("Test1 Executed.."); }
	 * 
	 * @Test public void test2() { System.out.println("Test2 Executed.."); }
	 */
	
	@After
	public void deinitialize() {
		System.out.println("After test");
	}
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass is executed..");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Afterclass gets Executed");
	}
	
}
