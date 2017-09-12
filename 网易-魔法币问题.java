/*小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,但是小易现在一枚魔法币都没有,但是小易有两台魔法机器可以通过投入x(x可以为0)个魔法币产生更多的魔法币。
魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。 
输入描述:
输入包括一行,包括一个正整数n(1 ≤ n ≤ 10^9),表示小易需要的魔法币数量。


输出描述:
输出一个字符串,每个字符表示该次小易选取投入的魔法机器。其中只包含字符'1'和'2'。

输入例子1:
10

输出例子1:
122*/

import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);//输入
      // System.out.println(in.next());
        String n = new String(in.next());
        int num = Integer.parseInt(n);//转为整型
        
        //System.out.println(num);
        StringBuffer str = new StringBuffer();
        
		//逆向思维
        while(num != 0){
            if(num % 2 == 0 ){//判端应该使用哪个魔法机器，如果是偶数，则上一次使用的是机器2
                
                str.append('2');
            	num = num/2 -1 ;
            }
            if(num % 2 == 1){//如果是奇数，则上一次使用的是机器1
                str.append('1');
                num = (num-1)/2;
                
            }
           
        }
       char[] a = str.toString().toCharArray();//转为字符数组
        for(int i = a.length-1;i >= 0; i-- )//因为上述得到的是逆序，所以要逆转输出
        System.out.print(a[i]);
        
        
    }
}