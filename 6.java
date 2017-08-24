/*题目描述
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。*/
public class Solution {
    public int NumberOf1(int n) {
		int count = 0;  
        while (n != 0) {  
            count++;  
            n = n & (n - 1);  //与运算一次消掉最右边的一个1
        }  
        return count; 
    }
}