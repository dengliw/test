/*题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。*/
public class Solution {
    public int JumpFloorII(int target) {
    
        int i,s = 0, n = target;
        if( n  <= 0 )
            return 0;
        else if(n == 1)
            return 1;
        else{
            for( i = 0; i < n; i++)
                s = s + JumpFloorII(i);
            s++;
            return s;
        } 
    }
}