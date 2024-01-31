import java.util.Stack;

public class pushSatck {
    public static void pushSatckButtom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushSatckButtom(s, data);
        s.push(top);
           
    }
    
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushSatckButtom(s, 4);
        while(!s.empty())
        {
           System.out.println(s.pop());
        }
    }
    
}
