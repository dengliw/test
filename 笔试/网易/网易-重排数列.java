package 练习基础;

import java.util.*;
import java.io.*;
import java.lang.String;
 
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());//取第一个数    
        int len = 0;
        int x= 0,  y= 0;
        while(scanner.hasNext()){
        	x =0;
        	y =0;
            len = Integer.parseInt(scanner.next());//取第i数列的个数
            for(int i = 0; i < len; i++){
            	int b = Integer.parseInt(scanner.next());
                if(b%2 == 1) x++;//计算奇数个数
                if(b%4 == 0) y++;//计算4的倍数
            
         	}
          if( y <= x){//如果4的倍数的个数小于奇数个数，则不是
            System.out.print("No ");
            continue;
          }
          System.out.print("Yes ");
         }
      
        }
    }