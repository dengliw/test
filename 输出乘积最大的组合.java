/*题目描述
输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。
输出描述:
对应每个测试案例，输出两个数，小的先输出。*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int i = 0,j = array.length-1;
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list1 = new ArrayList();
        for( i  = 0; i < array.length; i++){
           // while(!(list.isEmpty()))
           // {
            for( j = array.length - 1; j > i; j--){
                if( array[i] == (sum - array[j]))
                    {
                    list.add(array[i]);
                	list.add(array[j]);
                    
                }
                
          //  }
            }
           
        }
        if(list.isEmpty())
            return list;
        list1.add(list.get(0));
        list1.add(list.get(1));
        return list1;
    }
}