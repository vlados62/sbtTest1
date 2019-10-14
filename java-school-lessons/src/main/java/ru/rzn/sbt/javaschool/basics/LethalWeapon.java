package ru.rzn.sbt.javaschool.basics;

import java.util.Objects;

public class LethalWeapon {
    public String color;
    private int roundsLeft;
    private Double power;
    private static long nextSerial = 0L;
    private final long serial;

    public LethalWeapon() {
        this.serial = nextSerial;
        nextSerial++;
    }

    public LethalWeapon(String color, Double power, int roundsLeft) {
        this();
        this.color = color;
        this.power = power;
        this.roundsLeft = roundsLeft;

    }

   /* @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        LethalWeapon lethalWeapon = (LethalWeapon)object;
        return this.color == lethalWeapon.color && this.power == lethalWeapon.power && this.roundsLeft == lethalWeapon.roundsLeft;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LethalWeapon that = (LethalWeapon) o;
        return roundsLeft == that.roundsLeft &&
                Objects.equals(color, that.color) &&
                Objects.equals(power, that.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, roundsLeft, power);
    }

    public long getSerial() {
        return this.serial;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public void reload(int q) {
        this.roundsLeft *= q;
    }

    public void pewPew() {
        this.roundsLeft -= 2;
    }
}
