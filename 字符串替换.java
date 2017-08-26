/*题目描述
请实现一个函数，将一个字符串中的空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。*/
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