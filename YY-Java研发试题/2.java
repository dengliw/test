package 练习基础;

import java.util.*;
import java.lang.*;
public class Dtest{
    public void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int len = Integer.parseInt(scanner.next());//获取数组长度
       int[] arr = new int[len];
       for( int i = 0; i < len; i++)  {
            arr[i] = Integer.parseInt(scanner.next());//初始化数组
            System.out.print(arr[i]);
        }
        System.out.print(isAndEqationExist(arr));//调用函数
        

    }
    boolean isAndEqationExist(int[] a){
    	int i = 0;
    	int s = 1; 
    	for( i = 0; i < a.length; i++){ 
    		s = 1; 
    		for(int j = 0; j < a.length; j++){
    			 if(j == i)
    				 continue;
    			 s = s & a[j]; 
    		}
    		if( s == a[i])
    			 return true;     
    	}
    	return false;
    }
   
}
