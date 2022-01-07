package BoundedStackExample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class testBoundedStack {

	//tests for testing the push 
	
	@Test
	public void testStackEmpty() { //passing in an empty stack
		List<String> list = new ArrayList<String>();
		BoundedStack<String> stack = new BoundedStack<String>(2, list);
		
		try {
			stack.push("Helli");
			assertEquals(stack.pop(), "Helli");
		} catch (StackFullException e) {
			fail("Unexpected" + e);
		} catch (StackEmptyException e) {
			fail("Unex[ected" + e);
		}
		
		
	}
	
	@Test
	public void testStackNotEmpty() {//testing on passing a non-empty list
		List<String> list = new ArrayList<String>();
		list.add("one");
		
		BoundedStack<String> stack = new BoundedStack<String>(2, list);
		
		try {
			stack.push("two");
			assertEquals(stack.pop(), "two");
		} catch (StackFullException e) {
			fail("Unexpected" + e);
		} catch (StackEmptyException e) {
			fail("Unex[ected" + e);
		}
	}
	
	//TEsting exception works correctly 
	
	@Test 
	public void testStackFull() throws StackFullException {
		List<String> list = new ArrayList<String>();
		BoundedStack<String> stack = new BoundedStack<String>(2, list);
		
		Exception exception = assertThrows(StackFullException.class, () -> {
			stack.push("One");
			stack.push("two");
			stack.push("full");
			
		});
		
	
		
	}

}
