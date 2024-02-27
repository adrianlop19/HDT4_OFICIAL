package uvg.edu.gt;

public class Calculator {
    private final String stackType;
    private StackFactory<Character> charStackFactory;
    private StackFactory<Integer> intStackFactory;

    public Calculator(String stackType) {
        charStackFactory = new StackFactory<Character>();
        intStackFactory = new StackFactory<Integer>();
        this.stackType = stackType;
    }

    private static int getPrecedence(char p) {
        switch (p) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        UVGStack<Character> stack = charStackFactory.createStack(stackType);
        stack.push('#');
        for (char p : infix.toCharArray()) {
            if (Character.isDigit(p)) {
                postfix.append(p);
            } else if (p == '(') {
                stack.push(p);
            } else if (p == ')') {
                while (stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (stack.peek() != '#' && getPrecedence(p) <= getPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(p);
            }
        }
        while (stack.peek() != '#') {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    public int postfix(String op) {
        UVGStack<Integer> stack = intStackFactory.createStack(stackType);
        for (char p : op.toCharArray()) {
            if (Character.isDigit(p)) {
                stack.push(Integer.parseInt(String.valueOf(p)));
            } else if (!(p == ' ')) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                switch (p) {
                    case '+':
                        stack.push(n1 + n2);
                        break;
                    case '-':
                        stack.push(n2 - n1);
                        break;
                    case '*':
                        stack.push(n2 * n1);
                        break;
                    case '/':
                        stack.push(n2 / n1);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public int eval(String op){
        return postfix(infixToPostfix(op));
    }

}
