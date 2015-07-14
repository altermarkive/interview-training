package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/implement-stack-using-queues/
 */
public class LC225ImplementStackUsingQueues {
    private Queue<Integer> active = new LinkedList<>();
    private Queue<Integer> other = new LinkedList<>();

    private void swap() {
        Queue<Integer> swap = other;
        other = active;
        active = swap;
    }

    // Push element x onto stack.
    public void push(int x) {
        // 1 - active
        other.add(x);
        while (active.size() > 0) { // ! empty
            other.add(active.poll());
        }
        swap();
    }

    // Removes the element on top of the stack.
    public void pop() {
        active.poll();
    }

    // Get the top element.
    public int top() {
        return active.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return active.isEmpty();
    }

    // It's also possible with just one stack

    public static void main(String[] arguments) {
        LC225ImplementStackUsingQueues solution = new LC225ImplementStackUsingQueues();
        solution.push(5);
        solution.push(2);
        System.out.println(solution.top());
        solution.pop();
        System.out.println(solution.top());
        solution.pop();
    }
}
