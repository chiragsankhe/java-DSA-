import java.util.*;

public class C70_smallest_no_pattern
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        int n = 1;

        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch == 'd')
            {
                st.push(n);
                n++;
            }
            else{
                st.push(n);
                n++;

                while(st.size() > 0 )
                {
                    System.out.print(st.peek());
                    st.pop();
                }

            }
        }
        st.push(n);
        while(st.size() > 0 )
                {
                    System.out.print(st.peek());
                    st.pop();
                }


    }
}