class Solution {
    public boolean isValid(String s) {
        Stack<Character>in=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                in.push(ch);
                continue;
            }
            if(in.isEmpty())
                return false;
            char j;
            switch(ch){
                case ')':
                    j=in.pop();
                    if(j=='{'||j=='[')
                        return false;
                    break;
                case '}':
                    j=in.pop();
                    if(j=='['||j=='(')
                        return false;
                    break;
                case ']':
                    j=in.pop();
                    if(j=='('||j=='{')
                        return false;
                    break;

            }
        }


        return in.isEmpty();




    }

}
class ValidParenthesis{
    public static void main(String[] args) {
        Solution sc=new Solution();
        String s="(){}[]";
        System.out.println(sc.isvalid(s);

    }
}