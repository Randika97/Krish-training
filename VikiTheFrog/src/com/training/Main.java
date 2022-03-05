package com.training;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int waitTime;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the distance viki need to jump :");
        int distance = in.nextInt();
        DistanceCal distanceCal = new DistanceCal();
        waitTime=distanceCal.DistanceCal(distance);
        System.out.println("Total wait time "+waitTime);

    }


}
