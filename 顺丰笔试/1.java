import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


/*������������������ʵ����ĿҪ��Ĺ���
��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^ 
******************************��ʼд����******************************/
    static int solve(String s1, String s2) {
		char[] str_1 = s1.toCharArray();
        char[] str_2 = s2.toCharArray();//ת���ַ�������
        int num = 0;
        if(str_1.length == 0 && str_2.length == 0)
            return num;
        else if(str_1.length == 0 )
            return str_2.length;
        else if(str_2.length == 0 )
            return str_1.length;
        if(str_1.length != str_2.length)//������Ȳ���ȣ���ȡ��ĳ���
    	{   
            num = str_1.length>str_2.length?str_1.length:str_2.length;
        	return num;
        }
        
        if(s1.equals(s2))
        {
            num = -1;
            return num;
        }
        num = str_1.length;//����������
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
       

    
/******************************����д����******************************/


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
