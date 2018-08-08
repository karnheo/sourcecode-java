package com.pcc.th.yyy;

public class DemoError {
	
	public static void main(String[] args) {
		DemoError e = new DemoError();
		e.process1ProReactive(0);
		double r = e.process1ProReactive(0);
		System.out.println(r);
	}
	double process1Reactive(int input)  {
		try {
			return 10/input;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	double process1ProReactive(int input)  {
		try {
			return 10/input;
		}catch (ArithmeticException e) {
			/*e.printStackTrace();*/
		}
		return -1;
	}
}
