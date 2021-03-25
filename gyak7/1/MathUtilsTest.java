import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MathUtilsTest {
	
	public static final double EPSILON = 0.01;
	
	@Test
	public void testPosRaisedToPos() {
		
		double result = MathUtils.power(2,3);
		assertEquals( 8 , result , EPSILON);
	}

	@Test
	public void testPosRaisedToZero() {
		
		double result = MathUtils.power(2,0);
		assertEquals( 1 , result , EPSILON);
	}

	@Test
	public void testZeroRaisedToPos() {
		
		double result = MathUtils.power(0,3);
		assertEquals( 0 , result , EPSILON);
	}
	
	@Test
	public void testOneRaisedToPos() {
		
		double result = MathUtils.power(1,111233);
		assertEquals( 1 , result , EPSILON);
	}

	@Test
	public void testZeroRaisedToZero() {
		
		double result = MathUtils.power(0,0);
		assertEquals( 1 , result , EPSILON);
	}

	
	@Test
	public void testPosRaisedToNeg() {
		
		double result = MathUtils.power(2,-2);
		assertEquals( 0.25 , result , EPSILON);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testZeroRaisedToNeg() {
		
		double result = MathUtils.power(0,-2);
		
	}


}