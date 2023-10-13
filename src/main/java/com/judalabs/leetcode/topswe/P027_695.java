package com.judalabs.leetcode.topswe;

/*
https://leetcode.com/problems/max-area-of-island/
 */
public class P027_695 {

    boolean[][] visited;

    public int maxAreaOfIsland(int[][] grid) {
        visited = new boolean[grid.length][];
        for(int i = 0; i < grid.length; i++) {
            visited[i] = new boolean[grid[i].length];
        }
        return getMaxArea(grid);
    }

    private int getMaxArea(int[][] grid) {
        int maxIslandArea = 0;
        for(int i = 0; i < visited.length; i++) {
            for(int j = 0; j < visited[i].length; j++) {
                if(!visited[i][j] && grid[i][j] == 1) {
                    maxIslandArea = Math.max(maxIslandArea, visit(visited, grid, i, j));
                }
            }
        }
        return maxIslandArea;
    }

    private int visit(boolean[][] visited, int[][] grid, int i, int j) {
        if(i < 0 || i >= visited.length || j < 0 || j >= visited[0].length || grid[i][j] == 0 || visited[i][j] ) return 0;
        visited[i][j] = true;
        return 1 + visit(visited, grid, i + 1, j) + visit(visited, grid, i - 1, j) +
                visit(visited, grid, i, j + 1) + visit(visited, grid, i, j - 1);
    }
}
