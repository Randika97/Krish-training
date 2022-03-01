package com.training;

import java.util.Scanner;
public class Main {

    public static int distanceCal(int distance) {
        int waitTime=0;
        if(distance>5){
            waitTime = waitTime+1;
            distance = distance-5;
        }else if(distance>3){
            waitTime = waitTime+2;
            distance = distance-3;
        }else if(distance>1){
            waitTime = waitTime+3;
            distance = distance-3;
        }
        return distanceCal(distance);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the distance viki need to jump :");
        int distance = in.nextInt();
        System.out.println("Total wait time " +distanceCal(distance));

    }


}
