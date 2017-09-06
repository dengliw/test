package 练习基础;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 将一个文本文件从c盘复制到d盘
 * 原理：
 * 将改该文件内容存储到的盘的一个文件中
 * 步骤：
 * 1.在d盘中创建一个文件
 * 2.定义读取流和该文件关联
 * 3.通过不断读写完成复制
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
			throw new RuntimeException("复制失败！");
			
		}finally{
			if(fr != null)
			try{
				
					fr.close();
			}
			catch(IOException e){
				throw new RuntimeException("复制失败！");
			}
			if(fw != null)
			try{
				fw.close();
			}catch(IOException e){
				throw new RuntimeException("复制失败！");
			}
		}
	}
	
	
	
	
	public static void copy_1()throws IOException{
	//读一个字符就写一个字符	
		//创建目的地
		FileWriter fw = new FileWriter("D:\\copy_1.txt");
		//与已有文件关联
		FileReader fr = new FileReader("C:\\eula.1028.txt");
		
		int ch = 0;
		while((ch = fr.read()) != -1){
			fw.write(ch);
		}
		
		fw.close();
		fr.close();
	}
}
