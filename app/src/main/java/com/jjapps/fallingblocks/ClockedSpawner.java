package com.jjapps.fallingblocks;

import android.support.annotation.NonNull;

/**
 *
 */
public class ClockedSpawner extends Spawner {

    private final int period;
    private int cycles;

    public ClockedSpawner(@NonNull IGameObjectFactory factory, int period) {
        super(factory);
        this.period = period;
    }

    @Override public IGameObject create() {
        if (cycles++ < period)
            return null;
        cycles = 0;
        return super.create();
    }

    @Override public String toString() {
        return super.toString() + String.format(" spawning a block every %f cycles", period);
    }
}