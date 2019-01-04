package com.company;

public class Runner {

    public static void main(String[] args) {
        Trail trail = new Trail();

        System.out.println(trail.isLevelTrailSegment(1,3));
        System.out.println(trail.isDifficult());
    }

}
