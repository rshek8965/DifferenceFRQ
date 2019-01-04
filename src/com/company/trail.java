package com.company;

public class trail {

    public boolean isLevelTrailSegment(int start, int end) {
        int min = this.markers[start];
        int max = this.markers[start];
        for (int i = start+1; i<=endd;i++) {
            if (min > this.markers[i]) {
                min = this.markers[i];
            }
            if (max < this.markers[i]) {
                max = this.markers[i];
            }
        }
        return ((max-min) <= 10);
    }

    public boolean isDifficult() {
        int numChanges = 0;
        for (int i = 0; i<this.markers.length-1; i++) {
            if (Math.abs(this.markers[i]-this.markers[i+1]) >= 30) {
                numChanges++;
            }
        }
        return (numChanges >= 3);
    }
}
