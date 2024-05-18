package model;

import model.builder.HeureGesBuilder;

public class HeureGes {
    private int id;
    private int h;
    private int m;
    private int s;

    public HeureGes(HeureGesBuilder heureGesBuilder) {
        this.id = heureGesBuilder.getId();
        this.h = heureGesBuilder.getH();
        this.m = heureGesBuilder.getM();
        this.s = heureGesBuilder.getS();
    }

    public static HeureGesBuilder getBuilder(){
        return new HeureGesBuilder();
    }
}
