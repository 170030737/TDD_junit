package junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class removeATest {

	@Test
	public void test1Remove() {
		removeA r1=new removeA();
		String test=r1.remove("ABCD");
		assertEquals("BCD",test);
	}
	@Test
	public void test2Remove() {
		removeA r1=new removeA();
		String test=r1.remove("AACD");
		assertEquals("CD",test);
	}
	@Test
	public void test3Remove() {
		removeA r1=new removeA();
		String test=r1.remove("BACD");
		assertEquals("BCD",test);
	}
	@Test
	public void test4Remove() {
		removeA r1=new removeA();
		String test=r1.remove("BBAA");
		assertEquals("BBAA",test);
	}
	@Test
	public void test5Remove() {
		removeA r1=new removeA();
		String test=r1.remove("AABAA");
		assertEquals("BAA",test);
	}

}
