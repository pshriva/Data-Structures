package three;

import java.util.ArrayList;

public class SetOfStacks {
	ArrayList<Stack> stack = new ArrayList<Stack>();

	public void push(int element) {
		// TODO Auto-generated method stub
		Stack last = getLastStack();
		if(last != null && !last.isFull()){
			last.push(element);
		}else{
			Stack s = new Stack();
			s.push(element);
			stack.add(s);
		}
	}

	private Stack getLastStack() {
		// TODO Auto-generated method stub
		if(stack.size() == 0){
			return null;
		}
		return stack.get(stack.size()-1);
	}

	public int pop() {
		// TODO Auto-generated method stub
		Stack last = getLastStack();
		int element = last.pop();
		if(last.top == -1){
			stack.remove(last);
		}
		return element;
	}

	public int pop(int index) throws Exception {
		// TODO Auto-generated method stub
		int element;
		if(stack.size() > index){
			System.out.println("Index size is " + stack.size());
			Stack s = stack.get(stack.size() - (stack.size() - index));
			element = s.pop();
			if(s.top == -1){
				stack.remove(s);
				
			}
		}else{
			throw new Exception("This index does not exist");
		}
		return element;
		
		
	}

}
