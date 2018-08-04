package BuckyIntermdediate;

import java.util.Stack;

public class StackPushPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>s = new Stack<String>();
		s.push("Bottom");
		printStack(s);
		s.push("middle");
		printStack(s);
		s.push("First");
		printStack(s);
		s.pop();
		printStack(s);
		s.pop();
		printStack(s);
		s.pop();
		printStack(s);
	}
	private static void printStack(Stack<String> s) {
		
		if(s.isEmpty())
			System.out.println("Stack is Empty");
		else
			System.out.printf("%s Top\n ", s);
	}

}
