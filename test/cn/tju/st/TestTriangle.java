package cn.tju.st;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestTriangle {

	@Before
	public void setUp() throws Exception {
		System.out.println("This is before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is after test");
	}

	@Test
	public void test() {
		Triangle tri = new Triangle(3,3,3);
		assertEquals("equilateral",tri.judge());
		/*
		tri = new Triangle(2,3,3);
		assertEquals("isosceles",tri.judge());
		tri = new Triangle(3,3,1);
		assertEquals("isosceles",tri.judge());
		tri = new Triangle(3,5,3);
		assertEquals("isosceles",tri.judge());
		tri = new Triangle(3,4,5);
		assertEquals("scalene",tri.judge());
		tri = new Triangle(5,6,7);
		assertEquals("scalene",tri.judge());
		*/
	}

}
