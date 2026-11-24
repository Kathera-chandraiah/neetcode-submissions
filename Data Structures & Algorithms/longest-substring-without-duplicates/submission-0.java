class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0,r=0 , size=-1;

        Set<Character> set = new HashSet<>();

        while(r<s.length()){

            if(!set.add(s.charAt(r))){
                if(size<r-l){
                    size = r-l;
                }
                set.remove(s.charAt(l++));
            }else
                r++;
        }

        if(set.size()>size){
            return set.size();
        }else
            return size;
        
    }
}
