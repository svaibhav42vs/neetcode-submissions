class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(board[i][j] == '.'){
                    continue;
                }

                char ch = board[i][j];

                for(int k=0;k<9;k++){
                    if(k != j && board[i][k] == ch){
                        return false;
                    }
                }

                for(int k=0;k<9;k++){
                    if(k != i && board[k][j] == ch){
                        return false;
                    }
                }

                int rowStart = (i/3) * 3;
                int colStart = (j/3) * 3;
                for(int r=rowStart;r < rowStart+3;r++){
                    for(int c = colStart;c<colStart+3;c++){
                        if(( r != i || c != j) && board[r][c] == ch){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
