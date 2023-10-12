package com.judalabs.leetcode.topswe;

/*
https://leetcode.com/problems/number-of-islands/description/
 */
public class P026_200 {

    boolean[][] visited;

    public int numIslands(char[][] grid) {
        visited = new boolean[grid.length][];
        for(int i = 0; i < grid.length; i++) {
            visited[i] = new boolean[grid[i].length];
        }
        return getNumIsland(grid);
    }

    private int getNumIsland(char[][] grid) {
        int numIsland = 0;
        for(int i = 0; i < visited.length; i++) {
            for(int j = 0; j < visited[i].length; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    numIsland++;
                    visit(visited, grid, i, j);
                }
            }
        }
        return numIsland;
    }

    private void visit(boolean[][] visited, char[][] grid, int i, int j) {
        if(i < 0 || i >= visited.length || j < 0 || j >= visited[0].length || grid[i][j] == '0' || visited[i][j] ) return;
        visited[i][j] = true;
        visit(visited, grid, i + 1, j);
        visit(visited, grid, i - 1, j);
        visit(visited, grid, i, j + 1);
        visit(visited, grid, i, j - 1);
    }
}
