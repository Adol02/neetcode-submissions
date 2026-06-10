class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // fiirst find the lowest speed and highest speeed
        int low =1;
        int high = Arrays.stream(piles).max().getAsInt();
        int minSpeed = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            minSpeed = isPossible(piles, mid);
            if(minSpeed<=h){
                high = mid-1;
            }else{
                low= mid+1;
            }
        }
        return low;
        
    }
    public static int isPossible(int[] piles, int mid){
        int sum = 0;
        for(int i: piles){
            sum += (i + mid - 1L) / mid;
        }
        return sum;
    }
}
