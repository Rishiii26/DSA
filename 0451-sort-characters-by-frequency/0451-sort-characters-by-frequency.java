class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder str = new StringBuilder(); 
        for(int i=s.length();i>=1;i--){
            for(char ch:map.keySet()){
                if(map.get(ch)==i){
                    str.append(String.valueOf(ch).repeat(i));
                }
            }
        }
        return str.toString();

    }
}