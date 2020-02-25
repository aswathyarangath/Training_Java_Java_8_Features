package com.java8features;


@FunctionalInterface
interface MyInterface {

    String reverse(String n);
}



public class ParamLambdaMain {
	public static void main( String[] args ) {

        MyInterface myInterface = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
            result += str.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed = " + myInterface.reverse("Lambda"));
    }


}
