class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> oo = new ArrayList<>();

        for (int i : nums) {
            
                oo.add(i);
            }
        for (int i : nums) {
            
                oo.add(i);
            }
        
        int[] result = new int[oo.size()];
        for (int i = 0; i < oo.size(); i++) {
            result[i] = oo.get(i);
        }
        return result;
    }
}