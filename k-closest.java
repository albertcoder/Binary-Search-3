//time complexity O(n)
//space complexity O(1)
//APPROACH: 2 pointers

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        if(arr == null || arr.length == 0) return result;
        int L = 0; int R = arr.length - 1;
        while(R - L + 1 > k){
            //Math.abs because [1,1,1,10,10,10] x = 9 k = 1, diff is -ve
            int diffL = Math.abs(arr[L] - x);
            int diffR = Math.abs(arr[R] - x);
            if(diffL > diffR) L++;
            else R--;
        }
        for(int i = L; i < L + k; i++){
            result.add(arr[i]);
        }
        return result;
    }
}
