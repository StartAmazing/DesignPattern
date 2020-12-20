package com.ll.designpattern.strategy.v2;

public abstract class Zombie {

    abstract public void display();
    MoveAble moveAble;
    AttackAble attackAble;

    abstract void move();
    abstract void attack();

    public Zombie() {
    }

    public Zombie(MoveAble moveAble, AttackAble attackAble) {
        this.moveAble = moveAble;
        this.attackAble = attackAble;
    }

    public MoveAble getMoveAble() {
        return moveAble;
    }

    public void setMoveAble(MoveAble moveAble) {
        this.moveAble = moveAble;
    }

    public AttackAble getAttackAble() {
        return attackAble;
    }

    public void setAttackAble(AttackAble attackAble) {
        this.attackAble = attackAble;
    }
}
