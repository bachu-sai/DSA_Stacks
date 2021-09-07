class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
       Stack<Character> s = new Stack<Character>();
       int n=x.length();
       char t;
       for(int i=0;i<n;i++)
       {
           char k=x.charAt(i);
           if(k=='['||k=='('||k=='{')
           {
               s.push(k);
               continue;
           }
           if(s.empty())
           {
               return false;
           }
           switch(k)
           {
               case ']':
                    t=s.pop();
                    if(t=='{'||t=='(')
                     return false;
                    break;
                case '}':
                    t=s.pop();
                    if(t=='['||t=='(')
                      return false;
                    break;
                case ')':
                    t=s.pop();
                    if(t=='['||t=='{')
                     return false;
                    break;
                    
                   
           }
       }
       return s.empty();
    }
}
