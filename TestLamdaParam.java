package com.java8features;



	@FunctionalInterface
	interface TestSum{
		public int getsum(int x,int y);
	}
	 

	public class TestLamdaParam {
		public static void main(String[] args) {
			TestSum p=(x,y)->x+y;
			System.out.println("Pi value is:"+p.getsum(10,20));
			
			
		}

	}

