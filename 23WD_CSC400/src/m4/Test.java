package m4;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> infixExpressions = new ArrayList<>();

		infixExpressions.add("a / b * (c + (d - e))");

		infixExpressions.add("a/b*(c+(d-e))");

		infixExpressions.add("a + b * c - (d * e ^ f + g)");

		infixExpressions.add("(a - b * c) / (d * e ^ f * g + h)");

		infixExpressions.forEach(infixExpression -> {
			String postfixExpression = CriticalThinkingFour.convertToPostfix(infixExpression);

			System.out.println("Infix Expression: " + infixExpression);

			System.out.println("Postfix Expression: " + postfixExpression + "\n");
		});
	}

}
