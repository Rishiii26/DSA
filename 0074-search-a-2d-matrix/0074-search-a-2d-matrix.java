class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s1 = 0;
        int e1 = matrix.length-1;
        int index1 = -1;
        while(s1<=e1){
             int mid1 = s1+((e1-s1)/2);
             if(matrix[mid1][0]==target){
                return true;
             }
             else if(matrix[mid1][0]<target){
                index1=mid1;
                s1=mid1+1;
             }
             else{
                e1=mid1-1;
             }
        }
        if(index1==-1){
            return false;
        }
        int s2 = 0;
        int e2 = matrix[index1].length-1;
        int index2 = -1;
        while(s2<=e2){
            int mid2 = s2+((e2-s2)/2);
            if(matrix[index1][mid2]==target){
                return true;
            }
            else if(matrix[index1][mid2]<target){
                s2=mid2+1;
            }
            else{
                e2=mid2-1;
            }
        }
        return false;
    }
}