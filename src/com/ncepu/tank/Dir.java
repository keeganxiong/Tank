package com.ncepu.tank;

import java.util.Random;

public enum Dir {
    L, U, R, D, STOP;

    private static Random r = new Random();

    public static Dir randomDir() {
        return Dir.values()[r.nextInt(Dir.values().length)];
    }
}
