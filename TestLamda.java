package com.java8features;
@FunctionalInterface
interface TestPi{
	public double getpi();
}
 

public class TestLamda {
	public static void main(String[] args) {
		TestPi p=()->3.142;
		System.out.println("Pi value is:"+p.getpi());
		
		
	}

}
