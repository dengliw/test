/*题目描述
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。*/
public class Solution {
    public void reOrderArray(int [] array) {
        int i = 0,j = 0;
        int[] d = new  int[array.length];
  
        for( i = 0; i < array.length; i++)
            {
            if( array[i] % 2 == 1)
                d[j++] = array[i];
            
        }
        for( i = 0; i < array.length; i++)
            {
            if(array[i] % 2  == 0)
                {
                d[j++] = array[i];
            }
        }
     for( i = 0; i < array.length; i++){
		array[i] = d[i];
     }
    }
}