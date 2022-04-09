package com.krish.training;

import java.util.Timer;
import java.util.TimerTask;

public class Application {

    public static void main(String[] args) {
        BreadthFirst breadthFirst = new BreadthFirst();
        breadthFirst.addNodes('A', 'B', 'C', 'D' ,'E','F','G');
        breadthFirst.addEdges('A', 'B');
        breadthFirst.addEdges('A', 'C');
        breadthFirst.addEdges('B', 'D');
        breadthFirst.addEdges('C', 'E');
        breadthFirst.addEdges('C', 'G');
        breadthFirst.addEdges('E', 'F');
        breadthFirst.addEdges('F', 'G');
        System.out.println(breadthFirst.findBfs('A'));

    }
    }


