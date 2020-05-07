package exercise.holding;

import net.mindview.util.Stack;

/**
 * of course, a real-world program also needs some error handling logic
 * (e.g., to avert deadlock in case of improper input).
 *
 * @Author created by barrett in 2020/4/20 22:34
 */
public class E15_Evaluator {
    private final static Stack<Character> stack =
            new Stack<Character>();

    private static void evaluate(String expr) {
        char data[] = expr.toCharArray();
        for (int i = 0; i < data.length; )
            switch (data[i++]) {
                case '+':
                    stack.push(data[i++]);
                    break;
                case '-':
                    System.out.print(stack.pop());
            }
    }

    public static void main(String[] args) {
        evaluate("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }
}
    /* Output:
    cnUtreaiytn ursel   
    *///:~