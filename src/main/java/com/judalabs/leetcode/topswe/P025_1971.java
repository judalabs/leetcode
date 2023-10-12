package com.judalabs.leetcode.topswe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

/*
https://leetcode.com/problems/find-if-path-exists-in-graph/description/
 */
public class P025_1971 {

    //DFS VERSION - could be better
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int[] edge : edges) {
            graph.compute(edge[0], addOrInit(edge[1]));
            graph.compute(edge[1], addOrInit(edge[0]));
        }
        final boolean[] visited = new boolean[n];
        visited[source] = true;
        return searchFor(destination, source, graph, visited);

    }

    private boolean searchFor(int destination, int source, Map<Integer, List<Integer>> graph, boolean[] visited) {
        if(destination == source) return true;
        final List<Integer> relatedList = graph.getOrDefault(source, List.of());
        for(Integer relateTo : relatedList) {
            if(!visited[relateTo]) {
                visited[relateTo] = true;
                if(searchFor(destination, relateTo, graph, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static BiFunction<Integer, List<Integer>, List<Integer>> addOrInit(int dest) {
        return (key, value) -> {
            if(value == null) {
                final List<Integer> objects = new ArrayList<>();
                objects.add(dest);
                return objects;
            } else {
                value.add(dest);
                return value;
            }
        };
    }
}
