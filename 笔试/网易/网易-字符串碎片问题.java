/*一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的。例如,"aaabbaaac"是由下面碎片组成的:'aaa','bb','c'。牛牛现在给定一个字符串,请你帮助计算这个字符串的所有碎片的平均长度是多少。

输入描述:
输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s只含小写字母('a'-'z')


输出描述:
输出一个整数,表示所有碎片的平均长度,四舍五入保留两位小数。

如样例所示: s = "aaabbaaac"
所有碎片的平均长度 = (3 + 2 + 3 + 1) / 4 = 2.25

输入例子1:
aaabbaaac

输出例子1:
2.25*/

import java.util.*;
import java.text.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in);
        String in = new String(scanner.next());
     
        char[] inner = in.toCharArray();
      //  System.out.print(inner);
        float sum = 0;
        int k = 1;
        float ave = 0;
        for(int i = 0; i < inner.length-1; i++){
           
            if(inner[i] == inner[i + 1])
                continue;
            k++;
            
        }
        sum = inner.length;
        ave = sum/k;
       NumberFormat decimalFomat = new DecimalFormat(".00");
		//format 返回的是字符串
		String p = decimalFomat.format(ave);

		
       // float n = (float)(Math.round(ave*100))/100;
        System.out.print(p);
    }
}