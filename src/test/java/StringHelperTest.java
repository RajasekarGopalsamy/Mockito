import static org.junit.Assert.*;

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
public class StringHelperTest {

	StringHelper stringHelper ;
	
	String  inputParam;
	
	String  expectedParam;
	
	public StringHelperTest(String inputParam, String expectedParam) {
		super();
		this.inputParam = inputParam;
		this.expectedParam = expectedParam;
	}

	@Before
	public void setup() {
		stringHelper = new StringHelper();
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass is executed..");
	}

	
	@After
	public void teardown() {
		stringHelper= null;
	}

	
	@AfterClass
	public static void afterClass() {
		System.out.println("Afterclass gets Executed");
	}
	
	@Parameters
	public static Collection<String[]> paramertizeINOUTData(){
		String[][] expectedOutput = {{"AACD","CD"},
									{"AER","TR"}
		}; 
		
		return Arrays.asList(expectedOutput);
		
	}
	
	@Test
	public void testTruncateAInFirst2PositionsWhenAmountIsWithDrawn_StartingWith2A() {
		//fail("Not yet implemented");
		
		assertEquals("Objects are Same", expectedParam, stringHelper.truncateAInFirst2Positions(inputParam));
		//assertEquals("JB", stringHelper.truncateAInFirst2Positions("AJB"));
		//assertEquals(stringHelper.truncateAInFirst2Positions("BAJB"),"JB");
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testTruncateAInFirst2PositionsWhenAmountIsWithDrawn2_StartingWithA() {
		//fail("Not yet implemented");
		
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
		//assertEquals("JB", stringHelper.truncateAInFirst2Positions("AJB"));
		//assertEquals(stringHelper.truncateAInFirst2Positions("BAJB"),"JB");
	}
	
	@Test
	public void testTruncateAInFirst2PositionsWhenAmountIsWithDrawn_NoA() {
		//fail("Not yet implemented");
		
		assertEquals("CDEF", stringHelper.truncateAInFirst2Positions("CDEF"));
		assertEquals("CDAA", stringHelper.truncateAInFirst2Positions("CDAA"));
		//assertEquals("JB", stringHelper.truncateAInFirst2Positions("AJB"));
		//assertEquals(stringHelper.truncateAInFirst2Positions("BAJB"),"JB");
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_WhenComparingNoMatchingWord_NegaviteScenario() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("CDDE"));
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_WhenComparingMatchingWord_PositiveScenario() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
}
