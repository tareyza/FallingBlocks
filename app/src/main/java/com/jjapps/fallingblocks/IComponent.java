package com.jjapps.fallingblocks;

import android.support.annotation.NonNull;

/**
 *
 */
public interface IComponent {

    void update(@NonNull IWorld world, @NonNull IGameObject object);
}