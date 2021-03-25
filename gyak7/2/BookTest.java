import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class BookTest {

	@Before
	public void setUp() {
		Book.resetId();
	}

	@After
	public void tearDown() {
		Book.resetId();
	}

	@Test
	public void BookSetParameters() {
		Book b1 = Book.make("abc", "def", "SCIFI", "10000");
		Book b2 = Book.make("abc", "def", "SCIFI", "10000");
		
		
		assertEquals(10000, b1.getReservedPrice());
		assertEquals(10000, b2.getReservedPrice());
		assertEquals(0, b1.getId());
		assertEquals(1, b2.getId());
		
		
	}
	
	
	@Test
	public void make_parseTypes() {
		assertNull(Book.make("abc", "def", "SCIFI", "ten"));
		assertNull(Book.make("abc", "def", "NOT_GENRE", "1000"));
		assertNotNull(Book.make("abc", "def", "SCIFI", "1000"));
		
		
	}
	
	@Test
	public void checkValues() {

		assertNull(Book.make("abc", null, "SCIFI", "1000"));
		assertNull(Book.make(null, "abc", "SCIFI", "1000"));
		assertNull(Book.make("abc", "+++", "SCIFI", "1000"));
		assertNotNull(Book.make("abc", "            ", "SCIFI", "1000"));
		assertNull(Book.make("a", "abc", "SCIFI", "1000"));
		assertNull(Book.make("abc", "b", "SCIFI", "1000"));
		assertNull(Book.make("abc", "b", "SCIFI", "-1000"));
		assertNull(Book.make("abc", "b", null, "-1000"));
		
		
	}
	
	@Test
	public void test_isSameGenre() {
		Book b1 = Book.make("abc", "def", "SCIFI", "10000");
		Book b2 = Book.make("abc", "def", "SCIFI", "10000");
		Book b3 = Book.make("abc", "def", "PHILOSOPHY", "10000");


		assertFalse(Book.isSameGenre(b1,b3));
		assertTrue(Book.isSameGenre(b1,b2));
		
		
	}


	@Test(expected = IllegalArgumentException.class)
	public void compare_NotSameGenre() {
		Book b1 = Book.make("abc", "def", "SCIFI", "10000");
		Book b2 = Book.make("abc", "def", "SCIFI", "10000");
		Book b3 = Book.make("abc", "def", "PHILOSOPHY", "10000");


		b1.compare(b3);
		
		
		
	}
	
		@Test
	public void compare_isSameGenre() {
		Book b1 = Book.make("abc", "def", "SCIFI", "100000");
		Book b2 = Book.make("abc", "def", "SCIFI", "10000");
		Book b3 = Book.make("abc", "def", "SCIFI", "10000");
		


		assertEquals(1,b1.compare(b2));
		assertEquals(0,b2.compare(b3));
		assertEquals(-1,b2.compare(b1));
		
		
		
	}
}