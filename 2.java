/*��Ŀ����
��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
n<=39*/

public class Solution {
    public int Fibonacci(int n) {
		int i;
        if( n <= 0)
          	return 0;
        else{
            if(n <= 2)
                return 1;
            else 
                return Fibonacci(n-1)+Fibonacci(n -2);
        }
    }
}