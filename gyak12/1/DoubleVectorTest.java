import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
//import org.junit.Assert;
import org.junit.Test;

public class DoubleVectorTest {

	@Test
	public void equalsIsReflexiv() {
		DoubleVector v1 = new DoubleVector(1,3);
		assertTrue(v1.equals(v1));
		//Assert.assertTrue(v1.equals(v1));
	}

	@Test
	public void equalsIsNull() {
		DoubleVector v1 = new DoubleVector(1,3);
		assertFalse(v1.equals(null));

	}
	
	@Test
	public void equalsIsSymmetric1() {
		DoubleVector v1 = new DoubleVector(1,3);
		DoubleVector v2 = new DoubleVector(1,3);
		assertTrue(v1.equals(v2));
		assertTrue(v2.equals(v1));

	}
	
	@Test
	public void equalsIsSymmetric2() {
		DoubleVector v1 = new DoubleVector(1,3);
		DoubleVector v2 = new DoubleVector(1,5);
		assertFalse(v1.equals(v2));
		assertFalse(v2.equals(v1));
		
	}
	
	@Test
	public void equalsIsTransitive2() {
		DoubleVector v1 = new DoubleVector(1,3);
		DoubleVector v2 = new DoubleVector(1,5);
		DoubleVector v3 = new DoubleVector(1,3);
		if(v1.equals(v2) && v2.equals(v3)) {
			assertTrue(v1.equals(v3));
			
		}
		
	}
	
	@Test(expected = NullPointerException.class)
	public void equalsOnNull() {
		DoubleVector v1 = new DoubleVector(1,3);
		DoubleVector v2 = null;
		
		v2.equals(v1);
		
	}
	
	@Test
	public void equalsObjectHashCodeIsSame() {
		DoubleVector v1 = new DoubleVector(1,3);
		DoubleVector v2 = new DoubleVector(1,3);
		assertTrue(v1.equals(v2));
		assertTrue(v1.hashCode() == v2.hashCode());
			
	}
	

}