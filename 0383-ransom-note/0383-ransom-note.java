class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> freq1 = new HashMap<>();
        HashMap<Character,Integer> freq2 = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char a = ransomNote.charAt(i);
            freq1.put(a,freq1.getOrDefault(a,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            char a = magazine.charAt(i);
            freq2.put(a,freq2.getOrDefault(a,0)+1);
        }
        
        for(char i:freq1.keySet()){
            if(!freq2.containsKey(i)){
                return false;
            }
            if(freq1.get(i)>freq2.get(i)){
                return false;
            }
        }
        return true;
    }
}