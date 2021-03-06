/*题目描述
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
总共有多少种方法？*/
public class Solution {
    public int RectCover(int target) {
		int i;
        int n = target;//引入参数n，后面表示target
        if( n <= 0 )
            return 0;
        else if( n == 1)
            return 1;
        else if ( n == 2 )
            return 2;
        else {
            return RectCover(n -1) + RectCover( n - 2);
        }
    }
}