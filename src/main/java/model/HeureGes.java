package model;

import model.builder.HeureGesBuilder;

public class HeureGes {
    private int h;
    private int m;
    private int s;

    public HeureGes(HeureGesBuilder heureGesBuilder) {
        this.h = heureGesBuilder.getH();
        this.m = heureGesBuilder.getM();
        this.s = heureGesBuilder.getS();
    }

    public static HeureGesBuilder getBuilder(){
        return new HeureGesBuilder();
    }
}
