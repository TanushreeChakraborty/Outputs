package com.output7;

public class Test {
	
	public static void main (String[] args) {
		B b = new B();
		C c = new C();
		newPrint(b);
		newPrint(c);
		}
		public static void newPrint(A a){
		a.printValue();

		}
}
