package com.jjapps.fallingblocks;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
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


public class Game extends ActionBarActivity {
    FragmentManager fm = getFragmentManager();
    FragmentTransaction ft = getFragmentManager().beginTransaction();
    //Fragment pauseFrag = fm.findFragmentById(R.id.pause_fragment);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_game);

        //Fragment playFrag = fm.findFragmentById(R.id.play_fragment);

        /*playFrag.getView().findViewById(R.id.play_text).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                pauseFrag = fm.findFragmentById(R.id.pause_fragment);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                if (pauseFrag.isHidden()) {
                    ft.show(pauseFrag);
                    System.out.println("fragment was shown");
                } else {
                    ft.hide(pauseFrag);
                    System.out.println("fragment hidden");
                }
                ft.commit();
                return true;
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
