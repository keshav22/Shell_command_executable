import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        
        HashMap<String,ArrayList<Integer>> m = new HashMap<>();
        
        for(int i=0;i<A.size();i++)
        {
            String temp = A.get(i);
            char c [] =temp.toCharArray();
            Arrays.sort(c);
            temp = new String(c);
            
            if(m.containsKey(temp)==true)
            {
                ArrayList<Integer> AL = m.get(temp);
                AL.add(i+1);
                m.put(temp,AL);
            }
            else
            {
                ArrayList<Integer> AL = new ArrayList<Integer>();
                AL.add(i+1);
                m.put(temp,AL);
            }
        }
        ArrayList<ArrayList<Integer>> mn = new ArrayList<ArrayList<Integer>>(m.values());
        return mn;    
    }
}
