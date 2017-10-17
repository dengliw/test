import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


/*
******************************开始写代码******************************/
    static int[] solve(int[] a,int x) {
        x--;
		int[] b = new int[a.length];
        int sign = 0;//记录最小的下标
       	int le = b[0];//初始化。
        for(int i = 0; i < a.length; i++){
            if(le > a[i]){
                le = a[i];
                sign = i;
            }
        }
        int s = 0;//距离
        if( x == sign){
            for( int i = 0; i < b.length; i++){
                b[i] = a[i] - le ;
            }
            b[sign] = le * b.length;
            return b;
        }
        else if(x < sign){//如果结束下标在最小元素左边
            s = b.length - sign + x;
            for( int i = 0; i < b.length; i++){
                b[i] = a[i] - le -1;
                if( i < sign && i > x){
                	b[i] = a[i] - le;
                }
            }
            b[sign] = le*b.length + s;
            return b;
        }
        else if( x > sign)
        {
            
            s = x - sign + 1;
            b[sign] = le * b.length + s;
            for( int i = 0; i < sign; i++){
                b[i] = a[i] - le;
            }
            for( int i = sign + 1; i <= x; i++){
                b[i] = a[i] - le -1;
            }
            return b;
            
        }
        
		return b;
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;
            
        int _a_size = 0;
        _a_size = Integer.parseInt(in.next().trim());
        int _a_num = 0;
        _a_num = Integer.parseInt(in.next().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.next().trim());
            _a[_a_i] = _a_item;
        }
  
        res = solve(_a,_a_num);
        System.out.println(res);
       for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
