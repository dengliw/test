/*��Ŀ����
��1+2+3+...+n��Ҫ����ʹ�ó˳�����
for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����*/
public class Solution {
    public int Sum_Solution(int n) {
        if( n <= 0)
            return 0;
        else if( n == 1)
            return 1;
        else
            return n+Sum_Solution( n - 1);
    }
}