package com.krish.training;

public class Application {

    public static void main(String[] args) {
        //creating graphs and calling function to find articulation points.
        ArticulationPoints articulationPoints = new ArticulationPoints(6);
        articulationPoints.addEdge(1,0);
        articulationPoints.addEdge(0,5);
        articulationPoints.addEdge(1,3);
        articulationPoints.addEdge(1,2);
        articulationPoints.addEdge(2,3);
        articulationPoints.addEdge(2,4);
        articulationPoints.addEdge(3,4);
        System.out.println("Articulation points are ");
        articulationPoints.findArticulationPoints();
        System.out.println();
    }
}
