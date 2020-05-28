import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveTest {

	@Test
	public void test() 
	{
		Remove ob=new Remove();
		String result=ob.check("aabcd");
		assertEquals("bcd",result);
		
	}
	@Test
	public void test1() 
	{
		Remove ob=new Remove();
		String result=ob.check("aa");
		assertEquals("",result);
		
	}
	@Test
	public void test2() 
	{
		Remove ob=new Remove();
		String result=ob.check("");
		assertEquals("",result);
		
	}
	
	@Test
	public void test3() 
	{
		Remove ob=new Remove();
		String result=ob.check("a");
		assertEquals("",result);
		
	}
	
	@Test
	public void test5() 
	{
		Remove ob=new Remove();
		String result=ob.check("bc");
		assertEquals("bc",result);
		
	}
	@Test
	public void test6() 
	{
		Remove ob=new Remove();
		String result=ob.check("ab");
		assertEquals("b",result);
		
	}
	@Test
	public void test7() 
	{
		Remove ob=new Remove();
		String result=ob.check("ca");
		assertEquals("c",result);
		
	}
}