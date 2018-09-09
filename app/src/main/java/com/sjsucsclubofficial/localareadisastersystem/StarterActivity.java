package com.sjsucsclubofficial.localareadisastersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.view.View;

public class StarterActivity extends AppCompatActivity {

    private Switch canMove;
    private Switch locationSafe;
    private EditText numOfStable;
    private EditText numOfInjured;
    private Button submit;
    private boolean movable;
    private boolean safe;
    private int stable;
    private int injured;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        canMove= (Switch) findViewById(R.id.hasMobility);
        canMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                movable=true;
            }
        });

        locationSafe = (Switch) findViewById(R.id.badLocation);
        locationSafe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                safe=true;
            }
        });

        numOfStable = (EditText) findViewById(R.id.stable);
        numOfStable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    stable = Integer.parseInt(numOfStable.getText().toString());
                } catch (NumberFormatException e) {
                    Log.e("TODO: Fix Error", "Need to set placeholder to number: " + e);
                }
            }
        });

        numOfInjured=(EditText) findViewById(R.id.critical);
        numOfInjured.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    injured=Integer.parseInt(numOfInjured.getText().toString());
                } catch (NumberFormatException e) {
                    Log.e("TODO: Fix Error", "Need to set placeholder to number: " + e);
                }
            }
        });

        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //(DoThings.exe)

                Intent start=new Intent(StarterActivity.this,MapsActivity.class);
                startActivity(start);
            }
        });
    }
}