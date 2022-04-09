package com.krish.training;

import java.util.*;

public class BreadthFirst {
    private Map<Character, List<Character>> edges = new HashMap<>();

    public void addNodes(Character... nodes) {
        for (Character node : nodes) {
            addNode(node);
        }
    }

    public void addNode(Character node) {
        if (!edges.containsKey(node)) {
            edges.put(node, new LinkedList<>());
        }
    }

    public void addEdges(Character a, Character b) {
        edges.get(a).add(b);
        edges.get(b).add(a);
    }
    public Collection<Character> findBfs(Character start) {
        Queue<Character> queue = new LinkedList<>();
        Set<Character> visited = new LinkedHashSet<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Character t = queue.poll();
            for (Character node : edges.get(t)) {
                if (!visited.contains(node)) {
                    queue.add(node);
                    visited.add(node);
                }
            }
        }
        return visited;
    }
}

