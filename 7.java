/*��Ŀ����
����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���*/
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