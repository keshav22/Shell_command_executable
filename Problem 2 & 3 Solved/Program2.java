public class Solution {
    public int braces(String A) {
        
        Stack<Character> stack = new Stack<Character>();
        int n = A.length();
        A=A.toLowerCase();
        
        char c[] = A.toCharArray();
        for(int i = 0; i<n ; i++)
        {
            if(c[i]<97 || c[i]>122)
            {
                if(c[i]==')')
                {
                    char temp = stack.pop();
                   // System.out.println(temp);
                    if(temp=='(')
                    {
                        return 1;
                    }
                    else
                    {
                        while(temp!='(')
                        {
                            temp = stack.pop();
                        }
                    }
                }
                else
                stack.push(c[i]);
            }
        }
        return 0;
    }
}
