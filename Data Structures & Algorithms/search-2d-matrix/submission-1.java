class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low =0;
        int n = matrix.length;
        int m  = matrix[0].length;
        int high = m*n-1;
        while(low <= high){
            int mid = low +(high-low)/2;
            int row = mid/m;
            int col = mid%m;
            int midvalue = matrix[row][col];
            if(midvalue == target){
                return true;
            }else if(midvalue < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}
