package m4;

import java.util.Stack;

public class CriticalThinkingFour {

	public static String convertToPostfix(String infix) {
		Stack<Character> operatorStack = new Stack<>();

		StringBuilder postfix = new StringBuilder();

		for (int i = 0; i < infix.length(); i++) {
			char nextCharacter = infix.charAt(i);

			switch (nextCharacter) {
			case ' ':
				break;
			case '^':
				operatorStack.push(nextCharacter);

				break;
			case '+':
			case '-':
			case '*':
			case '/':
				while (!operatorStack.isEmpty() && precedence(nextCharacter) <= precedence(operatorStack.peek())) {
					postfix.append(operatorStack.peek());

					operatorStack.pop();
				}

				operatorStack.push(nextCharacter);

				break;
			case '(':
				operatorStack.push(nextCharacter);

				break;
			case ')':
				char topOperator = operatorStack.pop();

				while (topOperator != '(') {
					postfix.append(topOperator);

					topOperator = operatorStack.pop();
				}

				break;
			default:
				postfix.append(nextCharacter);

				break;
			}
		}

		while (!operatorStack.isEmpty()) {
			postfix.append(operatorStack.pop());
		}

		return postfix.toString();
	}

	private static int precedence(char operator) {
		switch (operator) {
		case '^':
			return 3;
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		default:
			return 0;
		}
	}
}
