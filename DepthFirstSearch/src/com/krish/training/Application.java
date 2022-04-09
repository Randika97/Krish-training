package com.krish.training;

public class Application {

    public static void main(String[] args) {
        DepthFirst graph = new DepthFirst();
        graph.addNodes(0, 1, 2, 3 ,4,5,6,7);
        graph.addEdge(0, 3);
        graph.addEdge(3, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 7);
        graph.addEdge(7, 4);
        System.out.println(graph.findDfs(0));
    }
}
