package com.example.devopdracht;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageButton FilmButton = (ImageButton) findViewById(R.id.Filmbutton);
        FilmButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                Class filmClass = Class.forName("com.example.devopdracht.Films");
                Intent filmIntent = new Intent(MainActivity.this, filmClass);
                startActivity(filmIntent);
                }catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });

        final ImageButton SerieButton = (ImageButton) findViewById(R.id.Seriebutton);
        SerieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    Class serieClass = Class.forName("com.example.devopdracht.Series");
                    Intent serieIntent = new Intent(MainActivity.this, serieClass);
                    startActivity(serieIntent);
                }catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
