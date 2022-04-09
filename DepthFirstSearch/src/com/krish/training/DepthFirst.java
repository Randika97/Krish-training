package com.krish.training;

import java.util.*;

public class DepthFirst {
    private Map<Integer, List<Integer>> edges = new HashMap<>();

    public void addNodes(Integer... nodes) {
        for (Integer node : nodes) {
            addNode(node);
        }
    }

    public void addNode(Integer node) {
        if (!edges.containsKey(node)) {
            edges.put(node, new LinkedList<>());
        }
    }

    public void addEdge(Integer a, Integer b) {
        edges.get(a).add(b);
        edges.get(b).add(a);
    }
    public Collection<Integer> findDfs(Integer start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new LinkedHashSet<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            Integer v = stack.pop();
            if (!visited.contains(v)) {
                visited.add(v);
                for (Integer node : edges.get(v)) {
                    stack.push(node);
                }
            }
        }
        return visited;
    }
}
