package at.fhj.iit;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception
    {
    	s = new StringStack(5); // keep size of 5 !!
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
    	Assert.assertTrue(s.isEmpty());
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception
    {
    	s.push("test");
    	Assert.assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
    	//add elements
    	s.push("one");
    	s.push("two");
    	s.push("three");
    
    	//use assert and pop check if elements are as expected
    	
    	Assert.assertEquals("three", s.pop());
    	Assert.assertEquals("two", s.pop());
    	Assert.assertEquals("one", s.pop());
    
    	Assert.assertTrue(s.isEmpty());
    
    }
    
    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */
	 @Test
	 public void testSameElements() {

        s.push("test");
        s.push("test");
        s.push("test");
        s.push("test");


    }
	@Test (expected = Exception.class)
	public void testOverflow(){
		
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.push("5");
		s.push("6");
    
    }
    
}
