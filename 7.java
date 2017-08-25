/*题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。*/
public class Solution {
    public double Power(double base, int exponent) {
        int i;
        double s = 1;
        if( exponent < 0)
            {
            exponent = -exponent;
            for ( i = 0 ; i < exponent; i ++)
            {
            s =  s /
                base;
        }
        }
        else{
        for ( i = 0 ; i < exponent; i ++)
            {
            s = base * s;
        }
        }
        return s;
  }
}