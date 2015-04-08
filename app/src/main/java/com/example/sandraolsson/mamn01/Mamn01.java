package com.example.sandraolsson.mamn01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Mamn01 extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamn01);
        Button b = (Button) findViewById(R.id.button_sandra);
       // b.setText("hejsan hoppsan");
        b.setOnClickListener(this);
        Log.d(this.getLocalClassName(), "Nu är onCreate färdig");

    }

    @Override
    public void onClick(View v) {
        Log.d(this.getLocalClassName(), "Click!, du är i onClick");
        startActivity(new Intent(this, CompassActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(getLocalClassName(), "Tillbaka! onResume");
    }
}
