/*��Ŀ����
����һ���������飬ʵ��һ�����������������������ֵ�˳��
ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�
����֤������������ż����ż��֮������λ�ò��䡣*/
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