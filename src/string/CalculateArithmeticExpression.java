package string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * Created by Chen.Oppenhaim on 3/14/2016.
 *
 * Given a string of an arithmetic expression, composed of numbers, '+' and '*', calculate the result - e.g. "2+4*5*7"
 */
public class CalculateArithmeticExpression {
	public static void main(String[] argv) {
	}

	public int doCalc(String exp) {
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println(exp);
		String[] split = exp.split("(?=[*+])|(?<=[*+])");
		int i = 0;

		while (i < split.length) {
			String s = split[i];
			// System.out.println(s);

			if (isNumber(s)) {
				int num = parseInt(s);
				// System.out.println("isNumber:" + num);
				stack.push(parseInt(s));
			}
			else if (isPlus(s)) {
			}
			else if (isMult(s)) {

				int num1 = stack.pop();
				int num2 = parseInt(split[++i]);

				// System.out.println("num1:" + num1);
				// System.out.println("num2:" + num2);

				stack.push(num1*num2);
			}

			i++;
		}

		int sum = 0;
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}

		System.out.println("result:" + sum);
		return sum;

	}

	public int parseInt(String str) {
		int res = 0;
		try {
			res =  Integer.parseInt(str);
		}
		catch (Exception ex) {

		}

		return res;
	}

	public boolean isPlus(String str) {
		return str.equals("+");
	}

	public boolean isMult(String str) {
		return str.equals("*");
	}

	public boolean isNumber(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}

	@Test
	public void test1() {
		String exp = "2+4*5";
		Assert.assertEquals(doCalc(exp), 22);
	}

	@Test
	public void test2() {
		String exp = "2+2*2+5+7";
		Assert.assertEquals(doCalc(exp), 18);
	}}
