import java.util.Stack;

import javax.lang.model.util.ElementScanner14;

public class duplicateParanthis {
    public static boolean Duplicate(String str2)
    {
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            int count=0;
            // closing bracket
            if(ch == ')')
            {
                while(s.peek() != '(')
                {
                    s.pop();
                    count++;
                }
                if(count < 1)
                {
                    return true; // duplicate
                }
                else{
                    s.pop();  // remove pair  
                }
            }
            else{
                s.push(ch);  // opening
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="((a+b))"; // true
        String str2="(a+b)"; // false
        System.out.println(Duplicate(str2));
    }
    
}
