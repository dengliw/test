/*��Ŀ����
һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
�����������һ��n����̨���ܹ��ж�����������*/
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