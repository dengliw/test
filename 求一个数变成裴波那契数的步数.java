/*��Ŀ����
Fibonacci��������������ģ�
F[0] = 0
F[1] = 1
for each i �� 2: F[i] = F[i-1] + F[i-2]
��ˣ�Fibonacci���о����磺0, 1, 1, 2, 3, 5, 8, 13, ...����Fibonacci�����е������ǳ�ΪFibonacci��������һ��N�����������Ϊһ��Fibonacci����ÿһ������԰ѵ�ǰ����X��ΪX-1����X+1�����ڸ���һ����N��������Ҫ���ٲ����Ա�ΪFibonacci����
��������:
����Ϊһ��������N(1 �� N �� 1,000,000)
�������:
���һ����С�Ĳ�����ΪFibonacci��"
ʾ��1
����

15
���

2*/


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a = 0, b = 1;
        while(b <= N){
            int t = b + a;
            a = b;
            b = t; 
        }
        System.out.print((b-N)>(N-a)?N-a:b-N);
    }
}