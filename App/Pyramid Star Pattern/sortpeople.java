class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int i;
       HashMap<Integer,String> map = new HashMap<>();
       for(i=0;i<names.length;i++){
           map.put(heights[i],names[i]);
       }
       Arrays.sort(heights);
       String[] res = new String[names.length];
       int j=0;
       for(i=heights.length-1;i>=0;i--){
           res[j] = map.get(heights[i]);
           j++;
       }
        return res;
    }
}
