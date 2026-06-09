class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int rLen = mat.length;
        int cLen = mat[0].length;
        for(int i =0;i<rLen;i++){
            if(mat[i][0]<=target && target<=mat[i][cLen-1]){
               return bs(mat[i], target);
            }
        }
        return false;
    }
    public static boolean bs(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target) return true;
            if(arr[mid]<=target){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }


}
