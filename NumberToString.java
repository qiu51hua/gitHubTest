package com.java1234;
import java.text.DecimalFormat;
//githut test
public class NumberToString {

	public static void main(String[] args) {
		Double d = new Double("1.1235");
		//System.out.println(d);
		DecimalFormat df = new DecimalFormat("#.###");
		String strNum = df.format(d);
		System.out.println(strNum);
		String result = String.format("%.3f", d);
		System.out.println(result);
	}

}
