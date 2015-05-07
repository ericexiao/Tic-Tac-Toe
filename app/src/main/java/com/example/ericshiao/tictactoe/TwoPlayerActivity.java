package com.example.ericshiao.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Eric on 1/1/2015.
 */
public class TwoPlayerActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);
        setTitle("Tic Tac Toe for Two");
        Button sameDevice = (Button) findViewById(R.id.sameDevice);
        Button online = (Button) findViewById(R.id.online);
        sameDevice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sameDeviceIntent = new Intent(TwoPlayerActivity.this, GameActivity.class);
                startActivity(sameDeviceIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
