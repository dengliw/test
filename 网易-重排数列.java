package ��ϰ����;

import java.util.*;
import java.io.*;
import java.lang.String;
 
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());//ȡ��һ����    
        int len = 0;
        int x= 0,  y= 0;
        while(scanner.hasNext()){
        	x =0;
        	y =0;
            len = Integer.parseInt(scanner.next());//ȡ��i���еĸ���
            for(int i = 0; i < len; i++){
            	int b = Integer.parseInt(scanner.next());
                if(b%2 == 1) x++;//������������
                if(b%4 == 0) y++;//����4�ı���
            
         	}
          if( y <= x){//���4�ı����ĸ���С����������������
            System.out.print("No ");
            continue;
          }
          System.out.print("Yes ");
         }
      
        }
    }