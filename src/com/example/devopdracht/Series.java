package com.example.devopdracht;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by lorenzo on 25-5-13.
 */
public class Series extends ListActivity {

    String lijstSeries[] = {"24", "11:14", "127 Hours", "1408", "16 Blocks", "2 Fast 2 Furious", "2001: A Space Odyssey", "21", "21 & Over", "21 Grams", "25th Hour", "28 Days Later", "28 Weeks Later", "3 Idiots", "30 Days of Night", "30 Days of Night: Dark Days"};
    static Datasaver saver = new Datasaver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Series.this, android.R.layout.simple_list_item_1, lijstSeries));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

       // saver.setClickedSerie(lijstSeries[position]);

        try{
            Class SerieNaam = Class.forName("com.example.devopdracht.Seriepagina");
            Intent toSerie = new Intent(Series.this, SerieNaam);
            startActivity(toSerie);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
   
  }


