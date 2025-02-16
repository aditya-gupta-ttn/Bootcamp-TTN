package Assignment3;

// Q3)Design a Data Structure SpecialStack that supports all the stack operations like
// push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum
// element from the SpecialStack. (Expected complexity ­ O(1))
import java.util.Stack;

class Question3SpecialStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public Question3SpecialStack () {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int data) {
        mainStack.push(data);
        if (minStack.isEmpty() || data <= minStack.peek()) {
            minStack.push(data);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int popped = mainStack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
        return popped;
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        Question3SpecialStack  stack = new Question3SpecialStack();
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(10);

        System.out.println("Minimum element: " + stack.getMin()); // Should print 1
        stack.pop();
        stack.pop();
        System.out.println("Minimum element: " + stack.getMin()); // Should print 2
    }
}


