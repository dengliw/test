/*��Ŀ����
��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��*/
public class Solution {
    public String replaceSpace(StringBuffer str) {
  
    String s = str.toString();
    char[] schar = s.toCharArray();
    int i;
    StringBuffer str_1 = new StringBuffer();
    for( i = 0; i < schar.length; i ++)
        {
        if( schar[i] == ' ')
            str_1.append("%20");
        else 
            str_1.append(schar[i]);
    }
        return str_1.toString();
        
    }
}