package com.ocp_815.c2.c2_var;


public class Examples {
	/*
		Example #1: Var doesn't work for instance variables, it works just for local variables
	*/
//	var instanceVariable = "Hellow World"; // DOES NOT COMPILE

	public void processName() {
		/*
			Example #2: Type inference means the compiler will assign the type for you and the type cannot be changed
		*/
		var hello = "Hello";
//		hello = 123; // DOES NOT COMPILE
	}

	public short getTotalApples() {
		/*
			Example #3: Type cannot be changed
		*/
		var apples = (short)10; // Short Type
		apples = (byte)5;       // still Short Type
//		apples = 1_000_000;   // DOES NOT COMPILE
		return apples;
	}

	public void doesThisCompile(boolean check) {
		/*
			Example #4: Does this compile?
		*/
//		var question;
//		question = 1;
//
//		var answer;
//		if (check) {
//			answer = 2;
//		} else {
//			answer = 3;
//		}
//
//		System.out.println(answer);
	}

	public void inlineTypes() {
		/*
			Example #5: Java doesn't allow multiple var declarations
		 */
//		int a, var b = 3; // DOES NOT COMPILE
//	  var i = 1, z = 10; // DOES NOT COMPILE

		/*
			Example #6: var variables cannot be set as null
		 */
//		var nullVar = null; // DOES NOT COMPILE

		/*
			Example #7: var variables instance of objects can be set to null
		 */
		var myString = "abc";
		myString = null;

		// Type inference sets the var o as String
		var o = (String)null; // IT COMPILES
	}


	/*
		Example #8: Does this compile?
	*/
//	public int addition(var a, var b) {
//		return a + b;
//	}


	public static void main(String[] args) {}
}
