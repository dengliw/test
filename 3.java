/*��Ŀ����
һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
�����������һ��n����̨���ܹ��ж�����������*/

public class Solution {
    public int JumpFloor(int target) {
		
        if( target <= 0)
            return 0;
        else {
            if( target == 1)
                return 1;
           else if (target == 2)
                return 2;
            else 
                return(JumpFloor(target-2) + JumpFloor(target - 1));
        }
    }
}