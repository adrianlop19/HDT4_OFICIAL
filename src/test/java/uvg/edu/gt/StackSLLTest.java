package uvg.edu.gt;

import junit.framework.TestCase;

public class StackSLLTest extends TestCase {

    public void testPush() {
        StackSLL<String> stack = new StackSLL<>();
        stack.push("p");
        assertEquals("p", stack.peek());
    }

    public void testPop() {
        StackSLL<String> stack = new StackSLL<>();
        stack.push("a");
        stack.push("Hello");
        assertEquals("Hello", stack.pop());
        assertEquals("a", stack.peek());
    }

    public void testPeek() {
        StackSLL<String> stack = new StackSLL<>();
        stack.push("b");
        stack.push("b");
        assertEquals("b", stack.peek());
    }

    public void testIsEmpty() {
        StackSLL<Double> stack = new StackSLL<>();
        assertTrue(stack.isEmpty());
        stack.push(3.14);
        assertFalse(stack.isEmpty());
    }
}