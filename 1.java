/*��Ŀ����
��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ��
���ǳ�֮Ϊ�������ת�� ����һ���ǵݼ�����������һ����ת��
�����ת�������СԪ�ء� ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת��
���������СֵΪ1��
NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��*/
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int i,j;
        if(array.length == 0)
            return 0;
        for( i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1])
              break;
        }     
		return array[i +1];
        
    }
}