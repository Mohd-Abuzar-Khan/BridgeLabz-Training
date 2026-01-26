class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
        int dif = 1000000;
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 1; i < n; i++){
            int diff = arr[i] - arr[i - 1];
            if (diff < dif) {
                dif = diff;
                res = new ArrayList<>();
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            } else if (diff == dif) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return res;
        
    }
}