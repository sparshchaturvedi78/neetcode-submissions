class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int elm : nums){
            map.put(elm, map.getOrDefault(elm,0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for(int i = 0; i<k; i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
