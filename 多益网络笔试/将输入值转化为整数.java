package 练习基础;

import java.util.Scanner;
import java.math.*;
/*
 * 多益网络笔试题1
 * 
 * 不用包将一个数转成对应的整数
 * */
public class Demo {
	public static
	void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello World!");
		String input = new String(scanner.next());
	//	System.out.print(input);
		
		char[] arr = input.toCharArray();
		
		System.out.println(arr.length);
		int value = 0;
		for( int i = 0; i < arr.length; i++ ){
			int d = Integer.parseInt(String.valueOf(input.charAt(i)));
			//System.out.println(d);
			//System.out.print(Math.pow(10,2));
			value = (int) (value + d*(Math.pow(10, arr.length-1-i)));
		}
		System.out.print(value);
		
	}
}
