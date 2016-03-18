package cn.tju.st;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class TestTriangle2 {
	private int a;
	private int b;
	private int c;
	private String expected;
	private Triangle2 tri=null;
	public TestTriangle2(int a,int b,int c,String expected)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.expected=expected;
	}
	@Before
	public void setUp() throws Exception {
		tri = new Triangle2();
	}

	@After
	public void tearDown() throws Exception {
		
	}
	@Parameters
	public static Collection<Object[]> getData()
	{ 
		return Arrays.asList(
				new Object[][]
						{ 
						{3,3,3,"equilateral"}, 
						{2,3,3,"isosceles"}, 
						{3,3,4,"isosceles"},
						{3,5,3,"isosceles"},
						{3,4,5,"scalene"},
						{5,6,7,"scalene"}
						}
				); 
	
	}
	@Test
	public void test() {
		assertEquals(this.expected,tri.judge(this.a,this.b,this.c));
	}

}
