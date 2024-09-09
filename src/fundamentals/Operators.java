package fundamentals;

public class Operators {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		System.out.println("-----------------------Arithematic Operators-----------------------");		
		System.out.println(a+b); int c = a+b;
		System.out.println(a-b); c = a-b; 
		System.out.println(a*b); c = a*b;
		System.out.println(a/b); c = a/b;  // it gives quotient
		System.out.println(a%b); c = a%b; // it gives remainder
		System.out.println(c);
		
		System.out.println("-----------------------Incremental Operators-----------------------");
		
		int d = 10;		
		System.out.println(d++); // 10
		System.out.println(d); // 11
		System.out.println(++d); // 12
		
		System.out.println(d--); // 12
		System.out.println(d); // 11
		System.out.println(--d); // 10
		
		d += 5 ; // d = d +5;
		System.out.println(d);
		
		d -= 5;  // d = d-5;
		System.out.println(d);
		
		d*=5;  // d = d*5;
		System.out.println(d);
		
		d/=5; // d = d/5;
		System.out.println(d);
		
		d%=3; // d = d%3;
		System.out.println(d);
		
		System.out.println("-----------------------Comparison Operators-----------------------");
		a = 100;
		b = 200;
		
		 boolean b1 = a==b;
		 System.out.println(b1);		 
		 System.out.println(a<b);
		 System.out.println(a>b);
		 System.out.println(a<=b); // a<b or a==b; T or F // if any one condition is true, it prints true
		 System.out.println(a>=b); // a>b or a==b; F or F // it print false
		 System.out.println(a!=b);
		
		 System.out.println("-----------------------Logical Operators-----------------------");
		 
		 System.out.println(a<b && a>b && a==b && a!=b && a<=b && a>b ); // T F F T T F -> F // if any one value is false, result will become false
		 System.out.println(a<b || a>b || a==b || a!=b || a<=b || a>b ); // T F F T T F -> T // if any one value is true, result will become true
		 System.out.println(!(a<b && a>b && a==b && a!=b && a<=b && a>b)); // T F F T T F -> F -> T // makes result as reverse result
		 System.out.println(!(a<b || a>b || a==b || a!=b || a<=b || a>b)); // T F F T T F -> T -> F // makes result as reverse result
		 System.out.println(!(a<b && a>b || a==b && a!=b || a<=b && a>b) ); // T F -> F  F -> F T -> F T -> T F -> F -> T //based on the combination, it gives result
		 
		 
		 System.out.println("---------------------------------Ternay Operator---------------------");
		 
		 System.out.println(a<b ? true : false);
		 System.out.println(a<b ? 1000 : 2000);
		 System.out.println(a<b ? a : b);
		 System.out.println(a>b ? a : b);
		 System.out.println(a>b ? 'T' : 'F');
		 System.out.println(a>b ? "A is less than B" : "B is greater than A");
	}

}

