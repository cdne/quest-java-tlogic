package com.codecool.quest.logic.actors;

import com.codecool.quest.logic.Cell;

public class Skeleton2 extends Actor {

    private int health = 15;
    private int strength = 6;

    public Skeleton2(Cell cell) {
        super(cell);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSkeletonHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String getTileName() {
        return "skeleton2";
    }
}
