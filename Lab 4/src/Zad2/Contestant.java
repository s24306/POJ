package Zad2;

import java.util.*;

public class Contestant {
    private String name;
    private int speedMin;
    private int speedMax;
    public int distanceTraveled;

    public Contestant(String name, int speedMin, int speedMax){
        this.name = name;
        this.speedMin = speedMin;
        this.speedMax = speedMax;
        this.distanceTraveled = 0;
    }

    public void introduceYourself(){
        System.out.printf("My name is %s. I run with the speed of %d-%dkm /h. \n", this.name, this.speedMin, this.speedMax);
    }

    public void run(){
        distanceTraveled += (int)Math.floor(Math.random()*(this.speedMax-this.speedMin+1)+this.speedMin);
    }
}
