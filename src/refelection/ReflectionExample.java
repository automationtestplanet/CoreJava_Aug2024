package refelection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		Calculator calc = new Calculator();

		Method[] allMethods = Calculator.class.getMethods();

		for (Method eachMethod : allMethods) {
			System.out.println(eachMethod.getName());
		}

		Object[] objArr = { 10, 20 };

		for (Method eachMethod : allMethods) {
			if (eachMethod.getName().equals("addition") || eachMethod.getName().equals("subtraction")
					|| eachMethod.getName().equals("multiplication")) {
				eachMethod.invoke(calc, objArr);
			}
		}

		Object[] objArr2 = { 10, 3 };
		Method divMethod = Calculator.class.getDeclaredMethod("division", int.class, int.class);
		divMethod.setAccessible(true);
		divMethod.invoke(calc, objArr2);
	}

}
