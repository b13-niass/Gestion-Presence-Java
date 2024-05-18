package model.builder;

import model.HeureGes;

public class HeureGesBuilder {
    private int id;
    private int h;
    private int m;
    private int s;

    public int getId() {
        return id;
    }

    public HeureGesBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public int getH() {
        return h;
    }

    public HeureGesBuilder setH(int h) {
        this.h = h;
        return this;
    }

    public int getM() {
        return m;
    }

    public HeureGesBuilder setM(int m) {
        this.m = m;
        return this;
    }

    public int getS() {
        return s;
    }

    public HeureGesBuilder setS(int s) {
        this.s = s;
        return this;
    }

    public HeureGes build(){
        return new HeureGes(this);
    }
}
