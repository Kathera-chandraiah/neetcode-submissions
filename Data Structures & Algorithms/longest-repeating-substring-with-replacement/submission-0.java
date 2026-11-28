class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0,longSub=0,maxFreq =0;

        Map<Character,Integer> freq = new HashMap<>();

        for(int r=0;r<s.length();r++){

            char ch = s.charAt(r);

            freq.put(ch,freq.getOrDefault(ch,0)+1);

            if(maxFreq<freq.get(ch))
                maxFreq = freq.get(ch);

            if((r-l+1)-maxFreq <=k){

                if(longSub<r-l+1)
                    longSub = r-l+1;
            }

            while((r-l+1)-maxFreq>k){
                ch = s.charAt(l);
                freq.put(ch,freq.getOrDefault(ch,0)-1);
                l++;
            }

        }

        return longSub;
        
    }
}
