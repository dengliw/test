/*��Ŀ����
��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
����������һ����ά�����һ���������ж��������Ƿ��и�������*/
public class Solution {
    public boolean Find(int target, int [][] array) {
		int n = target;
        int i,j;
        for( i = 0; i < array[0].length; i++){
            for( j = 0 ; j < array.length; j++){
                if( target == array[i][j] ){
                    return true;
                }
            }
        }
        return false;
    }
}