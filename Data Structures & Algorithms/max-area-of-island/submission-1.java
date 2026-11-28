class Solution {
    int max_area = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    dfs(grid,i,j);
                }
            }
        }
        return max_area;
    }

    private int dfs(int[][]grid,int i,int j){
        int n = grid.length;
        int m = grid[0].length;

if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0){            return 0;
        }

        grid[i][j] =0;
        int left = dfs(grid,i-1,j);
        int right = dfs(grid,i+1,j);
        int top = dfs(grid,i,j-1);
        int bottom = dfs(grid,i,j+1);

        int total = 1+left+right+top+bottom;

        max_area = Math.max(max_area,total);

        return total;
    }
}
