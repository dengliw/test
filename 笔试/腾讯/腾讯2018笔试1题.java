package Á·Ï°»ù´¡;

//import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Test2{
	public static void main (String[] args) throws Exception{
    int i = 0;
    Scanner scanner = new Scanner(System.in);
    String[] num = new String[4];
    while(scanner.hasNext()){
    	num[i++] = scanner.next(); 
    }
    i = 0;
    int a = Integer.parseInt(num[0]);
    int b = Integer.parseInt(num[2]);
    while(a < b){
       if( (a * 2) == (b - 2)){
      	i = i + 2;
        break;
      }
      else if((a * 2) > b){
     		i = i + b - a;
        break;
      }  
      a = a * 2;
      i = i + 1;
    }
    System.out.print(i);
	}
}