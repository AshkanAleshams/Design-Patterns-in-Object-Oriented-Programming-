package BoundedStackExample;

import java.util.ArrayList;

public class demoStack {

	public static void main (String [] argv) {
		BoundedStack<String> s =
		new BoundedStack<String>(2, new ArrayList<String>());
		try {
			s.push("foo");
			s.push("bar");
			s.push("won’t fit");
		} catch (StackFullException e) {
			System.out.println("Stack is full!");
		}
		try {
			System.out.println(s.pop());
			System.out.println(s.pop());
			s.pop();
		} catch (StackEmptyException e) {
			System.out.println("Stack is empty!");
		}
	}
}
