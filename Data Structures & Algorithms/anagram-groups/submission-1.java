class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] flag = new boolean[strs.length];
        String[] sorted = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            sorted[i] = new String(ch);
        }

        for(int i = 0; i<strs.length; i++){
            if(flag[i]) continue; 
            List<String> list = new ArrayList<>();
            for(int j = i; j<strs.length; j++){
                if(strs[i].length() != strs[j].length()) continue;
                if(sorted[i].equals(sorted[j])) {
                    list.add(strs[j]);
                    flag[j] = true;
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
