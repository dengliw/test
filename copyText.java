package ��ϰ����;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ��һ���ı��ļ���c�̸��Ƶ�d��
 * ԭ��
 * ���ĸ��ļ����ݴ洢�����̵�һ���ļ���
 * ���裺
 * 1.��d���д���һ���ļ�
 * 2.�����ȡ���͸��ļ�����
 * 3.ͨ�����϶�д��ɸ���
 * */
public class copyText {
	
	public static void main(String[] args)throws IOException{
		//copy_1();
		copy_2();
	}
	
	public static void copy_2(){
		FileWriter fw = null;
		FileReader fr = null;
		
		try{
			fw = new FileWriter("D:\\copy_2.txt");
			fr = new FileReader("C:\\eula.1028.txt");
			
			char[] buf = new char[1024];
			
			int len = 0;
			while((len = fr.read(buf)) != -1){
				fw.write(buf,0,len);
				
			}
		}catch(IOException e){
			throw new RuntimeException("����ʧ�ܣ�");
			
		}finally{
			if(fr != null)
			try{
				
					fr.close();
			}
			catch(IOException e){
				throw new RuntimeException("����ʧ�ܣ�");
			}
			if(fw != null)
			try{
				fw.close();
			}catch(IOException e){
				throw new RuntimeException("����ʧ�ܣ�");
			}
		}
	}
	
	
	
	
	public static void copy_1()throws IOException{
	//��һ���ַ���дһ���ַ�	
		//����Ŀ�ĵ�
		FileWriter fw = new FileWriter("D:\\copy_1.txt");
		//�������ļ�����
		FileReader fr = new FileReader("C:\\eula.1028.txt");
		
		int ch = 0;
		while((ch = fr.read()) != -1){
			fw.write(ch);
		}
		
		fw.close();
		fr.close();
	}
}
