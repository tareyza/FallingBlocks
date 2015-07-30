package com.jjapps.fallingblocks;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Game extends FragmentActivity {
    private static final String[] names = {"rect", "oval", "tri"};
    private Point size;
    private List<FallingShape> shapes = new ArrayList<>();
    private ShapeFactory shapeFactory;
    private View view;
    private Handler clock;
    private int shapeCounter = 0;

    private int period = 50;

    Runnable game = new Runnable(){
        @Override public void run(){
            update();
            clock.postDelayed(this, period);
        }
    };


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view = new View(this){
            @Override public void onDraw(Canvas canvas){
                for(int i = 0; i < shapes.size(); ++i){
                    FallingShape shape = shapes.get(i);
                    shape.render(canvas);
                    shape.setLocation(shape.getX(), shape.getY() + 10);
                    if(shape.getY() > size.y){
                        shapes.remove(i);
                        --i;
                        System.out.println("Shape destroyed");
                    }
                }
            }
        };
        final FragmentManager fm;//error from using fragments comes from fragment manager not initializing, still needs to be solved
        fm = getSupportFragmentManager();
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                System.out.println("touched");

                fm.beginTransaction().add(R.id.game_layout, fm.findFragmentById(R.id.pause_fragment)).commit();
                fm.findFragmentById(R.id.pause_fragment);
                return true;
            }
        });

        Display display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);
        shapeFactory = new DefaultShapeFactory(size.x, size.y);
        setContentView(view);

        shapes.clear();

        clock = new Handler();

        start();
    }

    void start() {
        game.run();
    }

    void stop() {
        clock.removeCallbacks(game);
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void update(){
        ++shapeCounter;
        if(shapeCounter == 10){
            shapeCounter = 0;
            FallingShape shape = shapeFactory.getShapeByName(names[(int)(Math.random() * 3)]);
            shapes.add(shape);
            System.out.println("Shape created");
        }
        view.invalidate();
    }
}

