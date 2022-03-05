package com.training;

public class DistanceCal {
    int waitTime = 0;
    int leftDistance;
    public int DistanceCal(int distance) {
        if (distance >=-1  ){
            waitTime = waitTime + 1;
            leftDistance = distance - 5;
        }
        if (leftDistance > 5) {
            waitTime = waitTime + 2;
            leftDistance = leftDistance - 3;

        } if (leftDistance > 3) {
            waitTime = waitTime + 3;
            leftDistance = leftDistance - 1;
            return DistanceCal(leftDistance);
        }
        return waitTime;
    }
}
