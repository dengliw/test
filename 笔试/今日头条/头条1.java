import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


/*
******************************开始写代码******************************/
    static int solve(String[] a,int n, int m) {
        int b = 0;
		//int len_1 = a.length;
        //int len_2 = a[0].length;
        char[][] ch = new char[n][m];
        for(int i = 0; i < a.length; i++){
            ch[i] = a[0].toCharArray();//转化为字符数组
            
        }
       // int 
       /* for( i = 0; i < a.length; i++){//遍历数组，找出各初始位置
            
        //}*/
		return -1;
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
            
        int n = 0;
        n = Integer.parseInt(in.next().trim());
        int m = 0;
        m = Integer.parseInt(in.next().trim());
        String[] _a = new String[n];
        int _a_item;
        for(int i = 0; i < n; i++) {
            _a[i] = in.nextLine().trim();
        }
  		
        res = solve(_a,n,m);
        System.out.println(res);

    }
}
