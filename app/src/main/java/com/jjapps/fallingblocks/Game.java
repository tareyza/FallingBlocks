package com.jjapps.fallingblocks;

import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.view.Display;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class Game extends FragmentActivity implements View.OnTouchListener{

    private static volatile Game instance;
    private Point size;

    private Game() {
    }

    public
    @NonNull
    Game getInstance() {
        if (instance == null) {
            synchronized (Game.class) {
                if (instance == null) {
                    instance = new Game();
                }
            }
        }
        return instance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Display display = getWindowManager().getDefaultDisplay();
        this.size = new Point();
        findViewById(R.id.game).setVisibility(View.INVISIBLE);
        findViewById(R.id.pause).setVisibility(View.VISIBLE);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public double getScreenWidth() {
        return size.x;
    }

    public double getScreenHeight() {
        return size.y;
    }


    public boolean onTouch(View v, MotionEvent event) {
        findViewById(R.id.game).setVisibility(View.VISIBLE);
        return true;
    }

}