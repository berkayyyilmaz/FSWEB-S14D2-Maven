package org.example.model;

import java.util.Arrays;

public class Room {
    private Wall[] walls;
    private Wall wall1,wall2,wall3,wall4;

    private Ceiling ceiling;
    private Lamp lamp;
    private Carpet carpet;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.carpet = carpet;
    }

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public Wall getWall1() {
        return wall1;
    }

    public void setWall1(Wall wall1) {
        this.wall1 = wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public void setWall2(Wall wall2) {
        this.wall2 = wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public void setWall3(Wall wall3) {
        this.wall3 = wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public void setWall4(Wall wall4) {
        this.wall4 = wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    @Override
    public String toString() {
        return "Room{" +
                "walls=" + Arrays.toString(walls) +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", ceiling=" + ceiling +
                ", lamp=" + lamp +
                ", carpet=" + carpet +
                '}';
    }
}

