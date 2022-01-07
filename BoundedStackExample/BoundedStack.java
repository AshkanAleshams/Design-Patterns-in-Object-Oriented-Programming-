package BoundedStackExample;

import java.util.Iterator;
import java.util.List;

public class BoundedStack<T> implements Iterable<T> {

	private List<T> content;
	private int capacity;
	
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public BoundedStack(int capacity, List<T> content) {
		this.content = content;
		this.capacity = capacity;
	}
	
	public T pop() throws StackEmptyException {
		if (content.isEmpty()) {
			throw new StackEmptyException();
		}
		//doing this to protect the private
		T last = content.get(content.size()-1);
		content.remove(content.size()-1);
		return last;
	}
	
	public void push(T item) throws StackFullException {
		if (content.size() == capacity) {
			//full
			throw new StackFullException();
		}
		else content.add(item);
		
	}

}
