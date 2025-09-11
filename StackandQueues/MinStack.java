import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int val = stack.pop();
        if (!minStack.isEmpty() && val == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) throw new RuntimeException("Stack is empty");
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) throw new RuntimeException("Min stack is empty");
        return minStack.peek();
    }

    // Simple test
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(5);
        System.out.println("Top: " + ms.top());     // 5
        System.out.println("Min: " + ms.getMin());  // 3
        ms.push(2);
        ms.push(2);
        System.out.println("Min after pushes: " + ms.getMin()); // 2
        ms.pop();
        System.out.println("Min after one pop: " + ms.getMin()); // 2
        ms.pop();
        System.out.println("Min after second pop: " + ms.getMin()); // 3
        ms.pop();
        System.out.println("Top after pops: " + ms.top()); // 3
    }
}
