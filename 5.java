/*��Ŀ����
���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ�
�ܹ��ж����ַ�����*/
public class Solution {
    public int RectCover(int target) {
		int i;
        int n = target;//�������n�������ʾtarget
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