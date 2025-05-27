package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class NumberOfIslands {
    public static void main(String[] args) {
        Solution solution = new NumberOfIslands().new Solution();
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]=='1'){
                    res++;
                    dfs(grid, i, j);
                }
            }
        }

        return res;
    }

    //从(i,j)开始，将相邻的岛屿都变成海水（以此替代 维护visited[][] 二维数组）
    void dfs(char[][] grid, int i, int j){
        if (i>=grid.length || i<0 || j<0 || j>=grid[0].length){
            return;
        }

        if (grid[i][j]=='0'){
            return;
        }

        grid[i][j]='0';
        dfs(grid, i+1, j);
        dfs(grid, i,j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}