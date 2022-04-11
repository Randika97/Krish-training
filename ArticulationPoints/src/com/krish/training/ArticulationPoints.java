package com.krish.training;
import java.util.*;
import java.util.LinkedList;
public class ArticulationPoints {
    private int V;
    private LinkedList<Integer> adj[];
    int time = 0;
    static final int NO_PARENT = -1;

    ArticulationPoints(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
    void DepthFirstSearch(int currentVertex, boolean isvisited[], int discoveryRounds[], int minimumTime[], int parentNode[], boolean articulationPoints[]) {

        int noOfChildren = 0;
        isvisited[currentVertex] = true;
        discoveryRounds[currentVertex] = minimumTime[currentVertex] = ++time;

        Iterator<Integer> i = adj[currentVertex].iterator();
        while (i.hasNext()) {
            int adj_vertex = i.next();
            if (!isvisited[adj_vertex]) {
                noOfChildren++;
                parentNode[adj_vertex] = currentVertex;
                DepthFirstSearch(adj_vertex, isvisited, discoveryRounds, minimumTime, parentNode, articulationPoints);

                minimumTime[currentVertex] = Math.min(minimumTime[currentVertex], minimumTime[adj_vertex]);

                if (parentNode[currentVertex] == NO_PARENT && noOfChildren > 1)
                    articulationPoints[currentVertex] = true;

                if (parentNode[currentVertex] != NO_PARENT && minimumTime[adj_vertex] >= discoveryRounds[currentVertex])
                    articulationPoints[currentVertex] = true;
            } else if (adj_vertex != parentNode[currentVertex])
                minimumTime[currentVertex] = Math.min(minimumTime[currentVertex], discoveryRounds[adj_vertex]);
        }
    }

    void findArticulationPoints() {
        boolean isvisited[] = new boolean[V];
        int discoveryRounds[] = new int[V];
        int minimumTime[] = new int[V];
        int parentNode[] = new int[V];
        boolean articulationPoints[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            parentNode[i] = NO_PARENT;
            isvisited[i] = false;
            articulationPoints[i] = false;
        }
        for (int i = 0; i < V; i++) {
            if (isvisited[i] == false) {
                DepthFirstSearch(i, isvisited, discoveryRounds, minimumTime, parentNode, articulationPoints);
            }
        }
        for (int i = 0; i < V; i++) {
            if (articulationPoints[i] == true)
                System.out.print(i + " ");
        }
        for (int i = 0; i < V; i++) {
            if (articulationPoints[i] == true) return;

        }
        System.out.println("Graph has no articulation point");
    }
}
