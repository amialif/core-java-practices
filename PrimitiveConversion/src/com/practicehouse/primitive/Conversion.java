package com.practicehouse.primitive;

public class Conversion {

	public static void main(String[] args) {
		
		// widening Primitive Conversion
		int intNumber = 1234;
		
		long longNumber = intNumber;
		
		float floatNumber = longNumber;
		
		double doubleNumber = floatNumber;
		
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		
		// Narrowing Primitive Conversion / Cast
		
		double doubleNum = 1235367.00;
		float floatNum = (float) doubleNum;
		long longNum = (long) floatNum;
		int intNum = (int) longNum;
		
		System.out.println(doubleNum);
		System.out.println(floatNum);
		System.out.println(longNum);
		System.out.println(intNum);
		
		// boxing unboxing converstion using wrapper class
		
		Integer i = new Integer(50);
		int a = i;
		System.out.println(i);
		
		// normal primitive you can't use toString() method
		//if you have boxing or wrapper class then u can use toString method to do
		
		// String conversion
		
		Double d = new Double(12345.00);
		System.out.println(d.toString());
		
		// now this every wrapper class has a parse method that will give us the primitive data
		// we can use and can get back to primitive
		
		String s = "127";
		
		byte byteVal = Byte.parseByte(s);
		System.out.println(byteVal);
		
		short shortVal = Short.parseShort(s);
		System.out.println(shortVal);
		
		int intVal = Integer.parseInt(s);
		System.out.println(intVal);
		
		long longVal = Long.parseLong(s);
		System.out.println(longVal);
		
		float floatVal = Float.parseFloat(s);
		System.out.println(floatVal);
		
		double doubleVal = Double.parseDouble(s);
		System.out.println(doubleVal);
		
		// Numeric Promotions
		// Numeric Promotions follow the order double, float, long, int
		// if any of the operands are double all the operands will promote to double
		// similary it follows the order.
		int x = 6;
		double y = 7;
		long z = 8;
		
		System.out.println(x + y + z);
		
		

	}

}
