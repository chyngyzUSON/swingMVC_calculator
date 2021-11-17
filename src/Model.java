
public class Model {
    private final Viewer viewer;
    private String temp;
    private String expression;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
        expression = "";
    }

    public void doAction(String command) {
        if (command.equals("Clean")) {
            temp = "";
        } else if (command.equals("CleanEntry")) {
            temp = "";
            expression = "";
        } else if (command.equals("Back")) {
            String deleteTemp = temp;
            String deleteExpression = expression;
            expression = "";
            temp = "";
            for (int i = 0; i < deleteTemp.length() - 1; i++) {
                temp = temp + deleteTemp.charAt(i);
            }
            for (int i = 0; i < deleteExpression.length() - 1; i++) {
                expression = expression + deleteExpression.charAt(i);
            }
        } else if (command.equals("Zero")) {
            expression = expression + "0";
            temp = temp + "0";
        } else if(command.equals("One")) {
            expression = expression + "1";
            temp = temp + "1";
        } else if(command.equals("Two")) {
            expression = expression + "2";
            temp = temp + "2";
        } else if (command.equals("Three")) {
            expression = expression + "3";
            temp = temp + "3";
        } else if (command.equals("Four")) {
            expression = expression + "4";
            temp = temp + "4";
        } else if (command.equals("Five")) {
            temp = temp + "5";
            expression = expression + "5";
        } else if (command.equals("Six")) {
            expression = expression + "6";
            temp = temp + "6";
        } else if (command.equals("Seven")) {
            expression = expression + "7";
            temp = temp + "7";
        } else if (command.equals("Eight")) {
            expression = expression + "8";
            temp = temp + "8";
        } else if (command.equals("Nine")) {
            expression = expression + "9";
            temp = temp + "9";
        } else if (command.equals("Dot")) {
            if (temp.contains(".")) {
                return;
            } else {
                temp = temp + ".";
                expression = expression + ".";
            }
        }
        else if (command.equals("Plus")) {
            expression = expression + "+";
            temp = "";
        } else if (command.equals("Minus")) {
            expression = expression + "-";
            temp = "";
        }else if (command.equals("Multi")) {
            expression = expression + "*";
            temp = "";
        }else if (command.equals("Div")) {
            expression = expression + "/";
            temp = "";
        } else if (command.equals("Equal")) {
            if (!expression.isEmpty()) {
                String result = decide(rpnToAnswer(expressionToRPN(expression)));
                viewer.updateExpression(expression + "=");
                viewer.updateTemp(String.valueOf(result));
            } else {
                viewer.updateTemp("0");
                viewer.updateExpression("=0");
            }
        }
        if (!command.equals("Equal")) {
            viewer.updateExpression(expression);
            viewer.updateTemp(temp);
        }
    }

    public String decide(String expression) {
        String prepared = preparingExpression(expression);
        String rpn = expressionToRPN(prepared);
        return rpnToAnswer(rpn);
    }

    private String preparingExpression (String expression) {
        String preparedExpression = new String();
        for (int token = 0; token < expression.length(); token++) {
            char symbol = expression.charAt(token);
            if (symbol == '-') {
                if (token == 0)
                    preparedExpression = preparedExpression + '0';
                else if (expression.charAt(token-1) == '(')
                    preparedExpression = preparedExpression + '0';
            }
            preparedExpression = preparedExpression + symbol;
        }
        return preparedExpression;
    }

    private int getCharStackSize(String expression) {
        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (getPriority(expression.charAt(i)) != 0) {
                count++;
            }
        }
        return count;
    }

    private String expressionToRPN(String expression){
        StringBuilder current = new StringBuilder();
        Stack<Character> stack = new Stack<>(getCharStackSize(expression));

        int priority;
        for (int i = 0; i < expression.length(); i++) {
            priority = getPriority(expression.charAt(i));

            if (priority == 0)
                current.append(expression.charAt(i));

            if (priority == 1)
                stack.push(expression.charAt(i));

            if (priority > 1) {
                current.append(' ');
                while (!stack.isEmpty()) {
                    if (getPriority(stack.peek()) >= priority) {
                        current.append(stack.pop());
                    }
                    else break;
                }
                stack.push(expression.charAt(i));
            }
            if (priority == -1) {
                current.append(' ');
                while (getPriority(stack.peek()) != 1) {
                    current.append(stack.pop());
                }
                stack.pop();
            }
        }
        current.append(' ');
        while (!stack.isEmpty()) {
            current.append(stack.pop());
        }
        return current + "";
    }

    private int getNumberStackSize(String expression) {
        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (getPriority(expression.charAt(i))  == 0) {
                count++;
            }
        }
        return count;
    }

    private String rpnToAnswer(String rpn){
        StringBuilder operand = new StringBuilder();
        Stack<Double> stack = new Stack<>(getNumberStackSize(rpn));

        for (int i = 0; i < rpn.length(); i++) {
            if (rpn.charAt(i) == ' ')
                continue;

            if (getPriority(rpn.charAt(i)) == 0) {
                while (rpn.charAt(i) != ' ' && getPriority(rpn.charAt(i)) == 0){
                    operand.append(rpn.charAt(i++));
                    if (i == rpn.length())
                        break;
                }
                stack.push(Double.parseDouble(operand.toString()));
                operand = new StringBuilder();
            }

            if (getPriority(rpn.charAt(i)) > 1){
                double a = stack.pop();
                double b = stack.pop();

                if (rpn.charAt(i) == '+') stack.push(b + a);
                if (rpn.charAt(i) == '-') stack.push(b - a);
                if (rpn.charAt(i) == '*') stack.push(b * a);
                if (rpn.charAt(i) == '/') stack.push(b / a);
            }
        }
        double result = stack.pop();
        return result % 1 == 0 ? (int) result + "" : result + "";
    }

    private int getPriority(char token) {
        if (token == '*' || token == '/')
            return 3;
        if (token == '+' || token == '-')
            return 2;
        if (token == '(')
            return 1;
        if (token == ')')
            return -1;
        else
            return 0;
    }
}



