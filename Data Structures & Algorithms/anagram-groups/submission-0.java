class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] flag = new boolean[strs.length];

        for(int i = 0; i<strs.length; i++){
            if(flag[i]) continue; 
            List<String> list = new ArrayList<>();
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            for(int j = i; j<strs.length; j++){
                if(strs[i].length() != strs[j].length()) continue;
                char[] cha = strs[j].toCharArray();
                Arrays.sort(cha);
                String st = new String(cha);
                if(str.equals(st)) {
                    list.add(strs[j]);
                    flag[j] = true;
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
