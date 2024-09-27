package annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@ClassAnnotation(value1 = 100, value2 = 200)
public class UserDefinedAnnotations {

	@VariableAnnotation(variable1 = 'A', variable2 = 'B')
	public char ch;

	@MethodAnotation(param1 = "Hello", param2 = "Java")
	public void concatOfString() {
		try {
			Method concatMethod = UserDefinedAnnotations.class.getDeclaredMethod("concatOfString");
			MethodAnotation methodAnnotation = concatMethod.getAnnotation(MethodAnotation.class);

			System.out.println(methodAnnotation.param1() + methodAnnotation.param2());
		} catch (Exception e) {
			System.out.println("Exeption occured while calling the concatOfString method: " + e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {

		ClassAnnotation clsAnnotation = UserDefinedAnnotations.class.getAnnotation(ClassAnnotation.class);
		System.out.println(clsAnnotation.value1());
		System.out.println(clsAnnotation.value2());

		UserDefinedAnnotations userDefAnno = new UserDefinedAnnotations();
		userDefAnno.concatOfString();

		Field chField = UserDefinedAnnotations.class.getField("ch");
		VariableAnnotation varAnnotation = chField.getAnnotation(VariableAnnotation.class);
		System.out.println(varAnnotation.variable1());
		System.out.println(varAnnotation.variable2());

	}

}
