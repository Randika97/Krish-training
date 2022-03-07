package com.training;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //creating a hashMap to store the jump and its time
        HashMap<Integer,Integer> vikiFrog = new HashMap<>();
        vikiFrog.put(1,5);
        vikiFrog.put(2,3);
        vikiFrog.put(3,1);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance viki need to jump :");
        int distance = input.nextInt();
        //initializing variables
        int totDistance = 0;
        int waitTime = 0;
        boolean turn = true;
        //while viki's turn become satisfy let viki jump
        while(turn){
            for(int x = 1 ; x<4 ;x++){
                if(distance<=totDistance){
                    turn = false;
                }else{
                    totDistance+=vikiFrog.get(x);
                    waitTime += x;
                }
            }
        }
        System.out.println("Total wait time of Viki is  "+waitTime);

    }


}
