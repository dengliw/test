import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static int solve(String s1, String s2) {
		char[] str_1 = s1.toCharArray();
        char[] str_2 = s2.toCharArray();//转成字符串数组
        int num = 0;
        if(str_1.length == 0 && str_2.length == 0)
            return num;
        else if(str_1.length == 0 )
            return str_2.length;
        else if(str_2.length == 0 )
            return str_1.length;
        if(str_1.length != str_2.length)//如果长度不相等，则取最长的长度
    	{   
            num = str_1.length>str_2.length?str_1.length:str_2.length;
        	return num;
        }
        
        if(s1.equals(s2))
        {
            num = -1;
            return num;
        }
        num = str_1.length;//如果长度相等
        for(int i = 0; i < str_1.length; i++){
            if(str_1[i] != str_2[i])
            {   
               num = str_1.length;
              //  num++; 
               // continue;
                break;
            }
            if(str_1[i] == str_2[i])
            {
         		
                num--;
            }
         }
        return num;
        }
       

    
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
            
        String _s1;
        try {
            _s1 = in.nextLine();
        } catch (Exception e) {
            _s1 = null;
        }
        
        String _s2;
        try {
            _s2 = in.nextLine();
        } catch (Exception e) {
            _s2 = null;
        }
  
        res = solve(_s1, _s2);
        System.out.println(String.valueOf(res));    

    }
}
